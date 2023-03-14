package org.example;

/**
 * 테스트 코드를 이후에 짤려고 할 때,
 * 테스트 코드를 짜기 어려운 이유는 RandomPasswordGenerator가 몇 글자의 패스워드를 만들지 모르기 때문 <- 컨트롤 불가하기 떄문
 * 따라서 PasswordGenerator 라는 상위 인터페이스 생성
 */

@FunctionalInterface // 구현체를 만들지 않아도 됌.
public interface PasswordGenerator {
    String generatePassword();
}
