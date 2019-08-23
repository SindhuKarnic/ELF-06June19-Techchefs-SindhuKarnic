import React, { Component } from 'react'
import Axios from 'axios';
import {Modal, Button} from 'react-bootstrap'
export class ViewAccounts extends Component {
    constructor(props) {
        super(props)
        this.state = {
            accounts: [],
            show: false,
            name:'',
            email:'',
            phoneno:'',
            password:'',
            id:''
        }
    }
    componentDidMount() {

        Axios.get('https://employee-app-3a762.firebaseio.com/accounts.json').then((response)=>{
            console.log(response)
            let fetchedAcc = [];
            for(let key in response.data) {
                fetchedAcc.push({
                    ...response.data[key],
                    id: key
                })
                console.log(response.data[key])
            }
            this.setState({
                accounts : fetchedAcc
            })
        }).catch((err) => {
            console.log(err)
        })
    }
    deleteAcc(account) {
        Axios.delete('https://employee-app-3a762.firebaseio.com/accounts/'+account.id+'/.json').then((response)=>{
            let allAcc = this.state.accounts;
            let index = allAcc.indexOf(account)
            let newAcc= allAcc.splice(index,1)
            console.log("all acc",allAcc)
            console.log("all acc",newAcc)
            this.setState({
                accounts: allAcc
            })

        console.log("deleted")
        }).catch((error)=>{
            console.log("error")
        })
    }
    updateAcc(account) {
        
        this.setState({
            show:!this.state.show,
            name:account.name,
            email: account.email,
            phoneno:account.phoneno,
            password:account.password,
            id: account.id
        })
    }
    handleClose() {
        this.setState({
            show:!this.state.show
        })
    }
    updateData() {
        const {id,name,email,password,phoneno} = this.state
        const acc = {name,email,password,phoneno}
        Axios.put('https://employee-app-3a762.firebaseio.com/accounts/'+id+'/.json', acc).then((response)=>{
            console.log("updated", response)
            this.handleClose();
            //refresh ui
            this.setState({
                name:name,
                email: email,
                phoneno:phoneno,
                password:password,
            })
            
        }).catch((err)=>{
            console.log("error")
        })
    }
    render() {
        return (
            <div>
                <table className="table table-striped">
                        <thead>
                            <tr>
                            <th scope="col">Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Phone</th>
                            <th scope="col">Password</th>
                            </tr>
                        </thead>
                        <tbody>
                            { 
                                this.state.accounts.map((account)=> {
                                return  <tr key={account.id}>
                                            <th scope="row">{account.name}</th>
                                            <td>{account.email}</td>
                                            <td>{account.phoneno}</td>
                                            <td>{account.password}</td>
                                            <button className='btn btn-danger' onClick={this.deleteAcc.bind(this, account)}>Delete</button>
                                            <button className='btn btn-success' onClick={this.updateAcc.bind(this, account)}>Edit</button>
                                        </tr>
                                })
                            }
                        
                        </tbody>
                </table>
                <div>
                    
                    <Modal show={this.state.show} onHide={this.handleClose.bind(this)}>
                        <Modal.Header closeButton>
                        <Modal.Title>Edit</Modal.Title>
                        </Modal.Header>
                        <Modal.Body>
                            <div className="row">
                                <div className="col">
                                    <input type="text" onChange={(event)=>{
                                    this.setState({
                                    name:event.target.value
                                    })
                                    }} value={this.state.name} className="form-control" placeholder="Name"/>
                                </div>
                                <div className="col">
                                    <input type="text"  onChange={(event)=>{
                                    this.setState({
                                    email:event.target.value
                                    })
                                    }}  value={this.state.email} className="form-control" placeholder="Email"/>
                                </div>
                            </div>
                            <div className="row">
                                <div className="col">
                                    <input type="number" onChange={(event)=>{
                                    this.setState({
                                    phoneno:event.target.value
                                    })
                                    }} value={this.state.phoneno} className="form-control" placeholder="Phone"/>
                                </div>
                                <div className="col">
                                    <input type="password" onChange={(event)=>{
                                    this.setState({
                                    password:event.target.value
                                    })
                                    }} value={this.state.password} className="form-control" placeholder="Password"/>
                                </div>
                            </div>
                        </Modal.Body>
                        <Modal.Footer>
                        <Button variant="secondary" onClick={this.handleClose.bind(this)}>
                            Close
                        </Button>
                        <Button variant="primary" onClick={this.updateData.bind(this)}>
                            Save Changes
                        </Button>
                        </Modal.Footer>
                    </Modal>
                </div>
            </div>
        )
    }
}

export default ViewAccounts
