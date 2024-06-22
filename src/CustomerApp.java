public class CustomerApp {
    public static void main (String[] args) throws Exception {
        Customer customer = new Customer("Azkiya",200,"azkiyalaili1104@gmail.com");

        System.out.println("Name : "+customer.getName());
        System.out.println("Credit List : "+customer.getCreditLimit());
        System.out.println("Email : "+customer.getEmail());

        Customer customer2 = new Customer("Laili", "Lailihamzah1104@gmail.com");

        System.out.println("Name : "+customer2.getName());
        System.out.println("Credit List : "+customer2.getCreditLimit());
        System.out.println("Email : "+customer2.getEmail());

        System.out.println((customer2.creditLimit==1000?"Correct Constructor default CreditLimit":"Wrong Constructor default CreditLimit"));

        Customer customer3 = new Customer();

        System.out.println("Name : "+customer3.getName());
        System.out.println("Credit List : "+customer3.getCreditLimit());
        System.out.println("Email : "+customer3.getEmail());

        System.out.println((customer3.getName()=="default_name"?"Correct Constructor default Name":"Wrong Constructor default Name"));
        System.out.println((customer3.getEmail()=="default@mail.com"?"Correct Constructor default Email":"Wrong Constructor default Email"));
    }  
        
}
