import org.apache.log4j.Logger;


public class Divide implements BinaryOperation {
    Logger logger = Logger.getLogger(Divide.class.getName());
    @Override
    public double calculate(double v, double v1) {
        logger.info(Divide.class.getName()+" is called");
        return v / v1;
    }

    @Override
    public boolean isBinary() {
        return true;
    }
}
