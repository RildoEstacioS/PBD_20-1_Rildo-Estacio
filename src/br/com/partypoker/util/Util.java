package br.com.partypoker.util;

public class Util {
    public static boolean validarSenha(String senha) {
        return senha.matches("^.*(?=.{6,11})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=.]).*$");
    }

    public static boolean validarCPF(String senha) {
        return senha.matches("^((\\d{3}).(\\d{3}).(\\d{3})-(\\d{2}))*$");
    }

    public static boolean validarEmail(String senha) {
        return senha.matches("^([-a-zA-Z0-9_-]*@(gmail|yahoo|ymail|rocketmail|bol|hotmail|live|msn|ig|globomail|oi|pop|inteligweb|r7|folha|zipmail).(com|info|gov|net|org|tv)(.[-a-z]{2})?)*$");
    }
}
