class rectangle{
    constructor(height,width){
        this.height=height;
        this.width=width;
    }
}
var r1=new rectangle(50,40);
r1.height=100;
var r2=new rectangle(1,2);
var r2=new rectangle(45,32);
var r3= new rectangle(3,4);
r3.width=34;
document.write("First instance height overrided :<br>"+r1.height+"<br>"+r1.width);
document.write("<br> Second instance overrided :<br>"+r2.height+"<br>"+r2.width);
document.write("<br> Third instance width overrided :<br>"+r3.height+"<br>"+r3.width);