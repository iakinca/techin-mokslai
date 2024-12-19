const formOne = document.forms["form-one"];
const pharagrah = document.querySelector("#sum");
formOne.addEventListener("submit", function (e) {
  e.preventDefault();
  const firstNumber = Number(e.target["first-number"].value);
  const secondNumber = Number(e.target["second-number"].value);
  const sum = firstNumber + secondNumber;
  console.log(sum);
  pharagrah.textContent = `${sum}`;
});
