var str = "The Quick Brown Fox"
function rotate(word){ 
    var c =0;
    var arr = word.split(" ");
    var arr1 = word.replace(" ","ay ");
    document.write(arr);
    document.write(arr1);
    for(i=0;i<1;i++){
        for(j=0;j<(arr.length-1);j++){
            //var temp =arr[j];
            c=arr[j];
            arr[j]=a[j+1];
            a[j+1]=c;
        }
    }
    return arr;
}

document.write(rotate(str));