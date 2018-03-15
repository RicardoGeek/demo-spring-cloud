package com.ricardogeek.demospringkafka.config;

import com.ricardogeek.demospringkafka.stream.SaludoStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(SaludoStreams.class)
public class StreamsConfig {

}
