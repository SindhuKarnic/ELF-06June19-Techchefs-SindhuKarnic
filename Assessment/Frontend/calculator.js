//function that display value 
function dis(val) 
{ 
    document.getElementById("result").value+=val 
} 

//function that evaluates the digit and return result 
function solve() 
{ 
    let x = document.getElementById("result").value; 
    document.getElementById("result").value = eval(x);
} 

//function that clear the display 
function clear() 
{ 
    document.getElementById("result").value = "" 
} 