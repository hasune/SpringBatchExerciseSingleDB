package com.example.batch.batchsample.job.config;

import com.example.batch.batchsample.dto.MemberProcessResult;
import com.example.batch.batchsample.entity.Member;
import com.example.batch.batchsample.job.batch1.MemberDataProcessor;
import com.example.batch.batchsample.job.batch1.MemberDataReader;
import com.example.batch.batchsample.job.batch1.MemberDataWriter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class JobConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job sampleJob(Step sampleJobProcess) {
        return jobBuilderFactory.get("BATCH1")
                .incrementer(new RunIdIncrementer())
                .start(sampleJobProcess)
                .build();
    }

    @Bean
    protected  Step sampleJobProcess(MemberDataReader reader, MemberDataProcessor processor, MemberDataWriter writer) {
        return stepBuilderFactory.get("Batch1_Chunk")
                .<Member, MemberProcessResult> chunk(1)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }


}
