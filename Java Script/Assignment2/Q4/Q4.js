function sq(x){
    return x*x;
}
function map(a,b){
    var c=[]
    for(i=0;i<a.length;i++){
        c.push(b(a[i]));
    }
    return c;
}
function sqrt(x){
    var c=[]
    for(i=0;i<a.length;i++){
        c.push(Math.sqrt(x[i]));
    }
    return c;
}
var a= map([1,2,3,4,5],sq);
document.write(map([1,2,3,4,5],sq));
document.write("<br>"+sqrt(map([1,2,3,4,5],sq)));