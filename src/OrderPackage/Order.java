package OrderPackage;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by roi.aharonson on 5/25/17.
 */
public abstract class Order {
    ArrayList<File> sortedFiles;

    public Order(){
        this.sortedFiles = new ArrayList<>();
    }

    public ArrayList<File> sort(ArrayList<File> file){}

    public abstract void sortCondition();
}
