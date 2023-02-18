import java.util.Scanner;
public class ATM
{
    
    public static void main(String args[] )
    { 
        ATM a=new ATM();
        int balance = 5000, withdraw=0, deposit=0;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("--------------------ATM------------------");
            System.out.println("Choose 1 for Withdraw                 ");
            System.out.println("Choose 2 for Deposit                  ");           
            System.out.println("Choose 3 for Check Balance            ");           
            System.out.println("Choose 4 for Transaction History      ");           
            System.out.println("Choose 5 for Transfer Money           ");
            System.out.println("Choose 6 for EXIT                     ");
            System.out.println("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Money Withdraw Successfully!!          ");
                    System.out.println("Please collect your money              ");
                    
                }
                else
                {
                    System.out.println("Insufficient Balance");
                    System.out.println("Please Check Your Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.out.println("Transaction History           ");
                System.out.println("Deposite Ammount : "+deposit+"   ");
                System.out.println("Withdraw Ammount : "+withdraw+"  ");
                
                break;

                case 5:
                int ACCNO,amount;
                System.out.println("Enter The Account No : ");
                ACCNO=s.nextInt();
                System.out.println("Enter The Amount  : ");
                amount=s.nextInt();
                if(balance >= amount)
                {
                    balance = balance - amount;
                    System.out.println("Transfer Money Successfully !       ");
                    
                }
                else
                {
                    System.out.println("Insufficient Balance");
                    System.out.println("Please Check Your Balance");
                }
                break;
                case 6:
                System.exit(0);
            }
        }
    }   
    
}
