package org.example;

/**
 * 올바르게 고정된 PasswordGenerator 테스트 클래스
 */
public class CorrectFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
