import React, { Component } from 'react'
import Axios from 'axios'
import Form from 'react-bootstrap/Form'
import {Button} from 'react-bootstrap'
import HomePage from '../homePage/HomePage'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'


export class Login extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id:'',         
            password:''
        }
        
        this.pRef = React.createRef();
        this.error = "Login failed"
      
    }
    login(event) {
        event.preventDefault();
        Axios.post('http://localhost/emp-springrest/login/authenticate',null,
        {
            params: {
                id: this.state.id,
                password:this.state.password
            }
       }
        ).then((response)=>{
            console.log(response.data.message)
           if(response.data.message === 'Success') {
            sessionStorage.setItem('user', JSON.stringify(response.data.beans[0]));
               this.props.history.push('/home')
              
           } else {
                this.pRef.current.style.visibility = "visible"
           }
            
        }).catch((error)=>{
            console.log(error)
        })
    }
   
    render() {
        return (
            <div className="container" style={{marginTop:'10%', width:'40%'}}>
                <Form>
                    <Form.Group controlId="formBasicEmail">
                        <Form.Label>ID</Form.Label>
                        <Form.Control type="number" placeholder="Enter Id" onChange={(event)=>{
                            this.setState({
                                id:event.target.value
                            })
                            }} value={this.state.id} />
                    </Form.Group>

                    <Form.Group controlId="formBasicPassword">
                        <Form.Label>Password</Form.Label>
                        <Form.Control type="password" placeholder="Password" onChange={(event)=>{
                            this.setState({
                                password:event.target.value
                            })
                        }} value={this.state.password} />
                    </Form.Group>
                    
                    <Button variant="primary" type="submit" onClick={this.login.bind(this)}>
                        Submit
                    </Button>
                </Form>
                <div style={{marginTop:'1%'}}>
                    <Button variant="primary" type="submit">
                            Create Account
                    </Button>
                    <Button variant="primary" type="submit" style={{marginLeft:'1%'}}>
                        Forgot Password
                    </Button>
                </div>
                <p ref={this.pRef} style={{color:'red', visibility:'hidden'}}>{this.error}</p>
              
            </div>
        )
    }
}

export default Login
