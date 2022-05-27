// store input numbers
//var num1 = parseInt(prompt('Enter the number '));

var button=document.getElementById("button");

button.onclick=function(){
    var num1=document.getElementById("number").value;
    document.write(`The number is ${num1}`)
    var num2=0;
    for(i=0;i<=num1;i++)
    {
        num2+=i;
    }
    document.write(`<br>The sum is ${num2}`);
}
