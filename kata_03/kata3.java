package kata_3;
/**
 * @author -_R.S.C_-
 */
public class Kata_3 {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        //increments llamada
        histogram.increment("yahoo.es");
        histogram.increment("gmail.com");
        histogram.increment("yahoo.es");
        histogram.increment("ulpgc.es");
        histogram.increment("alu.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("yahoo.es");
        histogram.increment("outlook.es");
        histogram.increment("ulpgc.es");
        histogram.increment("outlook.es");
        
        new HistogramDisplay(histogram).execute();

    }
}
