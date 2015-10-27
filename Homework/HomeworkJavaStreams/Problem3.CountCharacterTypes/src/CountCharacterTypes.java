import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader(new File("resource/words")))) {
            String s;
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;
            while ((s = bfr.readLine()) != null){
                for (int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == 'a' ||s.charAt(i) == 'o' ||s.charAt(i) == 'e' ||
                            s.charAt(i) == 'i' ||s.charAt(i) == 'u'){
                        vowels++;
                    }else if (s.charAt(i) == '.' || s.charAt(i) == ',' ||s.charAt(i) == '!' ||
                            s.charAt(i) == '?'){
                        punctuation++;
                    }else if (s.charAt(i) != ' '){
                        consonants++;
                    }
                }
                System.out.printf("Vowels: %d\n", vowels);
                System.out.printf("Consonants: %d\n",consonants);
                System.out.printf("Punctuation: %d\n",punctuation);
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
