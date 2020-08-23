package com.example.demo;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodeDecode {

    public static  void main(String[] args) {
        /*byte[] underscored = "root_user".getBytes(StandardCharsets.UTF_8);
        System.out.println(Base64.getUrlDecoder().decode(underscored));
        byte[] dashed = "root_pwd".getBytes(StandardCharsets.UTF_8);
        System.out.println(Base64.getUrlDecoder().decode(dashed));*/
        String encodedEmail = new String(Base64.getEncoder().encode(
               "root_user".getBytes(StandardCharsets.UTF_8)));
        System.out.println(encodedEmail);

        String encodedPwd = new String(Base64.getEncoder().encode(
                "root_pwd".getBytes(StandardCharsets.UTF_8)));
        System.out.println(encodedPwd);
        System.out.println("Decoded");
        System.out.println(Base64.getUrlDecoder().decode("YWRtaW4="));
        System.out.println(Base64.getUrlDecoder().decode("cGFzc3dvcmQ="));
        
        //String encodedString = "bW9uZ29kYjovL2FkbWluOnBhc3N3b3JkQG1vbmdvZGI6MjcwMTcvZ3Vlc3Rib29rP2F1dGhTb3VyY2U9YWRtaW4=";
        String encodedString = "bW9uZ29kYjovL21vbmdvZGI6MjcwMTcvdGVzdA==";
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("decodedString --> " + decodedString);
        
        String str = "mongodb://mongo:27017/test";
        System.out.println("str encode ::: " + Base64.getEncoder().encodeToString(str.getBytes()));

    }
}
