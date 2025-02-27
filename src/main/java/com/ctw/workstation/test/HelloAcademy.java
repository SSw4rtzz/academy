package com.ctw.workstation.test;

public class HelloAcademy {

    public ExternalMessageService externalMessageService;
    public String sayHello(String name) {
        if(name != null) {
            return externalMessageService.sayHelloFromOuterSpace(name);
        }
        return externalMessageService.sayHelloFromOuterSpace();
    }
}
