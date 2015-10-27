import java.io.*;
import java.io.Serializable;

public class SaveACustomObjectInAFile {
    public static void main(String[] args) {
        Course course = new Course("Java",12);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    "resource/course.save")));
            oos.writeObject(course);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    "resource/course.save")));
            System.out.print(ois.readObject());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Course implements Serializable {
        private String name;
        private int num;

        public Course(String name, int numOfStudents) {
            this.name = name;
            this.num = numOfStudents;
        }
    }
}

