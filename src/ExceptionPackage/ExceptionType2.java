package ExceptionPackage;

/**
 * Created by roi.aharonson on 5/25/17.
 */
public class ExceptionType2 extends Exception {
    private String message;
    public ExceptionType2(String msg){
        message = "<"+msg+">";
    }
    public String getMessage(){
        return "ERROR:\n"+message;
    }

}
