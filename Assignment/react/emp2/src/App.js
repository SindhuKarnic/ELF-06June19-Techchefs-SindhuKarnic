import React from 'react';
import Login from './components/login/Login';
import HomePage from './components/homePage/HomePage'

import { BrowserRouter as Router, Route, Link } from 'react-router-dom'

function App() {
  return (
    <div className="App">
      {/* <Login/> 
      <NavbarHeader/> 
       */}
       <Router>
          <Route exact path='/' component={Login}></Route>
          <Route  path='/home' component={HomePage}></Route>
        </Router>
    </div>
  );
}

export default App;
