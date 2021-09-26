isEven = x => x%2 == 0 ? true : false;
find = function (x,fun) {
    for(let i of x) {
        if(fun(i)) {
            return i;
        }
    }
}
console.log(find([1, 3, 5, 4, 2], isEven));