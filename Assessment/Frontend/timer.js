//called on click of start
function startTimer() {
    var min = document.getElementById("minutes");
    var sec = document.getElementById("seconds");
    var totalSeconds = 0;
    var uTime = document.getElementById("userTime").value;
    //converting user input time to seconds
    var totalTime = uTime * 60;
        setInterval(function setTime() {
            //Increment seconds until it is lesser than user input seconds
            if(totalSeconds <= totalTime-1) {
                ++totalSeconds;
                //To get seconds
                sec.innerHTML = pad(totalSeconds % 60);
                //to get minutes
                min.innerHTML = pad(parseInt(totalSeconds / 60));
            }
        }, 1000);
}

function pad(val) {
//converting to string
  var valString = val + "";
  //if length is less than 2, append '0'
  if (valString.length < 2) {
    return "0" + valString;
  } else {
    return valString;
  }
}