import React, { Component } from 'react'
import Axios from 'axios'

import Form from 'react-bootstrap/Form'
import {Button} from 'react-bootstrap'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import { withRouter } from 'react-router-dom'
import './Navbar.css'

export class Navbar extends Component {
    constructor(props) {
        super(props)
       
    }
    logout() {
        Axios.get('http://localhost/login/logoutsubmit')
        .then((response)=>{
            console.log(response.data.message)
           if(response.data.message === 'Success') {
               this.props.history.push('/')
           }
        }).catch((error)=>{
            console.log(error)
        })
    }

    render() {
        return (
            <div>
             
            
                    <div>
                        <nav class="navbar navbar-expand-lg navbar-light bg-header">
                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <ul class="navbar-nav mr-auto container">
                                    <li class="nav-item active search">
                                        <Form>
                                            <Form.Group controlId="formBasicEmail">
                                                <Form.Control type="text" placeholder="Search"/>
                                            </Form.Group>
                                        </Form>
                                    </li>
                                    <li class="nav-item active heading">
                                        <h2 className="heading-color">Library Management System</h2>                                                                                        
                                    </li>     
                                    <li class="nav-item">
                                        <Button variant="light" className="logout heading-color" onClick={this.logout.bind(this)}>Logout</Button>    
                                    </li>                          
                                </ul>
                                    {/* <form class="form-inline my-2 my-lg-0">
                                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"/>
                                        <Link class="btn btn-outline-success my-2 my-sm-0" type="submit" to="../Search/Search">Search</Link>
                                    </form> */}
                                    
                                </div>
                        </nav>

                        {/* <Route path='/CreateEmp/Employee/info' component={info}></Route> */}
                        {/* <Route path='/home' component={HomePage}></Route> */}
                        {/* <Route path='/Search/Search' component={Search}></Route> */}

                    </div>
            </div>
        )
    }
}

export default withRouter(Navbar)
