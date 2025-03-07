package com.microservices.limit_service.bean;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Limits {

    private int minimum;
    private int maximum;
}
