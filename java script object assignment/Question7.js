const person1 = JSON.parse('{"firstName" : "Crooked", "lastName" : "Man"}');
console.log("Middle Name: " + person1.middleName);
person1.middleName = "Ollie";
console.log("Middle Name: " + person1.middleName);