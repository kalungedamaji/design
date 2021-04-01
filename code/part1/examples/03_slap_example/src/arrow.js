const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = 
  numbers.filter(e => e % 2 === 0)
    .map(e => e * 2)
    .reduce((total, e) => total + e);

console.log(result);

//Less noisy and that is good. Still cohesive.

//But, we still have to look into the arrow functions
//to know what they do. There is still some cognitive load
//for this function.

