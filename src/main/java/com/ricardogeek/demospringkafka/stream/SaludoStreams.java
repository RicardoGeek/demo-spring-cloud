package com.ricardogeek.demospringkafka.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SaludoStreams {
    String INPUT = "saludos-in";
    String OUTPUT = "saludos-out";

    @Input(INPUT)
    SubscribableChannel saludoEntrante();

    @Output(OUTPUT)
    MessageChannel saludoSaliente();
}
