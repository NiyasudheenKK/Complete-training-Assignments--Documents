
//student class declaration
class Student{
    stuId!: String
    stuName!: String
    stuAge!:Number
    stuStandard!:Number
    stuRollNo!:Number
    stuAddress!:String
    stuContact!:Number

    //constuctor method
    constructor(id:String,name:String,age:Number,standard:Number,rollNo:number,address:String,contact:Number){
        this.stuId=id;
        this.stuName=name;
        this.stuAge=age;
        this.stuStandard=standard;
        this.stuRollNo=rollNo;
        this.stuAddress=address;
        this.stuContact=contact;
    }
}

//creating object of student
var student1=new Student("1","Niyasudheen",22,12,48,"Kariimbakandy",9123456780);
var student2=new Student("2","Arun",22,12,48,"Alakkal",9123456780);
var student3=new Student("3","Fathima",22,12,48,"Tvm",9123456780);
var student4=new Student("4","Ravi",22,12,48,"MP",9123456780);
var student5=new Student("5","Bhargav",22,12,48,"Jharkhand",9123456780);

//viewing output in console
console.log(student1)
console.log(student2)
console.log(student3)
console.log(student4)
console.log(student5)