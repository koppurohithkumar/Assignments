function sq(x){
    return x*x;
}
var newarray=[];
function map(a,b){
    if(a.length==0){
        return;
    }
    newarray.push(sq(a.slice(0,1)));
    a=a.slice(1,a.length);
    map(a,b);
    return newarray;
    // var c=[]
    // for(i=0;i<a.length;i++){
    //     c.push(b(a[i]));
    // }
    // return c;
}
var c=[]
function sqrt(x){
    if(x.length==0){
        return;
    }
    c.push(Math.sqrt(x.slice(0,1)));
    x=x.slice(1,(x.length));
    sqrt(x);
    return c;
}
//var a= map([1,2,3,4,5],sq);
document.write(map([1,2,3,4,5],sq));
document.write("<br>"+sqrt(newarray));