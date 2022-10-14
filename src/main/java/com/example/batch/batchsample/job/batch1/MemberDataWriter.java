package com.example.batch.batchsample.job.batch1;

import com.example.batch.batchsample.dto.MemberProcessResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;
@Slf4j
@Component
public class MemberDataWriter implements ItemWriter<MemberProcessResult> {

    @Override
    public void write(List<? extends MemberProcessResult> items) throws Exception {

        System.out.println("hello batch-writer");
    }
}
