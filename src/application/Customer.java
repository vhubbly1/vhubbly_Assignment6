/*
 * Class: CMSC203 
 * Instructor:Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 07/29/2023
 * Platform/compiler:IDE Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here:Vivek Hubbly
*/

package application;
public class Customer extends Object {
    private String name;
    private int age;
    
    public Customer(Customer c) {
        name = c.getName();
        age = c.getAge();
}
    
    public Customer(String name, int age) {
            this.name = name;
            this.age= age;
    }
    
    public int getAge() {
        return age;
}
    public void setAge(int age) {
        this.age = age;
}    
    public String getName() {
        return name;
} 
    public void setName(String name) {
        this.name = name;
} 
    public String toString() {
            return name +", " +age +"y/o";
    }
}




