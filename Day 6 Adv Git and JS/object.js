const person = {
    firstname: "John",
    lastname: "Doe",
    email: "john@gmail.com",
    age: 45,
    address: {
        street: "XYZ",
        city: "New York",
        zipcode: 352295,
        country: "US"
    },
    greeting: function() {
        console.log(`Welcome ${this.firstname} ${this.lastname}!`);
    }
}

console.log("Address: ", person.address);
person.greeting();
console.log(person['email']);
for (let key in person) {
    console.log(person[key]);
}