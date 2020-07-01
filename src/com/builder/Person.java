package com.builder;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String email;

    private Person(){

    }

    private  Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.email = builder.email;
    }

    @Override
    public String toString(){
        return "Name: " +firstName+" "+lastName
                +" Age: " + age
                +" gender: "+gender
                +" email: "+email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String email;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age){
            this.age=age;
            return this;
        }
        public Builder gender(String gender){
            this.gender=gender;
            return this;
        }
        public Builder email(String email){
            this.email=email;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }

}
