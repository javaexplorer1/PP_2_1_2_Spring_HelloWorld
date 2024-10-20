import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage());

        Cat cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getMessage());

        System.out.println("Сравнение бинов HelloWorld по ссылке : " + (bean == bean2));
        System.out.println("Сравнение бинов Cat по ссылке : " + (cat == cat2));
    }
}