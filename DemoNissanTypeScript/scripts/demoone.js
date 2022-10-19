"use strict";
let exText = "        This is an example for split in typescript        ";
console.log("First Operation-Split");
const array = exText.split(" ");
for (let index in array) {
    console.log(array[index]);
}
console.log("         ");
console.log("Second Operation-CharAt");
console.log(exText.charAt(3));
console.log("         ");
console.log("Third Operation-indexOf");
console.log(exText.indexOf("example"));
console.log("         ");
console.log("Fourth Operation-Replace");
console.log(exText.replace("split", "Repalce"));
console.log("         ");
console.log("Fifth Operation-Trim");
console.log(exText.trim());
console.log("         ");
console.log("Sixth Operation-substr");
console.log(exText.substr(15, 25));
console.log("         ");
console.log("Seventh Operation-substring");
console.log(exText.substring(15, 25));
console.log("         ");
