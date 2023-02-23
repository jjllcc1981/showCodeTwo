package com.example.showcodetwo.testcase;

import com.example.showcodetwo.tools.TestReport_original;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Slf4j
@Listeners({TestReport_original.class})
public class RunTestTwoTest {
    @BeforeClass()
    public void beforeClass() {
        log.info("==== LogInTest star ====");

    }
    @AfterClass
    public void afterClass() {
        log.info("==== LogInTest end ====");
    }

    @Test(description = "RunTestTwoTest --- one")
    public void runOne(){
        log.info("======== RunTestTwoTest run one");
    }

    @Test(description = "RunTestTwoTest --- two")
    public void runTwo(){
        log.info("======== RunTestTwoTest run two");
    }
}
