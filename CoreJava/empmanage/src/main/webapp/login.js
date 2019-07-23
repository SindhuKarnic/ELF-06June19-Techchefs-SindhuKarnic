/**
 * 
 */
window.onload = function() {
	if(location.href.search("error") != -1) {
			document.getElementById("err").style.visibility = "visible";
		}
	if(location.href.search("loged") != -1) {
			document.getElementById("success").style.visibility = "visible";
		}
}
function showPassword() {
    if (document.getElementById('pwd').type === 'password') {
        document.getElementById('pwd').type= "text";
    } else {
        document.getElementById('pwd').type= "password";
    }
   
}
function enableSubmit() {
	if(document.getElementById('eid').value != null && document.getElementById('pwd').value != "" ) {
		document.getElementById('sub').disabled = false;
	}
}