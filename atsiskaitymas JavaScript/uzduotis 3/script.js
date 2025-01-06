let countries = ["Lietuva", "Latvija", "Estija", "Lenkija", "Suomija"];
//ivesti 1 ir 2 elementus
console.log("Pirmas elementas:", countries[0]);
console.log("Paskutinis elementas:", countries[countries.length - 1]);
//ivesti nauja sali gale
countries.push("Vokietija");
//pakeisti 3 elementa su Lietuva
countries[2] = "Lietuva";
//rodyti visus elementus
countries.forEach((country) => console.log(country));
