class Header extends React.Component {
    constructor(props) {
        super(props);
        console.log(this.props);
    }
    render() {
        return React.createElement('h1',null,"Header");
    }
}
class Footer  extends React.Component {
    render() {
        return React.createElement('h1',null,"Footer");
    }
}
class Content extends React.Component {
    constructor(props) {
        super(props);
        //console.log(this.props);
    }
       render() {
        return React.createElement('ul',null,
        this.props.item.map((value,index) => {
            return React.createElement('li',{key:index}, value)
        })
        )
       }
}
const items = ['a','b']
const header =  React.createElement(Header, {item:['a','b']});
const footer =  React.createElement(Footer);
const content =  React.createElement(Content, {item :items});
const myComp =  React.createElement('div', null,header, footer, content)
ReactDOM.render(myComp, document.getElementById('app'))
