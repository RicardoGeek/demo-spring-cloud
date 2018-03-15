package com.ricardogeek.demospringkafka.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Saludos {
    private long timestamp;
    private String message;
}
