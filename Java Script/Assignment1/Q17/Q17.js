var a=[1,2,3,4,5,6]
function rotater(b,n){
    var c=0;
    for(j=0;j<n;j++){
        for(i=0;i<(b.length -1);i++){
            c=b[i];
            b[i]=b[i+1];
            b[i+1]=c;
        }
    }
    return b;
}
document.write(rotater(a,3));