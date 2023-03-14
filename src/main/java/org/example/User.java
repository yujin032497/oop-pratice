package org.example;

public class User {
    private String password;

    // 패스워드 초기화 메서드
    public void initPassword(PasswordGenerator passwordGenerator) {
        // 컨트롤 할 수 없는 부분을 외부로부터 주입 받아본다.
        // as - is 방식
        // 내부에서 생산하는 것은 강한 결합
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        //String randomPassword = randomPasswordGenerator.generatePassword();

        // to - be 방식
        // 결합을 끊기 위해 상위 인터페이스를 생성했다.
        // import를 하지 않아도 사용할 수 있다. <- 해당 부분을 컨트롤할 수 있음.
        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */

        // 해당 조건일때만 랜덤 패스워드 생성
        //if(randomPassword.length() >= 8 && randomPassword.length() <= 12) {
        //    this.password = randomPassword;
        //}

        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
