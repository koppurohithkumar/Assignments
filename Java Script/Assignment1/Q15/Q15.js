var a=[];
var i=0;
while(i<20){
    var num=Math.floor(Math.random() *20);
    a[i]=num;
    i++;
}
document.write(a);
function bubblesort(b){
    var c=0;
    for(j=0;j<b.length;j++){
        for(i=0;i<(b.length - j -1);i++){
            if(b[i]>b[i+1]){
                c=b[i];
                b[i]=b[i+1];
                b[i+1]=c;
            }
        }
    }
    return b;
}
document.write("<br> the sorted array is : "+bubblesort(a));