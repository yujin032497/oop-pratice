package org.example;

/**
 * 올바르지 않게 고정된 PasswordGenerator 테스트 클래스
 */

public class WrongFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "ab"; // 2글자
    }
}
