import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

public class EPracLog {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(EPracLog.class.getName());
        logger.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            logger.info(e.getMessage());
        }
        logger.info("Process end.");

    }
}