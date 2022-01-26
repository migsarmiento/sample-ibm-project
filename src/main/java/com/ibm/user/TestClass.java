package com.ibm.user;

import com.ibm.user.entity.User;

public class TestClass {
    //instance fields
    // primitive types
    public int age;
    private long id;
    protected boolean isTall;

    // Object types
    public String name;
    private TestClass testClass;
    protected User user;

    //Constructors
    public TestClass() {}
    public TestClass(String name) {
        this.name = name;
    }

    // 1. Access Modifier: public/private/protected
    // 2. Return Type: int/long/boolean/String/TestClass/User/void
    // 3. Method Name: lowercaseUppercase - camel case EXAMPLE: getName(), getAge(), doSomething()
    // 4. Parameters: doSomething(String name), doRun(int distance), doResign(User user)
    public String getName() {
        //local variables
        // 1. Type : primitive/object type
        // 2. Variable Name :
        // 3. initialization/assign
    }

    // <access modifier> <return type> <methodName>( <parameters> )
    private int generateName() {
        // <Type> <variable name>;
        int audrey = 1;
        return audrey;
    }

    // <access modifier> <return type> <methodName>( <parameters> )
    public User getUser() {
        User user = new User();
        return user;
    }
}
