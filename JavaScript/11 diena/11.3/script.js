const img = document.querySelector("img");
const buttonPadidinti = document.querySelector("#padidinti");
const buttonSumazinti = document.querySelector("#sumazinti");

buttonPadidinti.addEventListener("click", function () {
  img.style.width = "600px";
});
buttonSumazinti.addEventListener("click", function () {
  img.style.width = "150px";
});
