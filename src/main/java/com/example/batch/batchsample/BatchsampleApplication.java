package com.example.batch.batchsample;

import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableBatchProcessing
@SpringBootApplication
public class BatchsampleApplication  {

    public static void main(String[] args) {
        SpringApplication.run(BatchsampleApplication.class, args);
    }

}

//@EnableBatchProcessing
//@SpringBootApplication
//public class BatchsampleApplication extends DefaultBatchConfigurer {
//
//    public static void main(String[] args) {
//        SpringApplication.run(BatchsampleApplication.class, args);
//    }
//
//    @Override
//    public void setDataSource(DataSource dataSource) {
//
//    }
//}
