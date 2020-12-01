package cn.demo.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;

/**
 * <功能描述>
 *
 * @author xuli1294844209@qq.com
 * @createTime 2020/12/1
 **/
public class JwtUtil {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String s = generateJwt();
//        System.out.println("s = " + s);
//        testParseJwt(s);
        new JwtUtil().testJwt();
    }
    public static String generateJwt(){

        //eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0iLCJpYXQiOjYwOTA1NDA0ODAwfQ.rOw_r6Bd70vcC8Bzcb96Z34ldN8k8FknKNDqoEyY1js
        //eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0xMjMiLCJpYXQiOjYwOTA1NDA0ODAwfQ.4eiAa3PpOqbMi_fZ53ql2vH9izqAexoBTxHsWGfOjaY
        //eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0xMjMiLCJpYXQiOjYwOTA1NDA0ODAwfQ.4eiAa3PpOqbMi_fZ53ql2vH9izqAexoBTxHsWGfOjaY
        // {"jti":"888","sub":"小白","iat":60905404800}
        //;
        //eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODgiLCJzdWIiOiIxMjMiLCJpYXQiOjYwOTA1NDA0ODAwfQ.CAX6bT4A26dqogExYPgzpvIpRzpQqy4DqyVw7kxx6uo
        JwtBuilder builder= Jwts.builder()
                .setId("888")             //设置唯一编号
                .setSubject("123")       //设置主题  可以是JSON数据
                .setIssuedAt(new Date(1999,12,7))  //设置签发日期
                .signWith(SignatureAlgorithm.HS256,"xzzb");//设置签名 使用HS256算法，并设置SecretKey(字符串)
        return builder.compact();
    }
    public static void testParseJwt(String compactJwt){
        Claims claims = Jwts.parser().
                setSigningKey("xzzb").
                parseClaimsJws(compactJwt).
                getBody();
        String[] strs=new String[4];
        System.out.println(claims);
    }
    public void testJwt() throws UnsupportedEncodingException {
//        System.out.println("new String(Base64.getEncoder().encode(\"{\\\"typ\\\":\\\"JWT\\\",\\\"alg\\\":\\\"HS256\\\"}\".getBytes())) = " + new String(Base64.getEncoder().encode("{\"typ\":\"JWT\",\"alg\":\"HS256\"}".getBytes())));
//        byte[] eyJhbGciOiJIUzI1NiJ9s = Base64.getDecoder().decode("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9");
//        System.out.println("eyJhbGciOiJIUzI1NiJ9s.toString() = " + new String(eyJhbGciOiJIUzI1NiJ9s));

//        byte[] eyJhbGciOiJIUzI1NiJ9s = Base64.getDecoder().decode("eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWV9");
//        System.out.println("eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0iLCJpYXQiOjYwOTA1NDA0ODAwfQ.toString() = " + new String(eyJhbGciOiJIUzI1NiJ9s));
        //解决

       //eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJhcHAiXSwibmFtZSI6bnVsbCwiaWQiOm51bGwsImV4cCI6MjAzODI2ODAzMSwiYXV0aG9yaXRpZXMiOlsidmlwIiwidXNlciJdLCJqdGkiOiJmNDIwYzRjZC0wMDdjLTRlZTctYTJlNi04NmQzNWVkZjEwYWUiLCJjbGllbnRfaWQiOiJ4enpiIiwidXNlcm5hbWUiOiIxMzkwNDIxMTkzOSJ9.2XwaVdAqWvuP4Ll1577qhwLay41SUQYAYReXQhdRKIhFUISA_RAPA0sDa-GKYMCaKJT4jB0eLm-P02j2mCwmsyTJXW1DbHCC1xm8QDRP868-LzU1zenDW1ytV61QJSREq0cdxqqvyNoeAxCgWRPr9f0CFdVKHFgX-iQPSydb4clhuNAaWvks5t10Wdycm0j0xMpMkfEXZO7t-JQBX3AGmDmxm6s2WEaF9oyBh0JWNj3VHRUt0vToqJOFkmCLDSaq-pVX__MvHINmDsLBdMx57p8RkD5rx9yB3T3g0Tefk3R2OdXX4_CLX5Zo12_z4KUgxx_QXGJZeN9BwjhLb2LdlA
        byte[] eyJhbGciOiJIUzI1NiJ9s = Base64.getUrlDecoder().decode("eyJzY29wZSI6WyJhcHAiXSwibmFtZSI6bnVsbCwiaWQiOm51bGwsImV4cCI6MjAzODI2ODAzMSwiYXV0aG9yaXRpZXMiOlsidmlwIiwidXNlciJdLCJqdGkiOiJmNDIwYzRjZC0wMDdjLTRlZTctYTJlNi04NmQzNWVkZjEwYWUiLCJjbGllbnRfaWQiOiJ4enpiIiwidXNlcm5hbWUiOiIxMzkwNDIxMTkzOSJ9");
        System.out.println("eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0iLCJpYXQiOjYwOTA1NDA0ODAwfQ.toString() = " + new String(eyJhbGciOiJIUzI1NiJ9s));
    }
    public static void hs256(){
        String s = "rOw_r6Bd70vcC8Bzcb96Z34ldN8k8FknKNDqoEyY1js";
    }
}
