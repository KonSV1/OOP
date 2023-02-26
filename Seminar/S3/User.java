package Seminar.S3;

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;

    
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + ", age = " + age + "\n";
    }


    @Override
    public int compareTo(User o) {
        int conditionFirstName = firstName.compareTo(o.firstName);
        if (conditionFirstName != 0){
            return conditionFirstName;
        }

        int conditionLastName = lastName.compareTo(o.lastName);
        if  (conditionLastName != 0){
            return conditionLastName;
        }

        return this.age - o.age;
    }

    // @Override
    // public int compareTo(User o) {
    //     if (firstName.compareTo(o.firstName) != 0){
    //         return firstName.compareTo(o.firstName);
    //     }
    //     if (lastName.compareTo(o.lastName) != 0){
    //         return lastName.compareTo(o.lastName);
    //     }
    //     return this.age - o.age;
    // }
}
