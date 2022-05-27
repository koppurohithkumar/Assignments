function isEven(num) { return(num%2 == 0); }
function find(a,f){
    var h=a.shift();
       if( f(a[h])){
           return a[h];
       }
       else{
           find(a,f);
       }
}
var a=[1,3,10,7,4];
document.write("the first even element is :"+find(a,isEven))