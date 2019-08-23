import React, {Component} from 'react';
import './Todo.css';

import BootstrapComponent from './BootstrapComponent.jsx';
class TodoList extends Component {
    constructor() {
        super()
        this.state = {
            color: 'green'
        }
    }
    componentDidUpdate() {
        this.props.inputElement.current.focus()
    }
    changeColor = () => {
        this.setState({
            color: 'red'
        })
    }
  render() {
    return (
    <div className="todolist">
        <div className="header">
            <form onSubmit={this.props.addItem}>
                <input style= {{ backgroundColor: this.state.color }} placeholder="Task" ref={this.props.inputElement} value={this.props.currentItem.text}  onChange={this.changeColor} onChange={this.props.handleInput}/>
                <button ref={this.props.btn} type="submit"> Add task</button>
            </form>
            <h3>
                {this.props.sendCrap.exItem}
            </h3>
            <BootstrapComponent></BootstrapComponent>
           
        </div>
    </div>
        );
    }
}

export default TodoList;
