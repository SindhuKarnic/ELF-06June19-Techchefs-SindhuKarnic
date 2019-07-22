function updateview() {
    //Specifying type of data as text/html
    document.getElementById('view').src = 'data:text/html,' + document.getElementById('edit').value;
  }
  //On page load, call updateview function
  window.onload = updateview;