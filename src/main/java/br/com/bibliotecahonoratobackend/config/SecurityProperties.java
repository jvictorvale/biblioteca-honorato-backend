package br.com.bibliotecahonoratobackend.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "api.security")
public record SecurityProperties(
        JwtProperties jwt,
        String friendToken
) {
    public record JwtProperties(
            String secret,
            Long expirationMs
    ) {}
}
