public class Customer {
    String name;
    double creditLimit;
    String email;

    public Customer(){
    }
    public Customer(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = 1000;
        this.email = email;
    }
    
    public String getName(){
        return name;

    }

    public String getEmail(){
        return email;
    }

    public double getCreditLimit(){
        return 1000;
    }
}
