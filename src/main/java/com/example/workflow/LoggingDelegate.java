package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


public class LoggingDelegate implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("\n\n ....LoggerDelegate invoked by "
                + "ProcessDefinitionId=" + delegateExecution.getProcessDefinitionId()
                + " activityId=" + delegateExecution.getCurrentActivityId()
                + " activityName=" + delegateExecution.getCurrentActivityName()
                + " processInstanceID=" + delegateExecution.getProcessInstanceId()
                + " businessKey=" + delegateExecution.getProcessBusinessKey()
                + " executionId=" + delegateExecution.getId()
                + "\n\n"
        );
    }
}
