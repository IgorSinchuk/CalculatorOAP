import com.sun.org.apache.xpath.internal.operations.UnaryOperation;

import java.util.logging.Logger;


public class Sqrt implements UnaryOperation {
    private Logger logger = Logger.getLogger(Sqrt.class.getName());

    @Override
    public double calculate(Double aDouble) {
        logger.info("Sqrt is used");
        return Math.sqrt(aDouble);
    }

    @Override
    public boolean isBinary() {
        return false;
    }
}
