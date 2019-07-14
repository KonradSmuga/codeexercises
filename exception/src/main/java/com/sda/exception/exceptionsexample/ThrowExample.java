package com.sda.exception.exceptionsexample;

public class ThrowExample {

    public static void main(String[] args) {
        ClassRegisterService classRegisterService = new ClassRegisterService();

        try {
            classRegisterService.signStudent();
        } catch (ClassLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }

}
