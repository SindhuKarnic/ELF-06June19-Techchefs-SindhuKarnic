import React, { Component } from 'react';
import Navbar from '../navbar/Navbar'
import Form from 'react-bootstrap/Form'
import {Button} from 'react-bootstrap'
import Login from '../login/Login'
import './HomePage.css'
import './CreateUser.css'

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
class CreateUser extends Component {
    constructor(props) {
        super(props)
        this.state = {
           id:'',
           name:'',
           password:'',
           address:'',
           phone:'',
           email:'',
           userType:'',
           isUpdate: false
           
        }
    }
    componentDidMount() {
        let data = this.props.location.data;
       
        this.setState({
            id: data && data.userId ? data.userId : '',
           name: data && data.userName ? data.userName : '',
           password:data && data.password ? data.password : '',
           address:data && data.address ? data.address : '',
           phone:data && data.phoneNo ? data.phoneNo : '',
           email:data && data.email ? data.email : '',
           userType:data && data.userId ? data.userType : '',
           isUpdate: data ? true : false
        })
       
    }
    create() {
        if(this.state.isUpdate) {
            Axios.put('http://localhost/library/updateUser', this.state)
            .then((response)=>{
                console.log(response.data.message)
               if(response.data.statusCode === 201) {
                this.props.history.push('/')
                   
               } else if(response.data.statusCode === 501){
                //this.props.history.push('/')
                   
               } else {
                this.pRef.current.style.visibility = "visible"
               }
                
            }).catch((error)=>{
                console.log(error)
            })
          
        } else {
            Axios.post('http://localhost/library/createUser', this.state)
            .then((response)=>{
                console.log(response.data.message)
               if(response.data.statusCode === 201) {
                this.props.history.push('/')
                   
               } else if(response.data.statusCode === 501){
                //this.props.history.push('/')
                   
               } else {
                this.pRef.current.style.visibility = "visible"
               }
                
            }).catch((error)=>{
                console.log(error)
            })
          
        }
        //api call to delete
        // setstate
    }
    render() {
       return (
            <div>
                <Navbar/>
                <h2 className="header-pos">Add user Details</h2>
                <div className="add-det">
                <Form>
                    <Form.Group controlId="formBasicEmail">
                        <Form.Control className="input-width" type="text" placeholder="User Id" onChange={(event)=>{
                            this.setState({
                                id:event.target.value
                            })
                            }} value={this.state.id} />
                    </Form.Group>
                    <Form.Group controlId="formBasicEmail">
                        <Form.Control className="input-width" type="text" placeholder="User Name" onChange={(event)=>{
                            this.setState({
                                name:event.target.value
                            })
                            }} value={this.state.name} />
                    </Form.Group>

                    <Form.Group controlId="formBasicPassword">
                        
                        <Form.Control  className="input-width" type="password" placeholder="Password" onChange={(event)=>{
                            this.setState({
                                password:event.target.value
                            })
                        }} value={this.state.password} />
                    </Form.Group>
                    <Form.Group controlId="formBasicEmail">
                        <Form.Control className="input-width" type="text" placeholder="User Id" onChange={(event)=>{
                            this.setState({
                                address:event.target.value
                            })
                            }} value={this.state.address} />
                    </Form.Group>
                    <Form.Group controlId="formBasicEmail">
                        <Form.Control className="input-width" type="number" placeholder="User Id" onChange={(event)=>{
                            this.setState({
                                phone:event.target.value
                            })
                            }} value={this.state.phone} />
                    </Form.Group>
                    <Form.Group controlId="formBasicEmail">
                        <Form.Control className="input-width" type="email" placeholder="User Id" onChange={(event)=>{
                            this.setState({
                                email:event.target.value
                            })
                            }} value={this.state.email} />
                    </Form.Group>
                    <Form.Group controlId="formBasicEmail">
                        <Form.Control className="input-width" type="text" placeholder="User Id" onChange={(event)=>{
                            this.setState({
                                userType:event.target.value
                            })
                            }} value={this.state.userType} />
                    </Form.Group>
                    <Button className="submit-button" variant="primary" type="submit" onClick={this.create.bind(this)}>
                        Submit
                    </Button>
                </Form>
                </div>
            </div>
        )
    }
}
export default CreateUser