import edu.uniandes.ecos.tamRelativo.mundo.TablaResultado;
import edu.uniandes.ecos.tamRelativo.mundo.TamRelativo;
import java.net.URISyntaxException;
import static spark.Spark.get;
import java.util.Iterator;
import java.util.LinkedList;
import static spark.Spark.get;
import static spark.Spark.get;
import static spark.Spark.get;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;
import static spark.Spark.get;
import static spark.Spark.get;
import static spark.Spark.get;
import static spark.Spark.get;
import static spark.SparkBase.port;

/**
 * Calse de presentacion donde se muestran los resultados.
 *
 * @author Leonardo Valbuena Calderon
 * @date 14/03/2016
 */
public class InterfazTamRelativo {

    /**
     * Main de la aplicacion
     *
     * @param args
     */
    //@METODO
    public static void main(String[] args) {
        TamRelativo relativo = new TamRelativo();        
        mostrarResultados(relativo.iniciarCalculos());
    }

    /**
     * Utilizando Heroku se muestran los resultados
     *
     * @param result
     */
    //@METODO
    public static void mostrarResultados(LinkedList result) {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
        get("/", (req, res) -> getHtml(result));
    }

    /**
     * Genera el codigo html del resultado
     *
     * @param result
     * @return
     */
    //@METODO
    public static StringBuffer getHtml(LinkedList result) {
        StringBuffer html = new StringBuffer();
        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<table border=1>");
        html.append("<tr>");
        html.append("<th></th>");
        html.append("<th>VS</th>");
        html.append("<th>S</th>");
        html.append("<th>M</th>");
        html.append("<th>L</th>");
        html.append("<th>VL</th>");
        html.append("</tr>");

        Iterator iterador = result.iterator();        
        while (iterador.hasNext()) {
            TablaResultado res = (TablaResultado) iterador.next();
            html.append("<tr>");
            html.append("<td> Test " + res.getNombre() + "</td>");
            html.append("<td>" + res.getVs() + "</td>");
            html.append("<td>" + res.getS() + "</td>");
            html.append("<td>" + res.getM() + "</td>");
            html.append("<td>" + res.getL() + "</td>");
            html.append("<td>" + res.getVl() + "</td>");
            html.append("</tr>");
        }
        html.append("</table>");
        html.append("</body>");
        html.append("</html>");
        return html;
    }

    

}
