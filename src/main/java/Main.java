import org.apache.logging.log4j.*;

import java.util.UUID;

public class Main {

    public static final Logger logger = LogManager.getLogger();
    public static final Marker SENTENCE_MARKER = MarkerManager.getMarker("SENTENCE");
    public static final Marker QUESTION_MARKER = MarkerManager.getMarker("QUESTION");

    public static void main(String[] args) throws InterruptedException {
        var n = Integer.parseInt(args[0]);
        for (int i = 1; i<=n; i++){
            ThreadContext.put("iteració_szám",String.valueOf(i));
            logger.fatal(SENTENCE_MARKER,"Locsolkodni vicces dolog,");
            logger.error(SENTENCE_MARKER,"mert ilyenkor vödröt fogok,");
            logger.warn(SENTENCE_MARKER,"hideg vízzel megtöltöm,");
            logger.info(SENTENCE_MARKER,"a lányok fejére öntöm! ");
            logger.debug("Veled ilyet nem teszek, ");
            logger.trace(SENTENCE_MARKER,"Inkább kölnit veszek.");
            logger.fatal(QUESTION_MARKER,"Szabad-e locsolni?");
            ThreadContext.clearAll();
            Thread.sleep(1000);
        }
    }
}
