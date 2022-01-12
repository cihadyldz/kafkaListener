package com.intellica.kafkalistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Sender implements ApplicationRunner {

    public static void main(String[] args) {
       // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SpringApplication.run(Sender.class);

    }

    @Autowired
    private KafkaTemplate<Integer, String> template;



    public void send(String toSend, int key) {
        template.send("topic1", key, toSend);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        send("test", 42);
    }
}
