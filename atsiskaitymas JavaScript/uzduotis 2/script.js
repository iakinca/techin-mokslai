function sumPositiveNumbers() {
  let sum = 0;
  while (true) {
    let input = parseInt(prompt("Iveskite skaiciu:"), 10);
    if (input < 0) {
      break;
    }
    sum += input;
  }
  return sum;
}
console.log("Suma:", sumPositiveNumbers());
