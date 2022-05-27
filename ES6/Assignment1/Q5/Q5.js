//a.
let add=(value=10)=>{
    return value;
};
console.log(add());

//b.
let userFriends=(username,...arrayfriends) =>{
    console.log(username);
    console.log(arrayfriends);
    for(friends in arrayfriends){
        console.log(arrayfriends[friends]);
    }
}
let username="Rajesh";
userFriends(username,"Rohith","Nishanth","Subhash");

//c.
let printCapitalNames=(...capnames)=>{
    let arr=[];
    for(i in capnames){
        arr.push(capnames[i].toUpperCase());
    }
    console.log(arr);
    return arr;  
}
let a=printCapitalNames("ram","hey");
console.log(...a);