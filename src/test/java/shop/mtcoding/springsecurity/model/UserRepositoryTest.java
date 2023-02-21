package shop.mtcoding.springsecurity.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.ObjectMapper;

// F - DS - C - S - R - MyBatis - DB 
@MybatisTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllWithUser_test() throws Exception {
        // given
        int id = 1;

        // ObjectMapper는 Timestamp 파싱을 못함!!
        ObjectMapper om = new ObjectMapper(); // Jackson

        // when
        User userPS = userRepository.findById(id);

        String responseBody = om.writeValueAsString(userPS);
        System.out.println("테스트 : " + responseBody);

        // then
        assertThat(userPS.getId()).isEqualTo(1);
    }
}