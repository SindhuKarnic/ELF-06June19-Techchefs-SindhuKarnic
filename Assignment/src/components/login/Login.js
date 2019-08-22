import React, { Component } from 'react';
import Form from 'react-bootstrap/Form'
import {Button} from 'react-bootstrap'
import './Login.css'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios'

export class Login extends Component {
    constructor(props) {
        super(props)

        this.state = {
            email:'',         
            password:'',
            userType: 'admin'
        }
        this.pRef = React.createRef();
        this.error = "Login failed"
      
    }
    login(event) {
        event.preventDefault();
        // if(this.state.userType === "admin") {
        //         this.props.history.push('/adminhome')
        //     } else if(this.state.userType === "user") {
        //         this.props.history.push('/userhome')
        //     } else {
        //         //this.props.history.push('/home')
        //     }

        Axios.post('http://localhost/login/loginPage',null,
        //Axios.post('http://10.10.13.101/login/loginPage',null,
        {
            params: {
                email: this.state.email,
                password:this.state.password
            }
       }
        ).then((response)=>{
            console.log(response.data.message)
           if(response.data.message === 'Success') {
                sessionStorage.setItem('userId', response.data.beans[0].userId);
                sessionStorage.setItem('userType', response.data.beans[0].userType);
                if(response.data.beans[0].userType === "admin") {
                    this.props.history.push('/adminhome')
                } else if(response.data.beans[0].userType === "user") {
                    this.props.history.push('/user')
                } else {
                    //this.props.history.push('/home')
                }

                
              
           } else {
                this.pRef.current.style.visibility = "visible"
           }
            
        }).catch((error)=>{
            console.log(error)
        })
    }
        render() {
            return (
                <div className="bg-image">
                     <div className="container" style={{ marginLeft:'31%'}}>
                        <div className="login-card">
                            <Form className="form-width">
                                <Form.Group controlId="formBasicEmail">
                                    
                                    <Form.Control className="input-width" type="email" placeholder="Enter Id" onChange={(event)=>{
                                        this.setState({
                                            email:event.target.value
                                        })
                                        }} value={this.state.email} />
                                </Form.Group>

                                <Form.Group controlId="formBasicPassword">
                                
                                    <Form.Control  className="input-width" type="password" placeholder="Password" onChange={(event)=>{
                                        this.setState({
                                            password:event.target.value
                                        })
                                    }} value={this.state.password} />
                                </Form.Group>
                                
                                <Button className="submit-button" variant="primary" type="submit" onClick={this.login.bind(this)}>
                                    Submit
                                </Button>
                            </Form>
                            
                            <div style={{marginTop:'1%',paddingLeft:'9%', paddingBottom:'9%'}}>
                                
                                <Button variant="primary" type="submit" className="submit-button">
                                    Forgot Password
                                </Button>
                            </div>
                        </div>
                        <p ref={this.pRef} style={{color:'red', visibility:'hidden'}}>{this.error}</p>
                    
                    </div>
                    
                </div>
                
                )
            }
            
        }
        
 export default Login