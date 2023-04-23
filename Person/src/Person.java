public class Person {

    private String firstName;
    private String lastname;
    private int age = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0){
            this.age = 0;
        }
        else
            this.age = age;
    }

    public boolean isTeen(){
        if (this.age > 12 && this.age < 20){
            return true;
        }
        else
            return false;
    }

    public String getFullName(){
        if (!firstName.isEmpty() && !lastname.isEmpty())
            return (this.firstName + " " + this.lastname);
        else if (firstName.isEmpty() && lastname.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return this.lastname;
        }else
            return (this.firstName);
    }
}
