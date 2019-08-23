import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';
import TodoList from './Components/TodoList.jsx';
import TodoItems from './Components/TodoItems.jsx';
import CarosalApp from './Components/CarosalApp.jsx';
import Navbar from 'react-bootstrap/Navbar';
import Container from 'react-bootstrap/Container';
class App extends Component {
  inputElement = React.createRef()
  butn = React.createRef()
  constructor() {
    super()
    this.state = {
      items:[],
      currentItem : {text: '', key:''}
    };
    this.example = {
      exItem: "jsdghjd"
    }
  }
  handleInput = e => {
    console.log(this.example.exItem)
    if( this.inputElement.current.value === "") {
      this.inputElement.current.className = "beforeText";
    } else {
    this.inputElement.current.className = "afterText";
    }
  const itemText = e.target.value
  const currentItem = {text: itemText, key: Date.now()}
  this.setState({
    currentItem
  })
    console.log("hello")
  }
  addItem = e => {
    e.preventDefault();
    const newItem = this.state.currentItem
    if(newItem.text !== '') {
      const items = [...this.state.items, newItem]
      this.setState({
        items: items,
        currentItem: {text: '', key: ''}
      })
    }
    console.log("add")
  }
  deleteItem = key => {
   // e.preventDefault();
   console.log(key)
   const itemss = this.state.items
   var filtered = itemss.filter(function(value, index, arr){

    return value.key !== key;


});
this.setState({
  items: filtered,
  currentItem: {text: '', key: ''}
})
   
  }
  render() {
    return (
      <div>
        <Navbar fixed="top" expand="lg" variant="light" bg="light">
          <Container>
            <h2>Welcome</h2>
            <span>Sign In</span>
            <span>Log In</span>
            
          </Container>
        </Navbar>
        <CarosalApp></CarosalApp>
        <Navbar fixed="bottom" expand="lg" variant="light" bg="light">
          <Container>
            <Navbar.Brand href="#"><i class="fa fa-copyright" aria-hidden="false"></i> copyright 2019 <i class="fas fa-copyright"></i></Navbar.Brand>
          </Container>
        </Navbar>
        </div>
      );
    }
}

export default App;


{/* <div className="App">
     <h1>welcome</h1>
     <TodoList addItem={this.addItem} inputElement={this.inputElement} handleInput={this.handleInput} currentItem={this.state.currentItem} sendCrap = {this.example}></TodoList>
     <TodoItems entries={this.state.items} del={this.deleteItem}></TodoItems>
    </div> */}