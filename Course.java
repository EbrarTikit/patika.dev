public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int physics;
    int maths;
    int chemistrys;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        this.physics = 0;
        this.maths = 0;
        this.chemistrys = 0;

    }
    void addTeacher(Teacher teacher) {
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println(teacher.name + "Akademisyeni bu dersi veremez.");
        }
    }
    void printTeacher() {
        this.teacher.print();

    }

}
