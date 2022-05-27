var a="aqwebqweaqweb";
function aandb(am){
    //var b=am.split("b");
    ///document.write(b);
    var c=am.length;
    //document.write(c);
    for(i=0;i<c;i++){
        if(am[i]==("a"||"b")){
            for(j=1;j<(c-i);j++){
                if(am[j]==("a"||"b")){
                    continue;     
                }
                else{
                    var d=am[i+j];
                        document.write(d);
                }
            }
        }
    }
}
aandb(a);