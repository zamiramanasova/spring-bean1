package peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean(name="helloworld")
    //@Scope("prototype")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean
    @Scope("prototype")
    public Cat cat(){
        return new Cat();
    }

}
/*
1) Cat деген POJO класс тузунуз
2) AppConfig класстын ичинде cat деген класска бин тузунуз
3) Ал бинди ар бир чакырганда жаны объект тузуло тургандай кылып настройка кылыныз
4) App классында HelloWorldду дагы бир жолу жана Catти эки жолу чакырыныз.
Аларды ссылкасы менен салыштырып коруп жообун консольго чыгарыныз.
5) Тестти комментарийден чыгарып иштетип корунуз

 */