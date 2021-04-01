const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const isEven = e => e % 2 === 0;
const double = e => e * 2;
const sum = (a, b) => a + b;

const result = 
  numbers.filter(isEven)
    .map(double)
    .reduce(sum);

console.log(result);

//Function names and variable names represent abstrations
//and serves as a form of (self) documentation.

