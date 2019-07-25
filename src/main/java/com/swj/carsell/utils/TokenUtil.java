package com.swj.carsell.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.swj.carsell.model.Admin;

public class TokenUtil {

    public static String getToken(Admin admin) {
        String token="";
        token= JWT.create().withAudience(admin.getId())// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(admin.getPassword()));// 以 password 作为 token 的密钥
        return token;
    }
}
