import React, { Component } from 'react'
import Axios from 'axios'


import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import { withRouter } from 'react-router-dom'
import HomePage from '../homePage/HomePage'
import {Button} from 'react-bootstrap'

export class NavbarHeader extends Component {
    constructor(props) {
        super(props)
       
       
       
    }
    logout() {
        Axios.get('http://localhost/emp-springrest/login/logoutSubmit')
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
              <h2 style={{marginLeft:'40%'}}>Employee Management</h2>
            
                    <div>
                        <nav class="navbar navbar-expand-lg navbar-light bg-light">
                            <Link class="navbar-brand" to="/home">Profile</Link>
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>

                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <ul class="navbar-nav mr-auto">
                                    <li class="nav-item active">
                                        <Link class="nav-link" to="/">Edit <span class="sr-only">(current)</span></Link>
                                    </li> 
                                    <li class="nav-item">
                                            <Button variant="light"  onClick={this.logout.bind(this)}>Logout</Button>
                                    </li>                                   
                                </ul>
                                <form class="form-inline my-2 my-lg-0">
                                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search"/>
                                    <Link class="btn btn-outline-success my-2 my-sm-0" type="submit" to="../Search/Search">Search</Link>
                                </form>
                                
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

export default withRouter(NavbarHeader)
