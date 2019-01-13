package com.company.sdacademy.sdacademy.cipher;

import java.util.Random;

public class CaesarsCipher implements Cipher {
    private int seed;

    public CaesarsCipher(int seed) {
        this.seed = seed;
    }
    public CaesarsCipher(){
        Random rnd = new Random();
        this.seed = rnd.nextInt(32);
    }
    @Override
    public String encrypt(String text) {
        char[] buffer = text.toCharArray();
        for(int i = 0; i <buffer.length; i++){
            buffer[i] = (char)((int)buffer[i] + this.seed);
        }
        return String.copyValueOf(buffer);
    }
    @Override
    public String decrypt(String text) {
        char[] buffer = text.toCharArray();
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (char) ((int) buffer[i] + this.seed);
        }
        return String.copyValueOf(buffer);
    }
}
