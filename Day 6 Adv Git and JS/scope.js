let name = "John"; // global scope

function myFunction() {
    let a = 10;
    const b = 20;
    // var has functional scope
    var c = 30;

    console.log("Let inside variable: ", a);
    console.log("Const inside variable: ", b);
    console.log("Var inside variable: ", c);
}

function hello() {
    if (true) {
        let a = 10;
        const b = 20;
        // var has functional scope
        var c = 30;

        console.log("Inside if Let variable: ", a);
        console.log("Inside if Const variable: ", b);
        console.log("Inside if Var variable: ", c);
    }
    console.log("Outside if Let variable: ", a);
    console.log("Outside if Const variable: ", b);
    console.log("Outside if Var variable: ", c);
}

myFunction();

// Will give error
// console.log("Let outside variable: ", a);
// console.log("Const outside variable: ", b);
// console.log("Var outside variable: ", c);