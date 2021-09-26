square = x => x * x;
let ar = [];
map = function (x,fun) {
    for(let i of x) {
        ar.push(fun(i));
    }
    return ar;
}
function square(x) { 
    return(x * x); 
}
var array = [1, 3, 5, 4, 2];
console.log(map(array, square));
console.log("Original : "+array);
console.log(map(array, Math.sqrt))