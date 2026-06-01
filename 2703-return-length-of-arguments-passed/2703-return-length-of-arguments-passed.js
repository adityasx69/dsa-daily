/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    var x = 0;
    for(let key in args){
        x++
    }
    return x;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */