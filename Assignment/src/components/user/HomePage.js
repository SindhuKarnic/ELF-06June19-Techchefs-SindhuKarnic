import React, { Component } from 'react';
import Navbar from '../navbar/Navbar'

class UserHome extends Component {
    constructor(props) {
        super(props)
    }
    render() {
       return (
            <div>
                <Navbar/>
                <h2>User home</h2>
            </div>
        )
    }
}
export default UserHome