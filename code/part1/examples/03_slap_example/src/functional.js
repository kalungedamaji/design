const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = 
  numbers.filter(function(e) { return e % 2 === 0; })
    .map(function(e) { return e * 2; })
    .reduce(function(total, e) { return total + e; });

console.log(result);

//Each line is cohesive, does one thing
//we can easily add or remove lines from that functional pipeline

//But, the code is noisy and not really that easy to
//read because of that noise.


