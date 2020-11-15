package org.example;

public class Person {
    private String id;
    private String name;
    private String gender;
    private String BirtDate;
    private Division division;
    private String Salary;

    public void setId(String id) { this.id = id;}
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setBirtDate( String BirtDate) {
        this.BirtDate = BirtDate;
    }
    public void setDivision (Division div) {this.division = div;}
    public void setSalary( String Salary) {
        this.Salary = Salary;
    }

    public String getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public String getBirtDate()
    {
        return  BirtDate;
    }

    public Division getDivision() {return division;}

    public String getSalary()
    {
        return Salary;
    }

    public String toString()
    {
        return "\n "+getID() +" "+ getName() + " " + getGender() + " " + getBirtDate() +" "+ getDivision() + " " +getSalary();
    }
}

