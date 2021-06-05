package com.example.mybatis.tool.tuxingma;

import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;



@Component
public class VerificationCodeException  extends AuthenticationException {
    public VerificationCodeException() {
        super("验证码错误");
    }
}
