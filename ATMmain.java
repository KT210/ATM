import java.util.*;

public class ATMmain {
public static void main (String args[]){

boolean check = true; 
boolean stopper = true;
int choice;
String name;
int inmoney;

Scanner scan = new Scanner(System.in);
ATMfunctions one = new ATMfunctions();



do
{

System.out.println("Please first create your account!");
System.out.println("Enter your name");
name = scan.nextLine();
System.out.println("Deposit your initial fee $100 to open account!");
inmoney = scan.nextInt();
one.acceptoriinput(inmoney);
if (one.checkinitmoney(inmoney)){
   
   one.createacc(name,inmoney);
   System.out.println(one.initview());
   while(stopper){                                                          //while start
      System.out.println("Please select ATM functions"+"\n"+"[0]To Exit Completely"+"\n"+"[1]DEPOSIT"+"\n"+"[2]WITHDRAW"+"\n"+"[3]BALANCE INQUIRY"+"\n"+"[4]View Your Account"+"\n");
      choice = scan.nextInt();
      if(choice == 0){
         stopper = false;
         check = false;         
      }
      else if(choice > 0 && choice < 3){
         System.out.println("Enter your amount...");
         int amount = scan.nextInt();
         System.out.println(one.choicebound(choice,amount));
      }
      else if(choice == 3){
         System.out.println(one.checkbalance());
      }
      else if(choice == 4){
          System.out.println(one.checkallinfo());
         
      }
      else{
         System.out.println("Choose only from the given selection number or put the money range!!!! ");
         continue;
      }
   }                                                               //while stop                                               
}

else{
   System.out.println("Start over!!!!\n"+"Your initial deposited fee is either less than $100 or over $1000000"+"\nPlease put requested amount");
   name = scan.nextLine(); 
   continue;
}


}while(check);




}


}