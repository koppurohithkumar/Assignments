function isEven(num) { return(num%2 == 0); }
function find(a,f){
    for(i=0;i<a.length;i++){
       if( f(a[i])){
           return a[i];
       }
       else{
           continue;
       }
    }
}
document.write("the first even element is :"+find([1,3,10,7,4],isEven))