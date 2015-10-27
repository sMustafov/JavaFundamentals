import java.io.*;

/**
 * Created by pc1 on 19.10.2015 ã..
 */
public class AllCapitals {
    public static void main(String[] args) {
        try(
                BufferedReader bfr =
                        new BufferedReader(
                                new FileReader(new File("resources/text")))) {
            String s;
            while ((s = bfr.readLine()) != null) {
                System.out.println(s.toUpperCase());
            }
        }
        catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
