const plytuIlgis = 20;
const plytuAusktis = 10;
const sienosIlgis = +prompt("Sienos ilgis");
const sienosAukstis = +prompt("Sienos aukstis");
const plytosKaina = +prompt("Plytos kaina");
const result = (sienosIlgis / plytuIlgis) * (sienosAukstis / plytuAusktis);
console.log("Plytu kiekis: " + result);
console.log("Plytos kainuos " + result * plytosKaina);
