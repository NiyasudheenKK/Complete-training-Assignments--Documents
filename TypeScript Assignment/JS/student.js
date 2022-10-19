//student class declaration
var Student = /** @class */ (function () {
    //constuctor method
    function Student(id, name, age, standard, rollNo, address, contact) {
        this.student = new Student("1", "Niyasudheen", 22, 12, 48, "Kariimbakandy", 9123456780);
        this.stuId = id;
        this.stuName = name;
        this.stuAge = age;
        this.stuStandard = standard;
        this.stuRollNo = rollNo;
        this.stuAddress = address;
        this.stuContact = contact;
    }
    return Student;
}());
