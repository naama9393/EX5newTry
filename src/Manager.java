import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eldar on 5/25/2017.
 */
public class Manager {


    /**
     * for every 2 lines in the command file, we create a new section object
     * Note - check
     */
    public static ArrayList<Section> parse(File commandFile) {
        String[] commands = FiletoList(commandFile);
        for(int i = 0;i<commands.length;i++){

        }



    }

    private static String[] FiletoList(File f) {
        List<String> fileContent = new ArrayList<String>();
        BufferedReader bf = null;
        try {
            FileReader fr = new FileReader(f);
            bf = new BufferedReader(fr);
            String line = null;
            while ((line = bf.readLine()) != null) {
                fileContent.add(line);
            }

        } catch (IOException e) {
            System.err.println("ERROR: An IO error occurred.");
            return null;
        } finally {
            // Try to close the file
            try {
                if (bf != null) {
                    bf.close();
                } else {
                    return null;
                }

            } catch (IOException e) {
                System.err.println("ERROR: Could not close the file " + f);
            }

        }
        String[] result = new String[fileContent.size()];
        int i = 0;
        for(String s:fileContent){
            result[i] = s;
            i++;
        }

        return result;
    }
}
