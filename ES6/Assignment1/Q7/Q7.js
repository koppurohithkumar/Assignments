//a.
let employee=["Rajesh","Ram","Hello"]
let [,,printing]=employee;
console.log(printing);

//b.
let employees =["Nishant","Rajesh","Subhash","Rohit"];
let [,,value,]= employees;
console.log(value);

let obj={
    name:"Jai",
    address:{
        city:"Visakhapatnam",
        pincode:530001
    }
}

let{name:a,address:b} = obj;
console.log(b.pincode);