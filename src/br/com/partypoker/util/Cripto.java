package br.com.partypoker.util;

import java.util.Base64;

public class Cripto {
    public static String encode(byte[] base) {
        return Base64.getEncoder().encodeToString(base);
    }

    public static String decode(String password) {
        return new String(Base64.getDecoder().decode(password));
    }


}
