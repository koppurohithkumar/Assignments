var button=document.getElementById("button");
var a=0;
button.onclick=function(){
    var a=0;
    var n=document.getElementById("number").value;
    var b=[];
    while(a!=20){
        n++;
        if((n%400==0)||(n%4==0 && n%100!==0)){
            document.write(n+"<br><br>");
            b[a]=n;    
            a++;
        }
        
        
    }
    document.write(b);
}