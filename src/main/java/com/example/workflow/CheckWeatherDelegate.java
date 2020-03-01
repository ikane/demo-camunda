package com.example.workflow;

import org.apache.commons.lang3.RandomUtils;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckWeatherDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("name", "Ibou");
        delegateExecution.setVariable("weatherOk", RandomUtils.nextBoolean());
    }
}
