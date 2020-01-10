public class ATMfunctions{

private String custname;
private int custmoney;
private int originmoney; 

public boolean checkinitmoney(int val){


if (val < 100 || val >= 1000000){
   return false;
}

return true;

}

public void createacc(String name,int inmoney){

custname = name;
custmoney = inmoney;

} 

public void deposit(int amount){
custmoney += amount;
}


public String initview(){

return "Customer name is\t" + custname + "\nCustomer initial money is\t" + custmoney;

}

public String choicebound(int choice, int amount){
   if(choice == 1){
      custmoney += amount;
      return "Your money\t$" + amount + "\tis successfully deposited";
   }
   else{      
      if(amount < custmoney){
         custmoney -= amount;
         return "Your money\t$"+ amount +"\tis successfully substracted";
      }
   return "Your input money is bigger than your original money";   
   }
}

public String checkbalance(){
   return "Dear Customer your updated balance is" + custmoney;
}

public String checkallinfo(){
   return "Customer name is\t" + custname +"\nOriginal money is\t"+originmoney+"\nUpdated money is\t" + custmoney ;

}

public void acceptoriinput(int originmoney){
   this.originmoney = originmoney;

}



}