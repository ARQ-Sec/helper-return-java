package com.arq.helperreturnjava.security;

import java.security.MessageDigest;

public class LegacyDigestFactory {
    public MessageDigest build() throws Exception {
        return DigestFactoryAlias.legacy();
    }
}

final class DigestFactoryAlias {
    static MessageDigest legacy() throws Exception {
        return MessageDigest.getInstance("MD5");
    }
}
