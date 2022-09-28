package io.yorosoft.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.yorosoft.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
