package cn.bcf.mybatis.enumType;

import cn.bcf.mybatis.enumType.entity.UserEntity;
import cn.bcf.mybatis.enumType.entity.UserEntitySimple;
import cn.bcf.mybatis.enumType.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootTest
public class ApplicationTests {

    @Autowired(required = false)
    UserService userService;

    @Test
    public void test001() {
        List<UserEntity> list = userService.selectAll();
        list.stream().forEach(System.out::println);
    }

    @Test
    public void test002() {
        List<UserEntitySimple> list = userService.selectAllSimple();
        list.stream().forEach(System.out::println);
    }

    @Test
    public void test003() {
        long startTime = System.nanoTime();
        List<UserEntity> list = userService.selectAll();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

    @Test
    public void test004() {
        long startTime = System.nanoTime();
        List<UserEntitySimple> list = userService.selectAllSimple();
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
    }

}
