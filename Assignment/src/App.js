import React from 'react';
import './App.css'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Login from './components/login/Login'
import Navbar  from './components/navbar/Navbar'
import AdminHome from './components/admin/HomePage'
import user from './components/user/HomePage'
import createuser from './components/admin/CreateUser'
import adminsearch from  './components/admin/Search'

function App() {
  return (
    <Router>
          <Route exact path='/' component={Login}></Route>
          <Route  path='/adminhome' component={AdminHome}></Route>
          <Route  path='/userhome' component={user}></Route>
          <Route  path='/createuser' component={createuser}></Route>
          <Route  path='/adminsearch' component={adminsearch}></Route>
        </Router>
     //<Login/>
    //<Navbar/>
    
  );
}

export default App;
