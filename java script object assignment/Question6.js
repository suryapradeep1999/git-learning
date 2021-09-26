var objectStr = '({firstName: "Crooked", lastName: "Man"})';
const person1 = eval(objectStr);
console.log("Name: " + person1.firstName + " " + person1.middleName + " " + person1.lastName);
person1.middleName = "ollie";
console.log("Name: " + person1.firstName + " " + person1.middleName + " " + person1.lastName);