console.log(a);
var a = 10;
console.log(a);

// console.log(b);
// let b = 10;
// console.log(b); // Hoisting is not possible here

// Anonymous function
const test = function() {
    console.log("Test triggered");
}

// Named function
const myFunction = function test() {
    console.log("My function triggered");
}

var factorial = (n) => {
    return n < 2 ? 1 : n * factorial(n - 1);
}
console.log(factorial(5));