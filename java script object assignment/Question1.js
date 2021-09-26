class Rectangle { 
    constructor(length, width){
        this.length = length;
        this.width = width;
    }    
getLength() {
    return this.length;
}
getWidth() {
  	return this.width;
}
setLength(length) {
    this.length = length;
	return ("length Modified "+length);
}
}
const rec = new Rectangle(8, 6);
console.log(rec.getLength());
console.log(rec.setLength(9));