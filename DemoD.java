// Encapsulation is the process of wrapping the code and data together into a single unit with some conditions.
// Encapsulation is about data hiding.
// IF we declare variable private:This lock them down,NO other class can touch them directly.

                // public methods which act as Interface for private variable. 
                                // The Getter Method //
                // The method read the value of a variable. 
                // Retrieve the value.It ask,"What is the data"?
                // It return the value of the private variable to other. 
                // The return type must match the variable type. 

                // Syntax-->  public String getName(){
                                    // return name;
                //            }

                                // The Setter Method //
                // It takes the value and assign it to private variable using "this" keyword.
                // We can validate the data before it get saved.
                // Update the value.It Says"Change the data to X".

                // Syntax-->  public void setName(String name){
                                    //this.name;  
                //            }
// ----------------------------------------------------------------------------------------------------------//
// Example-->1
//     class Bank{
//         String name;
//         int pin;
//         long AccountNumber;

//         Bank(String name,int pin,long AccountNumber){
//             this.name = name;
//             this.AccountNumber = AccountNumber;
//             this.pin = pin;
//             Setpin(pin);
//         }
//         public int getpin(){
//             return pin;
//         }
//         public void Setpin(int pin){
//                 if(name.equals("Rhythm")){
//                     this.pin = pin;
//                 }
//         }
// }
// public class DemoD{
//     public static void main(String[] args){
//         Bank b = new Bank("Rhythm",6482,987696657);
//             // If we change the name here we dont get pin.
//         System.out.println(b.name + " " + b.getpin() + " " + b.AccountNumber);
//     }
// }

// Example-->2
// class BankAccount{
//     private double balance;           // Private variable data hiding
//     private String OwnerName;         // Direct access id  defined can't just say "BankAccount.balance".

//     // Constructor
//     BankAccount(String name,double initialBalance){
//         this.OwnerName = name;
//         if(initialBalance > 0){
//             this.balance = initialBalance;
//         }
//     }
//     // public getter(Read Access)
//     public double getBalance(){
//         return balance;
//     }
//     public String getOwnerName(){
//         return OwnerName;
//     }
//     // public setter(assign value)
//     public void deposit(double amount){
//         if(amount > 0){
//             this.balance +=amount;
//             System.out.println("Deposited" + amount);
//         }
//         else{
//             System.out.println("Invalid amount");
//         }
//     }
// }
// public class Encapsulation{
//     public static void main(String[] args){
//         BankAccount b = new BankAccount("Rhythm",8765549);
//         System.out.println(b.getOwnerName() + " " + b.getBalance());
//     }
// }

// Example-->3  
// class College{
//     private int salary;
//     public String name;

//     College(int Salary,String name){
//         this.name = name;
//         if(name.equals("Rhythm")){
//             this.salary = Salary;
//             // Setsalary( salary);
//         }
//     }
    
//     public int getsalary(){
//         return salary;
//     }
    
//     public void Setsalary(int salary){
//         // this.salary = salary;
//     }
    
//     public void Deposited(int amount){
//         if(amount > 0){
//             // this.salary += amount;
//             System.out.println("Deposited: " + amount);
//         }
//     }
// }

// public class DemoD{
//     public static void main(String[] args){
//         College c = new College(50000, "Rhythm");
//         System.out.println("Name:" + c.name + " Salary: " + c.getsalary());
//     }
// }