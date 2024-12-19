const img = document.querySelector("img");
const buttonColored = document.querySelector("#colored");
const buttonBlack = document.querySelector("#black");
buttonColored.addEventListener("click", function () {
  img.style.filter = "none";
});
buttonBlack.addEventListener("click", function () {
  img.style.filter = "grayscale(100%)";
});
