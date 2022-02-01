public class Student {

    Course physic;
    Course chemistry;
    Course math;
    Course physics;
    Course chemistrys;
    Course maths;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course physic, Course math, Course chemistry, Course physics, Course maths, Course chemistrys ) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.physic = physic;
        this.math = math;
        this.chemistry = chemistry;
        this.physics = physics;
        this.maths = maths;
        this.chemistrys = chemistrys;
        this.average = 0.0;
        this.isPass = false;
    }


    void addBulkExamNote(int note1, int note2, int note3, int note11, int note22, int note33) {
        if(note1 >= 0 && note1 <=100) {
            this.physic.note = note1;
        }
        if(note2 >= 0 && note2 <=100) {
            this.math.note = note2;
        }
        if(note3 >= 0 && note3 <=100) {
            this.chemistry.note = note3;
        }
        if(note1 >= 0 && note1 <=100) {
            this.physics.note = note11;
        }
        if(note2 >= 0 && note2 <=100) {
            this.maths.note = note22;
        }
        if(note3 >= 0 && note3 <=100) {
            this.chemistrys.note = note33;
        }
    }

    void isPass() {
        this.average = ((this.physic.note + this.math.note + this.chemistry.note) * 0.8 + (this.physics.note + this.maths.note + this.chemistrys.note) * 0.2) / 3.0;
        System.out.println("----------");
        if(this.average > 55) {
            System.out.println("Sınıfı geçtiniz.");
            this.isPass =true;
        } else {
            System.out.println("Sınıfta kaldınız");
            this.isPass = false;
        }
        printNote();
    }
    void printNote() {
        System.out.println(this.physic.name + " Notu \t:" + this.physic.note + " Sözlü Notu \t:" + this.physics.note) ;
        System.out.println(this.math.name + " Notu \t:" + this.math.note + " Sözlü Notu \t:" + this.maths.note);
        System.out.println(this.chemistry.name + " Notu \t:" + this.chemistry.note + " Sözlü Notu \t:" + this.chemistrys.note);
        System.out.println("Ortalama : " + this.average);
    }


}
