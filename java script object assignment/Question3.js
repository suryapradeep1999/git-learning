class Rectangle {
    constructor(width, height) { 
        his.width = width;
        this.height = height;
        this.hieght = height * 10;
    }
    getArea() {
        return this.width * this.height;
    }
}
const rec1 = new Rectangle(8, 6);
console.log(rec1.hieght);
console.log(rec1.height);
console.log(rec1.getArea());