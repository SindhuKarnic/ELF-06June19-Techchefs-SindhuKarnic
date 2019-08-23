  
  function Header() {
      return React.createElement('h1',null,"Header");
  }
  function Footer() {
    return React.createElement('h1',null,"Footer");
}
function Content() {
    return React.createElement('h1',null,"Content");
}
 const header =  React.createElement(Header);
 const footer =  React.createElement(Footer);
 const content =  React.createElement(Content);
 const myComp =  React.createElement('div', null,header, footer, content)
 ReactDOM.render(myComp, document.getElementById('app'))
  