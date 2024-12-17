const numberX = +prompt("Enter the numbers X");
const numberY = +prompt("Enter the numbers Y");

function biggest(x, y) {
  if (x > y) {
    return x;
  } else {
    return y;
  }
}
console.log(biggest(numberX, numberY));

function biggestTernary(x, y) {
  return x > y ? x : y;
}
console.log(biggestTernary(numberX, numberY));

function biggestMath(x, y) {
  return Math.max(x, y);
}
console.log(biggestMath(numberX, numberY));
