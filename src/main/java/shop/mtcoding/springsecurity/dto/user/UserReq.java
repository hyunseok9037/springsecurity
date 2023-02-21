package shop.mtcoding.springsecurity.dto.user;

import lombok.Getter;
import lombok.Setter;

public class UserReq {

    @Setter
    @Getter
    public static class joinReqDto {
        private String username;
        private String password;
        private String email;
    }

    @Setter
    @Getter
    public static class LoginReqDto {
        private String username;
        private String password;
    }
}
