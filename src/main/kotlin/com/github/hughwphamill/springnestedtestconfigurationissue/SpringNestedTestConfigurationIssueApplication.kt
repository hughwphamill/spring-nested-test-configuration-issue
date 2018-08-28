package com.github.hughwphamill.springnestedtestconfigurationissue

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringNestedTestConfigurationIssueApplication

fun main(args: Array<String>) {
    runApplication<SpringNestedTestConfigurationIssueApplication>(*args)
}
