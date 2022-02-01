public class Teacher {
    String name;
    String telno;
    String branch;

    Teacher(String name, String telno, String branch) {
        this.name = name;
        this.telno = telno;
        this.branch = branch;

    }

    public void print() {
        System.out.println("---------------------");
        System.out.println("Adı \t:" + this.name);
        System.out.println("Tel No \t:" + this.telno);
        System.out.println("Branch \t:" + this.branch);
    }
}
