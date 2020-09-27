// 那什么是日志？日志就是Logging，它的目的是为了取代System.out.println()
// 打印提示信息然后改错完毕删除提示语句很麻烦，而用日志信息就很方便     
import java.util.logging.Level;
import java.util.logging.Logger;
public class DLogging {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }
}