package Problem2;

public class Customer {
    private String name;
    private double age;
    private double balance;

    public Customer(String name, double age, double balance){
        setName(name);
        setAge(age);
        setBalance(balance);
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return this.name;
    }
    public void setAge (double age){
        this.age = age;
    }
    public double getAge(){
        return this.age;
    }
    public void setBalance (double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
}
