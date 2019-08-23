import React, { Component } from 'react'
import Axios from 'axios'
export class CreateAccount extends Component {
    constructor(props) {
        super(props)
        this.pRef = React.createRef();
        this.state = {
            name:'',
            email:'',
            phoneno:'',
            password:''
        }
        this.valid = false;
        this.error = "mandatory";
        this.postData = this.postData.bind(this)
    }
    postData(event) {
        event.preventDefault();
        //console.log('post data', this.state);
        let accountdata = this.state;
        if(this.valid) {
            Axios.post('https://employee-app-3a762.firebaseio.com/accounts.json',accountdata).then((response)=>{
                console.log(response)
                this.setState({
                    name:'',
                    email:'',
                    phoneno:'',
                    password:''
                })
            }).catch((error)=>{
                console.log(error)
            })
        } else {
            
        }
    }
    validate() {
        console.log(this.pRef)
        if(this.state.name.trim() !== '' && this.state.email.trim() !== '' && this.state.phoneno.length === 10 && this.state.password.trim() !== '') {
            var emailRe = /\S+@\S+\.\S+/;
            var passwordRe= /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})/;
            if(emailRe.test(this.state.email) && passwordRe.test(this.state.password)) {
                this.pRef.current.style.visibility = "hidden"
                this.valid = true;
            } else {
                this.error = "Please provide valid email and password"
                this.pRef.current.style.visibility = "visible"
                
                this.valid = false;
            }
        } else {
            this.error = "All fields are mandatory and phone num should be 10 digits"
            this.pRef.current.style.visibility = "visible"
            
            this.valid = false;
        }
    }
    render() {
        return (
            <div>
                <form onSubmit={this.postData}>
                    <div className="row">
                        <div className="col">
                        <input type="text" onChange={(event)=>{
                            this.setState({
                                name:event.target.value
                            })
                            }} value={this.state.name} className="form-control" placeholder="Name"/>
                    </div>
                    <div className="col">
                        <input type="text"  onChange={(event)=>{
                            this.setState({
                                email:event.target.value
                            })
                            }}  value={this.state.email} className="form-control" placeholder="Email"/>
                    </div>
                    </div>
                    <div className="row">
                        <div className="col">
                        <input type="number" onChange={(event)=>{
                            this.setState({
                                phoneno:event.target.value
                            })
                            }} value={this.state.phoneno} className="form-control" placeholder="Phone"/>
                    </div>
                    <div className="col">
                        <input type="password" onChange={(event)=>{
                            this.setState({
                                password:event.target.value
                            })
                            }} value={this.state.password} className="form-control" placeholder="Password"/>
                    </div>
                    </div>
                    <button className= 'btn btn-success' type='submit' onClick={this.validate.bind(this)}>create</button>
                </form>
                <p ref={this.pRef} style={{color:'red', visibility:'hidden'}}>{this.error}</p>
            </div>
        )
    }
}

export default CreateAccount
