const tunelioIlgis = 0.264;
const autoGreitis = +prompt("Koks automobilio greitis km/h");
const sekunesValandoje = 3600;
const result = (tunelioIlgis / autoGreitis) * sekunesValandoje;
const roundedResult = Math.round(result * 100) / 100;
console.log("Automobilis tuneli pravaziuos per " + roundedResult + " s ");
