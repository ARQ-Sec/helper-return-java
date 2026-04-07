package com.arq.helperreturnjava.security;
import java.security.MessageDigest;
public class SecureDigestFactory { public MessageDigest build() throws Exception { return MessageDigest.getInstance("SHA-256"); } }
