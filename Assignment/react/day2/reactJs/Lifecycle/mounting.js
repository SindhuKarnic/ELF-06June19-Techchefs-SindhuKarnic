class Lifecycle extends React.Component {
    constructor(props) {
        super(props)
        console.log('cons')
        this.state = {
            name: 'aaa'
        }
    }
    static getDerivedStateFromProps() {
        console.log('getDerivedStateFromProps')
        return {name :'ccc'};
    }
    render() {
        console.log('render')
        return(
            <h1>{this.state.name}</h1>
        )
    }
    componentDidMount() {
        console.log('componentDidMount')
    }
}
ReactDOM.render(<Lifecycle/>, document.getElementById('app'));