import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by pc1 on 20.10.2015 ã..
 */
public class CreateZipArchive {
    public static void main(String[] args) {
        String zip = "resource/text-files.zip";
        String[] sourceFiles = {"resource/words.txt", "resource/count-chars.txt", "resource/lines.txt"};
        byte[] buffer = new byte[1024];

        try {
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zip));
            for(int i=0; i < sourceFiles.length; i++) {
                FileInputStream fin = new FileInputStream(sourceFiles[i]);
                zos.putNextEntry(new ZipEntry(sourceFiles[i]));
                int length;
                while((length = fin.read(buffer)) > 0)
                {
                    zos.write(buffer, 0, length);
                }
                zos.closeEntry();
                fin.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
