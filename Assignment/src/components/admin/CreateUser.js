import React, { Component } from 'react';
import Navbar from '../navbar/Navbar'
import Form from 'react-bootstrap/Form'
import {Button} from 'react-bootstrap'
import Login from '../login/Login'
import './HomePage.css'
import './CreateUser.css'
import Axios from 'axios'
import Alert from 'react-bootstrap/Alert'

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
class CreateUser extends Component {
    constructor(props) {
        super(props)
        this.state = {
           userId:'',
           userName:'',
           password:'',
           address:'',
           phoneNo:'',
           email:'',
           userType:'',
           isUpdate: false,
           isSuccess: false,
           isNotValid: false
           
        }
    }
    componentDidMount() {
        let data = this.props.location.data;
       
        this.setState({
            userId: data && data.userId ? data.userId : '',
            userName: data && data.userName ? data.userName : '',
           password:data && data.password ? data.password : '',
           address:data && data.address ? data.address : '',
           phoneNo:data && data.phoneNo ? data.phoneNo : '',
           email:data && data.email ? data.email : '',
           userType:data && data.userId ? data.userType : '',
           isUpdate: data ? true : false
           
        })
       
    }
    create(e) {
        e.preventDefault();
        if(this.state.userId !== '' && this.state.password !== '' && this.state.email !== ''&& this.state.userType !== '') {
            this.setState({
               
                isNotValid: false
               })
        
        if(this.state.isUpdate) {
            Axios.put('http://localhost/library/updateUser', this.state)
            .then((response)=>{
                console.log(response.data.message)
               if(response.data.statusCode === 201) {
                   this.setState({
                    isSuccess: true
                   
                   })
                   setTimeout(() => {this.props.history.push('/adminhome')},3000)
                //this.props.history.push('/adminhome')
                   
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
               // this.props.history.push('/adminhome')
               this.setState({
                isSuccess: true
               })
               setTimeout(() => {this.props.history.push('/adminhome')},3000)
               } else if(response.data.statusCode === 501){
                //this.props.history.push('/')
                   
               } else {
                this.pRef.current.style.visibility = "visible"
               }
                
            }).catch((error)=>{
                console.log(error)
            })
          
        }
    } else {
        this.setState({
               
            isNotValid: true
           })
    }
        //api call to delete
        // setstate
    }
    render() {
       return (
            <div>
                <Navbar/>
                <div className="user-card">
                    <h2 className="header-pos">Add user Details</h2>
                    <div className="add-det">
                    <Form style={{paddingBottom: '3%'}}>
                        <Form.Group controlId="formBasicEmail">
                            <Form.Control className="input-width" type="text" placeholder="User Id" required onChange={(event)=>{
                                this.setState({
                                    userId:event.target.value
                                })
                                }} value={this.state.userId} />
                        </Form.Group>
                        <Form.Group controlId="formBasicEmail">
                            <Form.Control className="input-width" type="text" placeholder="User Name" onChange={(event)=>{
                                this.setState({
                                    userName:event.target.value
                                })
                                }} value={this.state.userName} />
                        </Form.Group>

                        <Form.Group controlId="formBasicPassword">
                            
                            <Form.Control  className="input-width" type="password" placeholder="Password" required onChange={(event)=>{
                                this.setState({
                                    password:event.target.value
                                })
                            }} value={this.state.password} />
                        </Form.Group>
                        <Form.Group controlId="formBasicEmail">
                            <Form.Control className="input-width" type="text" placeholder="Address" onChange={(event)=>{
                                this.setState({
                                    address:event.target.value
                                })
                                }} value={this.state.address} />
                        </Form.Group>
                        <Form.Group controlId="formBasicEmail">
                            <Form.Control className="input-width" type="number" placeholder="Phone No" onChange={(event)=>{
                                this.setState({
                                    phoneNo:event.target.value
                                })
                                }} value={this.state.phoneNo} />
                        </Form.Group>
                        <Form.Group controlId="formBasicEmail">
                            <Form.Control className="input-width" type="email" placeholder="Email Id" required onChange={(event)=>{
                                this.setState({
                                    email:event.target.value
                                })
                                }} value={this.state.email} />
                        </Form.Group>
                        <Form.Group controlId="formBasicEmail">
                            <Form.Control className="input-width" type="text" placeholder="User Type" onChange={(event)=>{
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
                {
                        this.state.isSuccess && 
                        <Alert className="alert-position" variant="success" onClose={() => this.setState({isSuccess: false})} dismissible>
                            User added successfully
                        </Alert>
                    }
                     {
                        this.state.isNotValid && 
                        <Alert className="alert-position" variant="danger" onClose={() => this.setState({isSuccess: false})} dismissible>
                            Add user details
                        </Alert>
                    }
            </div>
        )
    }
}
export default CreateUser