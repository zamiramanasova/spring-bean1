package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        System.out.println("Ссылаются ли один и тот же объект: "+ (bean==bean1));

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat);

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1);

        System.out.println("Ссылаются ли один и тот же объект: "+ (cat==cat1));

    }
}
