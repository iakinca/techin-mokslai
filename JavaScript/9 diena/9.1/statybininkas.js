
const sienosIlgis = +prompt("Sienos ilgis metrais");
const sienosAukstis = +prompt("Sienos aukstis metrais");
const plytosIlgis = 20;
const plytosAukstis = 10;
const plytosKaina = 0.5
const sienaCm = (sienosIlgis * 100) * (sienosAukstis * 100)
const plytaCm = plytosIlgis * plytosAukstis
const plytuKiekis = sienaCm / plytaCm
const plytuKaina = plytuKiekis * plytuKaina
console.log('Plytu kiekis: ${plytosKaina}')
console.log('Plytos kainuos: ${plytuKaina}')