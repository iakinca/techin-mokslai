const plytuIlgis = 20;
const plytuAusktis = 10;
const sienosIlgis = +prompt("Sienos ilgis");
const sienosAukstis = +prompt("Sienos aukstis");
const plytosKaina = +prompt("Plytos kaina");
const sienaCM = (sienosIlgis*sienosAukstis)*100;
const plytaCm = (20*10)/100;
const plytuKiekis = sienaCM/plytaCm;
const plytuKaina = plytuKiekis*plytosKaina
console.log("Plytu kiekis: " + result); 
console.log("Plytos kainuos " + result * plytosKaina); 