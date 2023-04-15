package com.oceanofbooks.orderservice.config;

import java.net.URI;

import jakarta.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ocean")
public record ClientProperties(

        @NotNull URI catalogServiceUri

) {
}