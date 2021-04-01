const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let result = 0;

for(let i = 0; i < numbers.length; i++) {
  if(numbers[i] % 2 === 0) {
    result += numbers[i] * 2;
  }
}

console.log(result);

//this code is very familiar to most of us, but it is not simple
//a lot of us confuse the term simple and familar

//the code above has many moving parts
//the lacks cohesion and also fails SLAP

//Also, imperative style code has more accidental complexity
//functional style code, if done well, has much less accidental complexity

