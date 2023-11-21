package com.example.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoders;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.http.HttpMethod;
import reactor.core.publisher.Mono;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {


//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http){
//        http.authorizeExchange(exchanges -> exchanges
////                        .pathMatchers(HttpMethod.POST,"/product-service/api/product/**").hasRole("ADMIN")
////                        .pathMatchers(HttpMethod.PUT,"/product-service/api/product/**").hasRole("ADMIN")
////                        .pathMatchers(HttpMethod.DELETE,"/product-service/api/product/**").hasRole("ADMIN")
//                                //.pathMatchers(HttpMethod.GET, "/api/user/**").hasRole("USER")
//                                .pathMatchers(HttpMethod.GET, "/api/user/**").permitAll()
//                                .pathMatchers(HttpMethod.PUT, "/user-service/api/user/**").hasRole("ADMIN")
//                                .pathMatchers(HttpMethod.DELETE, "/user-service/api/user/**").hasRole("ADMIN")
////                        .pathMatchers(HttpMethod.GET, "/order-service/api/order/getUserOrder").authenticated()
////                        .pathMatchers(HttpMethod.POST, "/order-service/api/order/placeOrder").authenticated()
////                        .pathMatchers(HttpMethod.POST, "/order-service/api/order/**").hasRole("ADMIN")
////                        .pathMatchers(HttpMethod.PUT, "/order-service/api/order/**").hasRole("ADMIN")
////                        .pathMatchers(HttpMethod.DELETE, "/order-service/api/order/**").hasRole("ADMIN")
////                        .pathMatchers(HttpMethod.DELETE, "/inventory-service/api/invertory/**").hasRole("ADMIN")
////                        .pathMatchers(HttpMethod.GET, "/product-service/api/product/getAll").permitAll()
//                                .pathMatchers(HttpMethod.GET, "/actuator/**").permitAll()
//                                .pathMatchers(HttpMethod.GET, "/actuator/gateway/routes").permitAll()
//                )    .oauth2ResourceServer(
//                oauth2ResourceServer -> oauth2ResourceServer
//                        .jwt(jwt -> jwt.jwtDecoder(jwtDecoder))
//        );
////                .oauth2ResourceServer(
////                        oauth2ResourceServer -> oauth2ResourceServer.jwt.jwtDecoder()
////        ).jwt().jwtAuthenticationConverter().jwtDecoder();
////
////                .oauth2ResourceServer(oauth2ResourceServer ->
////                        oauth2ResourceServer
////                                .jwt
////                                        (jwt -> jwt
////                                        .jwtAuthenticationConverter(grantedAuthoritiesExtractor())
////                                )
////                );
//
//
//
//
////                .oauth2ResourceServer(oauth2ResourceServer ->
////                        oauth2ResourceServer
////                                .jwt(jwt -> jwt
////                                        .jwtAuthenticationConverter(grantedAuthoritiesExtractor())
////                                )
////                );
//
////                .oauth2ResourceServer((oauth2) -> oauth2.jwt((Customizer<ServerHttpSecurity.OAuth2ResourceServerSpec.JwtSpec>)))
////
////                .oauth2ResourceServer().jwt().jwtAuthenticationConverter(grantedAuthoritiesExtractor()).and()
////                .and().csrf().disable();
//
//        return http.build();
//    }
//
//    @Bean
//    public ReactiveJwtDecoder reactiveJwtDecoder() {
//        // Replace "your-jwk-set-uri" with the actual URL of your JSON Web Key Set (JWKS) endpoint.
//        return ReactiveJwtDecoders.fromIssuerLocation("your-jwk-set-uri");
//    }
//
//    Converter<Jwt, Mono<AbstractAuthenticationToken>> grantedAuthoritiesExtractor(){
//        JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
//       // jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(new KeycloakRoleConverter());
//        return new ReactiveJwtAuthenticationConverterAdapter(jwtAuthenticationConverter);
//    }
//}
}