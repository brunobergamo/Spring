

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Felipe
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("idolos.xml");

        Competidor competidor = (Competidor) ctx.getBean("piano");
        competidor.apresentar();
    }

}
