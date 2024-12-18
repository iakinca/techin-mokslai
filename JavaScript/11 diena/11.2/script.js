const p = document.querySelector("p");

const buttonYellow = document.querySelector("#yellow");
const buttonGreen = document.querySelector("#green");
const buttonRed = document.querySelector("#red");

buttonYellow.addEventListener("click", function () {
  p.style.color = "yellow";
});

buttonGreen.addEventListener("click", function () {
  p.style.color = "green";
});

buttonRed.addEventListener("click", function () {
  p.style.color = "red";
});
