var a=[];
var i=0;
while(i<100){
    var num=Math.floor(Math.random() *100);
    a[i]=num;
    i++;
}
document.write(a);
function largest(b){
    var l=b[0];
    for(i=0;i<b.length;i++){
        if(l<b[i]){
           l=b[i];}
    }
    return l;
}
document.write("<br><br> The largest number in the array is : "+largest(a));
function smallest(c){
    var l=c[0];
    for(i=0;i<c.length;i++){
        if(l>c[i]){
        l=c[i];}
    }
    return l;
}
document.write("<br><br> The smallest number in the array is : "+smallest(a));
function evenodd(d){
    var counteven=0;
    var countodd=0;
    for(i=0;i<d.length;i++){
        if(d[i]%2==0){
            counteven++;
        }
        else{
            countodd++;
        }
    }
    var str="even count : "+counteven+"<br>odd count : "+countodd;
    return str ;
}
document.write("<br><br>"+evenodd(a));
function sumavg(e){
    var sum=0;
    for(i=0;i<e.length;i++){
        sum+=e[i];
    }
    var avg=sum/e.length;
    var str="the sum is : "+sum+"<br> the average is : "+avg;
    return str;
}
document.write("<br><br>"+sumavg(a));

