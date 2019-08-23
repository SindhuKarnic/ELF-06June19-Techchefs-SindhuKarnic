import React, { Component } from 'react';
import Navbar from '../navbar/Navbar'
import './HomePage.css'
import Axios from 'axios'
import { withRouter } from 'react-router-dom'

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
class AdminSearch extends Component {
    constructor(props) {
        super(props)
        this.state = {
           user: [],
           isFound: true
        }
        this.searchedUsr = this.searchedUsr.bind(this);
    }
    componentDidMount() {
        this.searchedUsr();
    }
    searchedUsr() {
        let id = this.props.location.data;
        console.log("data"+id)
        if(id) {
            Axios.get('http://localhost/library/getUser?id='+id)
            .then((response)=>{
                console.log(response)
            if(response.data.statusCode === 201) {
                    //setstate
                let userData = response.data.beans.filter(item => item.userType !== 'admin')
                this.setState({
                    user: userData,
                    isFound: true
                }) 
            } else if(response.data.statusCode === 401){
                this.setState({
                   
                    isFound: false
                }) 
                //this.props.history.push('/')
                
            } else {
                this.pRef.current.style.visibility = "visible"
            }
                
            }).catch((error)=>{
                console.log(error)
            })
        }
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
                <div className="data-card">
                {this.state.isFound && 
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
                         

                    </table>
                </div>
                }
                {
                    !this.state.isFound && 
                    <h3>No Result</h3>
                }
                </div>
            </div>
        )
    }
}
export default withRouter(AdminSearch)