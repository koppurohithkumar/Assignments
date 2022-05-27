class rectangle{
    constructor(height,width){
        this.height=height;
        this.width=width;
    }
}
rectangle.prototype.getarea()=this.height*this.width;
var r1=new rectangle(20,10);
document.write(r1.getarea());