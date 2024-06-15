import java.util.ArrayList;
import java.util.List;

/**
 * Programm
 */
public class Programm {

    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup();
        group1.addStudent(new Student("Garrosh", 1));
        group1.addStudent(new Student("Thrall", 2));

        StudentGroup group2 = new StudentGroup();
        group2.addStudent(new Student("Sylvana", 3));
        group2.addStudent(new Student("Bein", 4));

        StudentGroup group3 = new StudentGroup();
        group3.addStudent(new Student("Guldan", 5));

        Stream stream1 = new Stream();
        stream1.addStudentsGroup(group1);
        stream1.addStudentsGroup(group2);

        Stream stream2 = new Stream();
        stream2.addStudentsGroup(group3);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        StreamService streamService = new StreamService();
        streamService.sort(streams);

        for (Stream stream : streams) {
            System.out.println("Кол-во групп в потоке: " + stream.getGroupCount());
            for (StudentGroup group : stream) {
                System.out.println(" Группа: ");
                for (Student student : group) {
                    System.out.println("  " + student);
                }
            }
            System.out.println();
        }
    }

}