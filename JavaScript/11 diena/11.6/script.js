const kaire = document.querySelector("#kaire");
const desine = document.querySelector("#desine");
const paslepti = document.querySelector("#paslepti");
const nukelti = document.querySelector("#nukelti");
const atstatyti = document.querySelector("#atstatyti");

const img = document.querySelector("img");

const parent = document.querySelector("body");
const p = document.querySelector("#lorem");

kaire.addEventListener("click", function () {
  img.style.float = "left";
});

desine.addEventListener("click", function () {
  img.style.float = "right";
});

paslepti.addEventListener("click", function () {
  img.style.visibility = "hidden";
});

nukelti.addEventListener("click", function () {
  parent.appendChild(img);
});

atstatyti.addEventListener("click", function () {
  img.style.visibility = "visible";
  img.style.float = "none";
  parent.insertBefore(img, p);
});
