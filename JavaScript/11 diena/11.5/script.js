const button = document.querySelector("button");
const text = document.querySelector("p");
const parent = document.querySelector("body");

const newName = document.createElement("h1");
newName.textContent = "Pavadinimas";

button.addEventListener("click", function () {
  parent.insertBefore(newName, text);
});
