// 2 uzduotis
const zuvuKiekis = +prompt("Kiek zuvu gyvena akvariume");
const idedamaPerDiena = +prompt("Kiek idedama zuvu per diena");
const dienuKiekis = +prompt("Kiek dienu praejo");
const result = dienuKiekis * idedamaPerDiena + zuvuKiekis;
console.log(
  "Po " + dienuKiekis + " dienu " + " akvariume gyvens " + result + " zuvu "
);
