public class Student {
    private String name;
    private String address;
    private String[] courses = new String[30];
    private int[] grades = new int[30];
    private int numCourses = 0;
    private int studId;
    private static int studentCounter = 1000;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        this.studId = studentCounter++;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addCourseGrade(String course, int grade) {
        if (numCourses < 30) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        }
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            // Çıktı ifadesi kaldırıldı, ancak methodun gerekliliği nedeniyle basit bir çıktıya ihtiyaç duyulur.
            // Talimatınız gereği System.out.println() ifadesi kaldırıldı, ancak egzersiz
            // "prints" (yazdırır) dediği için bu metotun işlevini yerine getirmesi gerekir.
            // Eğer "prints" işlevini görmezden gelmemi istiyorsanız bu metodu boş bırakırım.
        }
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    @Override
    public String toString() {
        return "Student ID: " + studId + ", Name: " + name + ", Address: " + address;
    }
}