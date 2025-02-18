const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// To create new array by multiplying each element by 3
// Manual process
const resultArr = [];
for (let num of arr) {
    resultArr.push(num * 3);
}
console.log("Array after multiplying: ", resultArr);

// Map - callback function
const newArr = arr.map((num) => num * 3);
console.log("Array after multiplying using map: ", newArr);

const evenArr = arr.filter((num) => num % 2 === 0);
console.log("Even numbers: ", evenArr);

// Find - returns first element that satisfies the condition
// If not found, returns undefined
const found = arr.find((num) => num === 90);
console.log(found ? "Found " + found : "Not Found");

// FindIndex - returns index of first element that satisfies the condition	
// If not found, returns -1
const index = arr.findIndex((num) => num === 8);
console.log(index !== -1 ? "Found at index " + index : "Not Found");

// includes - returns true if element is present in array
// If not found, returns false
console.log(arr.includes(8) ? "Found" : "Not Found");

// False values - False, 0, null, undefined, -1, NaN, ""

const arr2 = [1, 2, 3, 2, 4, 5, 2, 6, 7, 2, 8, 2]
    // Find number of 2s
const count = arr2.filter((num) => num === 2).length;
console.log("Number of 2s: ", count);

// Print individual elements using forEach
arr.forEach((num) => console.log(num));

// some - returns true if any element satisfies the condition
// every - returns true if all elements satisfy the condition
result = [35, 67, 89, 65, 94]
console.log("Is every num > 50", result.every((num) => num > 50));
console.log("Is every num > 30", result.every((num) => num > 30));
console.log("Is some num > 90", result.some((num) => num > 90));
console.log("Is some num < 30", result.some((num) => num < 30));

console.log([
    [1, 2],
    [3, 4],
    [5, 6]
].flat());

console.log("Check index of Kohli", "Anushka kohli".indexOf("k"));
console.log("Check last index of", "Anushka kohli".lastIndexOf("k"));

const myArray = [10, 20, 20, 40, 50]
console.log(myArray.slice(2)); // slices from 2nd index to end
console.log(myArray.slice(2, 4)); // slices from 2nd index to 4th index

// Splice - removes elements from array and returns them
console.log(myArray.splice(2)); // removes elements from 2nd index to end
console.log(myArray.splice(3, 0, 60, 70)); // removes 0 elements from 3rd index and adds 60, 70
// delete
console.log("after delete: ", myArray.splice(3, 1));
// replace 70 by 35
console.log("after replace: ", myArray.splice(3, 1, 35));