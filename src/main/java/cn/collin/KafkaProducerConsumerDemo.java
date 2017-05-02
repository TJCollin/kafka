package cn.collin;

import java.util.Properties;

/**
 * Created by collin on 17-5-2.
 */
public class KafkaProducerConsumerDemo {
    public static void main(String[] args) {
        boolean isAsync = args.length == 0 || !args[0].trim().equalsIgnoreCase("sync");
        Producer producer = new Producer(KafkaProperties.TOPIC, isAsync);
        producer.start();

        Consumer consumer = new Consumer(KafkaProperties.TOPIC);
        consumer.start();
    }
}
