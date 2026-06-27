import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String name = "Dinesh";
        int age = 21;
        double salary = 50000.0;

        logger.info("Employee Name: {}", name);

        logger.info("Employee Age: {}", age);

        logger.info("Employee Salary: {}", salary);

        logger.info("Employee Details -> Name: {}, Age: {}, Salary: {}",
                name, age, salary);
    }
}
