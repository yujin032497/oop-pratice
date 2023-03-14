package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @DisplayName("패스워드를 초기화한다")
    @Test
    void passwordTest() {
        // given
        User user = new User();

        // when
        // 랜덤으로 비밀번호 자릿수가 만들어지기 때문에 조건이 만족하면 테스트 통과
        // 따라서, 실행할때마다 성공하지 않을 수 도 있음.
        //user.initPassword();

        // 그렇기에 Fixed된 Password를 주입시킨다.
        user.initPassword(new CorrectFixedPasswordGenerator());

        // PasswordGenerator 인터페이스가 @FunctionInterface 를 추가하면 람다 형식으로 변경 가능
        user.initPassword(() -> "abcdefgh");

        // then
        assertThat(user.getPassword()).isNotNull();
    }
    //@DisplayName("패스워드를 초기화한다")
    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        // given
        User user = new User();

        // when
        // 항상 8글자로 주입
        user.initPassword(new WrongFixedPasswordGenerator());

        // PasswordGenerator 인터페이스가 @FunctionInterface 를 추가하면 람다 형식으로 변경 가능
        user.initPassword(() -> "ab");

        // then
        assertThat(user.getPassword()).isNull();
    }
}
