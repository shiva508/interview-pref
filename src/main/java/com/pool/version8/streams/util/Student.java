package com.pool.version8.streams.util;

public class Student {
    private String firstName;
    private String lastName;
    private Integer eduLevel;
    private Integer age;
    private String gender;

    public Student(String firstName, String lastName, Integer eduLevel, Integer age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eduLevel = eduLevel;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(Integer eduLevel) {
        this.eduLevel = eduLevel;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", eduLevel=" + eduLevel + ", age=" + age
                + ", gender=" + gender + "]";
    }

}
