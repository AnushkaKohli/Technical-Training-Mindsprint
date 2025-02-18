const arr = new Array(4)

console.log('arr.length :>> ', arr.length);

arr.push(10);
arr.push(20);
arr.push(30);
console.log("After push: ", arr);
arr.unshift(5)
arr.unshift(2)
console.log("After unshift: ", arr);
console.log(arr.pop()); //remove last element
console.log("After pop: ", arr);
console.log(arr.shift()); //remove first element
console.log("After shift: ", arr);