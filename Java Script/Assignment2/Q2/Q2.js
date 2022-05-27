function double(a){
    return a*2;
}
function square(b){
    return b*b;
}
function composedValue(c){
    return square(double(c));
}
document.write("the result is : "+composedValue(5));