import React, { Component } from 'react'
import Axios from 'axios'
import Form from 'react-bootstrap/Form'
import NavbarHeader from '../navbar/Navbar'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import './HomePage.css'

export class HomePage extends Component {
    constructor(props) {
        super(props)
        if(location.pathname.search("id")!== -1) {

        }
        this.state = JSON.parse(sessionStorage.getItem('user'))
       
    }

    render() {
        return (
            <div>
                <NavbarHeader/> 
                <div class= "employee-info container">
                    <div class="data-display">ID: {this.state.id} </div>
                    <div class="data-display">Name: {this.state.name}</div>
                    <div class="data-display">Account Number: {this.state.accountNumber} </div>
                    <div class="data-display">Email Id: {this.state.email}</div>
                    <div class="data-display">Age: {this.state.age}</div>
                    <div class="data-display">Designation: {this.state.designation}</div>
                    <div class="data-display">Department Id: {this.state.departmentId}</div>
                    {/* <div class="data-display">Manager Id:  {this.state.id}</div> */}
                    <div class="data-display">Phone:  {this.state.phone}</div>
                    <div class="data-display">Gender:  {this.state.gender}</div>
                    <div class="data-display">Date of birth:  {this.state.dob}</div>
                    <div class="data-display">Date of Joining:{this.state.joiningDate}</div>
                    <div class="data-display">Salary: {this.state.salary}</div>
                    <hr/>
                    {/* {
                       
                            this.state.otherInfo.map(item =>  {
                                return (
                                    <div class="data-display">PAN: {item.pan}</div>
                                )
                            }) 
                            
                        
                    } */}
                    {/* <div class="data-display">PAN: {this.state.other-info.pan}</div>
                    <div class="data-display">Adhar no:  {this.state.other-info.adhar}</div>
                    <div class="data-display">Passport No:  {this.state.other-info.passport}</div>
                    <div class="data-display">Blood group:  {this.state.other-info.bloodGroup}</div>
                    <div class="data-display">Mothers Name: {this.state.other-info.motherNm}</div>
                    <div class="data-display">Fathers Name: {this.state.other-info.fatherNm}</div>
                    <div class="data-display">Religion:  {this.state.other-info.religion}</div>
                    <div class="data-display">Nationality:  {this.state.other-info.nationality}</div>
                    <div class="data-display">Is Married:  {this.state.other-info.ismarried}</div>
                    <div class="data-display">Spouse Name:  {this.state.other-info.spouseNm}</div>
                    <div class="data-display">Is Challenged:  {this.state.other-info.ischallenged}</div>
                    <div class="data-display">Emergency contact Name:  {this.state.other-info.emergencyContactName}</div>
                    <div class="data-display">Emergency contact number:  {this.state.other-info.emergencyContactNumber}</div> */}
                    
                    
                </div>
               
            </div>
        )
    }
}

export default HomePage
