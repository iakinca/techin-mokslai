const evaluation = +prompt("grade evalution");

function findGrade(number) {
  if (number <= 29) {
    return "failed";
  } else if (number <= 34) {
    return 1;
  } else if (number <= 39) {
    return 2;
  } else if (number <= 44) {
    return 3;
  } else if (number <= 49) {
    return 4;
  } else if (number <= 60) {
    return 5;
  }
}
console.log(findGrade(evaluation));
