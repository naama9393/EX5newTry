package ExceptionPackage;

/**
 * Created by roi.aharonson on 5/25/17.
 */
public class ExceptionType1 extends Exception {
    private int line;
    public ExceptionType1(int line){
        this.line = line;
    }
    public String getMessage(){
        return "Warning in line " + Integer.toString(line);
    }

}
