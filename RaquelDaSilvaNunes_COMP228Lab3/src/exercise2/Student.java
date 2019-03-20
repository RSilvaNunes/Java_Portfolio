package exercise2;

public abstract class Student {
    //Instance variables of Student abstract class
    private final String firstName;
    private final String lastName;
    private boolean status;

    //Blank final instance variable and status assigned in a constructor
    public Student(String firstName, String lastName, boolean status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Declare an abstract method to determine the tuition
    public abstract double getTuitionValue();

    @Override
    public String toString(){
        return String.format("First Name: %s%nLast Name: %s%nStatus: %b", getFirstName(), getLastName(), isStatus());
    }
}
