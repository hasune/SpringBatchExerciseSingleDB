package com.example.batch.batchsample.job.batch1;

import com.example.batch.batchsample.dto.MemberProcessResult;
import com.example.batch.batchsample.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MemberDataProcessor implements ItemProcessor<Member, MemberProcessResult> {

    @Override
    public MemberProcessResult process(Member item) throws Exception {
        System.out.println("hello batch-processor");
        return null;
    }
}
