import org.apache.log4j.Logger;


public class Multiply implements BinaryOperation {
    Logger logger = Logger.getLogger(Multiply.class.getName());
    public double calculate(double v, double v1) {
        logger.info("Multiply is called");
        return v * v1;
    }

    public boolean isBinary() {
        return true;
    }
}
