package com.example.mybatis.tool.sstring;

/*
对象
 */
public class ObjectSor {
    private String  lastName;
    private String  firstName;
    private int age;

    public ObjectSor(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectSor{" + "lastName='" + lastName + '\'' + ", firstName='" + firstName + '\'' + ", age=" + age + '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
