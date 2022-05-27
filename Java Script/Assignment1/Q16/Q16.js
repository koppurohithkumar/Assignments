var button=document.getElementById("submit");
button.onclick= function createTable(){
    var rn=document.getElementById("row").value;
    var cn=document.getElementById("column").value;
    for(i=0;i<rn;i++){
        var x=document.getElementById("table").insertRow(i);
        for(j=0;j<cn;j++){
            var y=x.insertCell(j);
            y.innerHTML="Row-"+(i+1)+"column-"+(j+1);
        }
    }
}