import java.io.IOException;
import java.util.ArrayList;


/**
 * Interface donnant l'accés à la méthode getResult
 */
public interface ISymptomsReader {

    public ArrayList<String> getResult(String fileName) throws IOException;

}
