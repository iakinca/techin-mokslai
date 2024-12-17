const day = +prompt("Enter the days");
function convertDays(days) {
  const hours = days * 24;
  const minutes = hours * 60;
  const total = `${days} dienos yra ${hours} valandos arba ${minutes} minuciu`;
  return total;
}
console.log(convertDays(day));
