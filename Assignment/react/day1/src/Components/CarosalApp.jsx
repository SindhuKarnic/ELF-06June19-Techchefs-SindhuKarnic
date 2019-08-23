import React, {Component} from 'react';

import Carousel from 'react-bootstrap/Carousel';

class CarosalApp extends Component {
    render() {
        var imgarr= ['/assets/images/pexels-photo1.jpeg','/assets/images/pexels-photo2.jpeg','/assets/images/rose.jpeg'];
        var indents = [];
        for (var i = 0; i < 3; i++) {
        indents.push(
            <Carousel.Item>
                {/* <img
                className="d-block w-100"
                src="https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
                alt="First slide"
                /> */}
                <img
                className="d-block w-100"
                src={imgarr[i]}
                alt="First slide"
                />
                <Carousel.Caption>
                </Carousel.Caption>
            </Carousel.Item>
        );
        }
        return (
            <Carousel>
                {indents}
  {/* <Carousel.Item>
    <img
      className="d-block w-100"
      src="https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
      alt="First slide"
    />
    <Carousel.Caption>
      <h3>First slide label</h3>
      <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
    </Carousel.Caption>
  </Carousel.Item>
  <Carousel.Item>
    <img
      className="d-block w-100"
      src="https://image.shutterstock.com/image-photo/mountains-during-sunset-beautiful-natural-260nw-407021107.jpg"
      alt="Second slide"
    />

    <Carousel.Caption>
      <h3>Second slide label</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
    </Carousel.Caption>
  </Carousel.Item>
  <Carousel.Item>
    <img
      className="d-block w-100"
      src="https://images.pexels.com/photos/326055/pexels-photo-326055.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"
      alt="Third slide"
    />

    <Carousel.Caption>
      <h3>Third slide label</h3>
      <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
    </Carousel.Caption>
  </Carousel.Item> */}
</Carousel>
        );
    }
}
export default CarosalApp;
