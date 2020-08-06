package com.cos.securityjwt.security;

public class JwtProperties {
    public static final String SECRET = "SomeSecretForJWTGeneration"; 
    public static final int EXPIRATION_TIME = 864000000; // 10days
    public static final String TOKEN_PREFIX = "Bearer "; 
    public static final String HEADER_STRING = "Authorization";
}
