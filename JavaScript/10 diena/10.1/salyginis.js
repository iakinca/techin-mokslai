const numbers = +prompt("Enter the numbers");
function lyginis(number) {
  if (number % 2 === 0) {
    return true;
  } else {
    return false;
  }
}
console.log(lyginis(numbers));
