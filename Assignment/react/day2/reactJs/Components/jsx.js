const name = "aa"
const element = <h1>{name}</h1>

function Welcome(props) {
    return (
        <div>
    <h1 style={props.style}>{props.name}</h1>
    {/* <button onClick={()=>alert('Button')}>Click</button> */}
    <button onClick={alert.bind(this,'button')}>Click</button>
    </div>
    )
}

class Message extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            name : 's',
            id: 1
        }
        this.changeMsg = this.changeMsg.bind(this);
        this.clickLink = this.clickLink.bind(this);
    }
    render() {
        return <div><h1>{this.state.name}</h1><button onClick={this.changeMsg}>change</button><a href="https://www.google.com" onClick={this.clickLink}>Link</a></div>
    }
    clickLink(event) {
        event.preventDefault();
    }
    changeMsg() {
        this.setState({
            name : 'k'
        })
    }
}
// ReactDOM.render(<Welcome name="sss" style={{color:'green',backgroundColor:'red'}}/>, document.getElementById('app'))

ReactDOM.render(<Message />, document.getElementById('app'))