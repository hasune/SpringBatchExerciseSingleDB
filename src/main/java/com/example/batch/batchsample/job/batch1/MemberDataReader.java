package com.example.batch.batchsample.job.batch1;

import com.example.batch.batchsample.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class MemberDataReader implements ItemReader<Member> {

    @Override
    public Member read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        System.out.println("hello batch reader");
        return null;
    }
}
