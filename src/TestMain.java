public class TestMain {
    public static void main(String[] args) {
        Student studentA = new Student("Ayşe Yılmaz", "Ankara");
        Student studentB = new Student("Burak Kaya", "İstanbul");

        studentA.addCourseGrade("MATH201", 95);
        studentA.addCourseGrade("CS101", 85);
        studentA.addCourseGrade("PHYS202", 70);

        studentB.addCourseGrade("ECON305", 65);
        studentB.addCourseGrade("HIST102", 90);

        System.out.println(studentA.toString());
        System.out.println(studentB.toString());

        System.out.println("---");

        System.out.println("Student A Name: " + studentA.getName());
        studentA.setAddress("İzmir");
        System.out.println("Student A New Address: " + studentA.getAddress());

        System.out.println("---");

        studentA.printGrades();
        double avgA = studentA.getAverageGrade();
        System.out.printf(studentA.getName() + " Average Grade: %.2f\n", avgA);

        System.out.println("---");

        studentB.printGrades();
        double avgB = studentB.getAverageGrade();
        System.out.printf(studentB.getName() + " Average Grade: %.2f\n", avgB);
    }
}