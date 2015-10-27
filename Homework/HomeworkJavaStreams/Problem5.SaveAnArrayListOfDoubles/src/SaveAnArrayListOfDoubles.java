import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by pc1 on 20.10.2015 ã..
 */
public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) {
        double[] doubles = {
                5.0056,
                45.55,
                87.2,
                69.69,
                6.9,
                49.15
        };
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    "resource/doubles.list")));
            oos.writeObject(doubles);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    "resource/doubles.list")));
            double[] newNumbers = (double[]) (ois.readObject());
            System.out.println("Doubles: " + Arrays.toString(newNumbers));
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
