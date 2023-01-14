package com.election;

public class Voter {
    private String name;
    private int age;
    static final int VOTER_ELIGIBLE_AGE = 18;
    Voter() {
        name = "";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeCriteria() {
        if (age >= VOTER_ELIGIBLE_AGE) {
            return name + " is eligible to vote";
        } else if (age < VOTER_ELIGIBLE_AGE || age == 0) {
            return name + " is not eligible to vote";
        } else if (age < 0) {
            return name + " Age can't be negative or zero";
        } else {
            return name;
        }

    }
}

