import java.io.*;

public class CopyJPGFile {
    public static void main(String[] args) {
        FileInputStream pic = null;
        FileOutputStream copy = null;
        try {
            pic = new FileInputStream("resource/softuni.jpg");
            byte[] buffer = new byte[1024];
            int bytes;
            copy = new FileOutputStream("resource/my-copied-picture.jpg");
            while ((bytes = pic.read()) > 0) {
                copy.write(buffer, 0, bytes);
            }
            pic.close();
            copy.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
