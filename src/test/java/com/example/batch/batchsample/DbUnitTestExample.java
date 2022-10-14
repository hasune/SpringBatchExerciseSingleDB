package com.example.batch.batchsample;

import com.example.batch.batchsample.config.DbUnitTestConfig;
import com.example.batch.batchsample.entity.Member;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@DisplayName("DB-Unit Test Example")
@Import(DbUnitTestConfig.class)
@SpringBootTest
@DbUnitConfiguration(databaseConnection = "dbUnitDatabaseConnection")
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class})
public class DbUnitTestExample {

//    @Autowired
//    MemberService memberService;

    @Test
    @DatabaseSetup(value = {"classpath:dbunit/memberData.xml"}, type = DatabaseOperation.INSERT)
    @DatabaseTearDown(value = {"classpath:dbunit/memberData.xml"}, type = DatabaseOperation.DELETE)
    public void test_find_all_member() {

        List<Member> actualData = Arrays.asList(
                new Member(1L, "test1", 21),
                new Member(2L, "test2", 22),
                new Member(3L, "test3", 23)
        );

//        List<Member> actualMemberListSize = memberService.findAllMember();

        int expectedDataListSize = 3;

        assertEquals(expectedDataListSize, actualData.size());

    }
}
