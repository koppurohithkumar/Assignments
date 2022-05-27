function double(x){
    return x*2;
}
function square(x){
    return x*x;
}
function composedValue(y,z,x){
    return z(y(x));
}
document.write("the result is : "+composedValue(double,square,5));