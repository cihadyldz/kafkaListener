package com.intellica.kafkalistener;

import org.springframework.kafka.core.ConsumerFactory;

import java.util.List;

public class ConsumerFactoryWrapper {
    List<ConsumerFactory<Integer, String>> kafkaPropList;
}
