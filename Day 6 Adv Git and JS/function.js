// Declaration of function - Hoisting
console.log(greeting("Anushka"));

// data();

function greeting(name) {
    return "Hello " + name + "!";
}

function print() {
    console.log("Hello I'm Anushka");
}

function cube(n) {
    return n * n * n;
}

// Function Expression
var data = function() {
    console.log("Data fetched successfully!");
}

data();
const result = greeting("Anushka");
console.log(result);
print();
console.log("Cube: ", cube(3));