class Lifecycle extends React.Component {
    constructor(props) {
        super(props)
        console.log('cons')
        this.state = {
            name: 'aaa',
            checked:true
        }
    }
    static getDerivedStateFromProps() {
        console.log('getDerivedStateFromProps')
        return null;
    }
    render() {
        console.log('render')
        if(this.state.checked){
            return(
                // <div>
                //     <h1>{this.state.name}</h1>
                //     <button onClick={this.changeName.bind(this)}>change</button>
                // </div>
                <Child/>
            )
        } else {
            return <h1>checked is false</h1>
        }
    }
    componentDidMount() {
        console.log('componentDidMount')
    }
    shouldComponentUpdate() {
        console.log('shouldComponentUpdate')
        return true
    }
    getSnapshotBeforeUpdate(){
        console.log('getSnapshotBeforeUpdate')
        return null
    }
    componentDidUpdate(props,state,snapshot) {
        console.log('componentDidUpdate')
    }
    changeName() {
        console.log('change')
        this.setState({
            name: 'ggg'
        })
    }

}
class Child extends React.Component {
    constructor(props) {
        super(props)
        console.log('cons')
        this.state = {
            name: 'aaa',
            checked:true
        }
    }
    static getDerivedStateFromProps() {
        console.log('getDerivedStateFromProps')
        return null;
    }
    render() {
        console.log('render ch')
        if(this.state.checked){
            return(
               <h1>child</h1>
            )
        } else {
            return <h1>checked is false</h1>
        }
    }
    componentDidMount() {
        console.log('componentDidMount child')
    }
    shouldComponentUpdate() {
        console.log('shouldComponentUpdate')
        return true
    }
    getSnapshotBeforeUpdate(){
        console.log('getSnapshotBeforeUpdate')
        return null
    }
    componentDidUpdate(props,state,snapshot) {
        console.log('componentDidUpdate child')
    }
    changeName() {
        console.log('change')
        this.setState({
            name: 'ggg'
        })
    }

}
ReactDOM.render(<div><Lifecycle/></div>, document.getElementById('app'));