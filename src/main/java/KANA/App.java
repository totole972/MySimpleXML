package KANA;
import java.io.IOException;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.ParsingException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  throws IOException
    {
          Builder bd= new Builder();
        try {
            //args[0] doit contenir le chemin du fichier
            Document doc= bd.build(args[0]);
            System.out.println(doc.toXML());
        } catch (ParsingException e) {
            e.printStackTrace();
        }
    }

    public boolean xxx()
    {
        return true;
    }
}
