package com.codespace.task4;

public class Runner {
    public void run() {
        new MyTestClass.MyStaticNested().printTopFromStatic();
        MyTestClass myTestClass = new MyTestClass();
        MyTestClass.MyInner myInner = myTestClass.new MyInner();
        myInner.printMyTopFromInner();
        myTestClass.test("moto ");


    }
}
