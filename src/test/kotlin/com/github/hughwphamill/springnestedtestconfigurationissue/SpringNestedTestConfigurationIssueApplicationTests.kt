package com.github.hughwphamill.springnestedtestconfigurationissue

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Configuration
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
@ContextConfiguration(classes = [SpringNestedTestConfigurationIssueApplicationLoadFailure.NestedTestConfiguration::class])
class SpringNestedTestConfigurationIssueApplicationLoadFailure {

	@Test
	fun contextLoads() {
	}

	@Configuration
	inner class NestedTestConfiguration
}
