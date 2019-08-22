import React, { Component } from 'react';
import Navbar from '../navbar/Navbar'
import Form from 'react-bootstrap/Form'
import {Button} from 'react-bootstrap'
import Login from '../login/Login'
import './HomePage.css'
import Axios from 'axios'

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
class AdminHome extends Component {
    constructor(props) {
        super(props)
        this.state = {
           user: []
        }
        this.getUser = this.getUser.bind(this);
    }
    componentDidMount() {
        this.getUser();
    }
    getUser() {
        Axios.get('http://localhost/library/getAllUser')
        .then((response)=>{
            console.log(response.data.message)
           if(response.data.statusCode === 201) {
                 //setstate
               this.setState({
                   user: response.data.beans
               })
                // if(response.data.beans[0].userType === "admin") {
                //     this.props.history.push('/adminhome')
                // } else if(response.data.beans[0].userType === "user") {
                //     this.props.history.push('/user')
                // } else {
                //     //this.props.history.push('/home')
                // }

                
              
           } else if(response.data.statusCode === 501){
            //this.props.history.push('/')
               
           } else {
            this.pRef.current.style.visibility = "visible"
           }
            
        }).catch((error)=>{
            console.log(error)
        })
    }
    delete(uid) {
        Axios.delete('http://localhost/library/deleteUser?id='+uid)
        .then((response)=>{
            console.log(response.data.message)
           if(response.data.statusCode === 201) {
                 //setstate
                 this.getUser();
               
           } else if(response.data.statusCode === 501){
            //this.props.history.push('/')
               
           } else {
            this.pRef.current.style.visibility = "visible"
           }
            
        }).catch((error)=>{
            console.log(error)
        })
      
        // setstate
    }
    render() {
       return (
            <div>
                <Navbar/>
                <Link className= "add-user" to="/createuser" >+Add User</Link>
                <div className="user-details">
                    <table>
                        <tr>
                            <th>User Name</th>
                        </tr>
                         { this.state.user.map(item =>  {
                                return (
                                    <tr>
                                    <td className="user-name">
                                       {item.userName}
                                    </td>
                                    <td className='user-action'>
                                        <Link className="user-update" to={{
                                                                            pathname: "/createuser",
                                                                            data: item
                                                                        }}>Update</Link>  
                                    </td>
                                    <td className='user-action'>
                                        <Link onClick={() => this.delete(item.userId)} className="user-update">Delete</Link>  
                                    </td>
                                </tr>  
                                )
                            }) 
                        } 
                         {/* <tr>
                                    <td className="user-name">
                                       abc
                                    </td>
                                    <td className='user-action'>
                                        <Link className="user-update" to={{
                                                                            pathname: "/createuser",
                                                                            data: {name:"abc",id:1} 
                                                                        }}>Update</Link>  
                                    </td>
                                    <td className='user-action'>
                                        {/* <Link onClick={() => this.delete(item.id)} className="user-update">Delete</Link> 
                                    </td>
                                </tr>   */}

                    </table>
                </div>
            </div>
        )
    }
}
export default AdminHome