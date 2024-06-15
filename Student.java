public class Student implements Comparable<Student> {

    protected String name;
    protected int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.length() - o.name.length();
    }
}