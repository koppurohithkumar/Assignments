var arr=[1,2,3,4,5,6];
function usefor(a){
    var b=0;
for(i=0;i<(a.length);i++){
    b=b+a[i];
   // return b;
}
return b;}
function usewhile(b){
    var c=0;
    var d=0;
    while(c<(b.length)){
        d=d+b[c];
        c++;
    }
    return d;
};
function usedowhile(b){
    var c=0;
    var d=0;
    do{ d=d+b[c];
        c++;}
    while(c<(b.length));
    return d;
};
document.write("Sum using for loop : "+usefor(arr));
document.write("<br>Sum using While loop : "+usewhile(arr));
document.write("<br>Sum using DoWhile loop : "+usedowhile(arr));