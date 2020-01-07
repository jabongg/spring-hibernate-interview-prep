import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import spring.*;

import java.util.*;

public class App {

    public static void main(String[] args) {
        BeanFactory factory;
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        //HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
        //HelloWorld helloWorld = context.getBean(HelloWorld.class);
        //((ConfigurableApplicationContext) context).close();
        //helloWorld.sayHello();


        //Person person = (Person) context.getBean("person");
        //System.out.println(person.toString());

        User user = (User) context.getBean("user");
        user.getCar().drive();
        System.out.println(user.getCar().toString());


        Map<Integer, Integer> map = new HashMap<>();

        Dictionary<Integer, Integer> table = new Hashtable<>();


        List<Integer> list = new ArrayList<>();
    }
}
