const print = () => {
    console.log("Sample");
}

const greeting = (name) => console.log(`Welcome ${name}`);
const add = (num1, num2) => num1 + num2; // implicit return - without curly brackets
const calculate = (num1, num2) => {
    const a = num1 + num2;
    const b = num1 * num2;
    return a * b; // explicit return - with curly brackets
}

print()
greeting("Anushka")
console.log('Add: ', add(3, 4));
console.log("Calculate: ", calculate(3, 4));