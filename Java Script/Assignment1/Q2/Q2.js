var button=document.getElementById("button");
var num2=0;
button.onclick=function(){
    var num1=document.getElementById("number").value;
for(i=0;i<=num1;i++){
    if(i%3==0 || i%5==0)
    {
        num2+=i;
    }
}

// display the sum
document.write(`The sum is ${num2}`);
}