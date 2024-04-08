package model;

public abstract class User {

    private String firstName;

    private String secondName;

    private String lastName;


    public User(String firstName,String secondName,String lastName )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return " User{" + 
                " firstName = " + firstName +
                ", secondName = " + secondName +
                ", lastName = " + lastName +
                '}';
    }


}
