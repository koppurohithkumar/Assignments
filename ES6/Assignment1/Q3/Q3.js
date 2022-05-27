let order = {
    id : 123,
    title: "Palav",
    price: 345,
    printorder(){
        return (this.id+"title :"+this.title+" price :"+this.price)
    },
    getprice(){
        return this.price;
    }
}
let copy = Object.assign(order);
console.log(copy.printorder());
console.log(copy.getprice());