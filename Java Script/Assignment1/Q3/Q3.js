var button=document.getElementById("button");
button.onclick=function(){
    var num1=document.getElementById("number").value;
var a=new function(){
    if((num1%2)==0){
        document.write("Given number is even");
    }
    
    else{
        document.write("Given number is odd")
    }
}
}