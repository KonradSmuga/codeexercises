package com.sda.exception.exceptionsexample;

public class ClassRegisterService {

    public void signStudent() throws ClassLimitExceededException{

        throw new ClassLimitExceededException("Example message");

    }

}
