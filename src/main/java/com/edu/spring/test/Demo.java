package com.edu.spring.test;

class OuterClass {

    private int OuterPrivateInt = 0;
    public int OuterPublicInt = 1;
    public OuterClass() {
    }
    private void OuterPrivateMethod() {
        System.out.println("outer private method.");
    }
    public void OuterPublicMethod() {
        System.out.println("outer public method.");
    }

    public void outerTest() {
        System.out.println("***********************Outer Test***********************");
        InnerClass innerObj = new InnerClass();

        // access inner private member
        System.out.println("inner class private int: " + innerObj.InnerPrivateInt);

        // access inner public member
        System.out.println("inner class public int: " + innerObj.InnerPublicInt);

        // call inner public method
        innerObj.InnerPublicMethod();

        // call inner private method
        innerObj.InnerPrivateMethod();

        System.out.println("***********************Outer Test*********************** \n");

        // inner test one
        innerObj.innerTestOne();

        // inner test two
        innerObj.innerTestTwo();
    }

    class InnerClass {
        private int InnerPrivateInt = 2;
        public int InnerPublicInt = 3;
        private void InnerPrivateMethod() {
            System.out.println("inner private method.");
        }
        public void InnerPublicMethod() {
            System.out.println("inner public method.");
        }

        public void innerTestOne() {
            System.out.println("***********************Inner Test One***********************");

            // call outer class private method
            OuterPrivateMethod();

            // call outer class public method
            OuterPublicMethod();

            // access outer class private member
            System.out.println("outer class private int: " + OuterPrivateInt);

            // access outer class public member
            System.out.println("outer class public int: " + OuterPublicInt);

            System.out.println("***********************Inner Test One*********************** \n");
        }

        public void innerTestTwo() {
            System.out.println("***********************Inner Test Two***********************");

            OuterClass outerObj = new OuterClass();

            // access outer class private member
            System.out.println("outer class private int: " + outerObj.OuterPrivateInt);

            // access outer class public member
            System.out.println("outer class public int: " + outerObj.OuterPublicInt);

            // call outer class private method
            outerObj.OuterPrivateMethod();

            // call outer class public method
            outerObj.OuterPublicMethod();

            System.out.println("***********************Inner Test Two***********************");
        }
    }
}
public class Demo {

    public static void main(String[] arg) {
        OuterClass obj = new OuterClass();

        obj.outerTest();
    }

}