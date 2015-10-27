import java.io.*;

/**
 * Created by pc1 on 19.10.2015 ã..
 */
public class SumLines {
    public static void main(String[] args) {
        try(
                BufferedReader bfr =
                        new BufferedReader(
                                new FileReader(new File("resources/text")))) {
            String s;
            while ((s = bfr.readLine()) != null) {
                int sum = 0;
                for (int i = 0; i < s.length(); i++){
                    sum += s.charAt(i);
                }
                System.out.println(sum);
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
