public class StudentGradingSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "0005", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "555", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "111", "BIO");

        Course math = new Course("Matematik", "MAT101", "MAT");
        Course maths = new Course("Sözlu", "SZL101","SZL");
        math.addTeacher(t1);

        Course physic = new Course("Fizik", "FZK101", "FZK");
        Course physics = new Course("Sözlu", "SZL101","SZL");
        physic.addTeacher(t2);

        Course chemistry = new Course("Kimya", "KMY101", "KMY");
        Course chemistrys = new Course("Sözlu", "SZL101","SZL");
        physic.addTeacher(t2);

        Student s1 = new Student("Kemal Sunal", "123", "4", math, physic, chemistry, maths, physics, chemistrys);
        s1.addBulkExamNote(10,78,50, 70, 30, 40);
        s1.isPass();

        Student s2 = new Student("Düdük Necmi", "333", "4", math, physic, chemistry, maths, physics, chemistrys);
        s2.addBulkExamNote(10,30,50,40,100,70);
        s2.isPass();
    }
}
