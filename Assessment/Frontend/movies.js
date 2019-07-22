
window.onload = getMovies();
function getMovies() {
        fetch('http://www.omdbapi.com/?i=tt3896198&apikey=15bf548b')
        .then(
        function(response) {
            if (response.status !== 200) {//checking for status code
            console.log('Looks like there was a problem. Status Code: ' +
                response.status);
            return;
            }

            //converting response to json
            response.json().then(function(data) {
                var movies = `<div class="container"><img src="${data.Poster}"/><div class="title-style">${data.Title}</div></div>`;
                document.getElementById('container').innerHTML = movies;
            });
        }
    ).catch(function(err) {//if theres is error in fetching
    console.log('Fetch Error :-S', err);
    });
}