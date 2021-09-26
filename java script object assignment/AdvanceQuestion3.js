function person(fname, lname, age, skills, dateofbirth, address, married, profession) {
    this.fname = fname;
    this.lname = lname;
    this.age = age;
    this.skills = skills;
    this.dateofbirth = dateofbirth;
    this.address = address;
    this.married = married;
    this.profession = profession;
} 
var amithab = new person("amithab", "bachan", 22, ["c"], "24/10/1996", {city: "hyderabad", pincode: "521185"}, "false", "sr analyst");
var abhisheik = new person("abhisheik", 21, "HTML", "08/06/1997", "false", "jr analyst");
var aaradhya = new person("aaradhya", 23, "09/12/1995");
var abhisheik = Object.create(amithab);
var aaradhya = Object.create(aaradhya);
print = function() {
    console.log(amithab);
    console.log(abhisheik.lname);
    console.log(abhisheik.address);
    console.log(aaradhya.lname);
    console.log(aaradhya.address);
    console.log(aaradhya.married);
    console.log(aaradhya.amithab.skills);
    console.log(aaradhya.abhisheik.profession);
} ();