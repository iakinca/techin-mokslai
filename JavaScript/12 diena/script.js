const formOne = document.forms["form-one"];
formOne.addEventListener("submit", function (e) {
  e.preventDefault();
  const firstNumber = Number(e.target["first-number"].value);
  const secondNumber = Number(e.target["second-number"].value);
  const sum = firstNumber + secondNumber;
  console.log("Sum is: " + sum);
});
