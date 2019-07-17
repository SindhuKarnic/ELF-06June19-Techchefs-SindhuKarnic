function showImages() {
//change other images
 document.getElementById('im2').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2018/01/11/21/27/desk-3076954__340.jpg'/>";
 document.getElementById('im3').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2018/03/10/12/00/paper-3213924__340.jpg'/>";
 document.getElementById('im4').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2016/04/04/14/12/monitor-1307227__340.jpg'/>";
//create elements
  var containerElem = document.createElement("div");
  containerElem.setAttribute("id", "container");
  containerElem.setAttribute("class", "container row margin-for-element");
  document.body.appendChild(containerElem);
  var firstImg = document.createElement("img");
  firstImg.setAttribute("class", "col-3 imgheight");
  firstImg.setAttribute("src", 'https://cdn.pixabay.com/photo/2018/01/11/21/27/desk-3076954__340.jpg');
  containerElem.appendChild(firstImg);
  var SecondImg = document.createElement("img");
  SecondImg.setAttribute("class", "col-3 imgheight");
  SecondImg.setAttribute("src", 'https://cdn.pixabay.com/photo/2018/03/10/12/00/paper-3213924__340.jpg');
  containerElem.appendChild(SecondImg);
  var thirdImg = document.createElement("img");
  thirdImg.setAttribute("class", "col-3 imgheight");
  thirdImg.setAttribute("src", 'https://cdn.pixabay.com/photo/2016/04/04/14/12/monitor-1307227__340.jpg');
  containerElem.appendChild(thirdImg);
}

function hideImages() {
    //change back other images
    document.getElementById('im2').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2016/03/26/13/09/cup-of-coffee-1280537__340.jpg'/>";
    document.getElementById('im3').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336378__340.jpg'/>";
    document.getElementById('im4').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2016/11/29/08/41/apple-1868496__340.jpg'/>";
    //remove elements
    var container = document.getElementById('container');
    document.body.removeChild(container);
}