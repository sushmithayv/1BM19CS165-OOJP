import java.util.Scanner;

class Bank
{
int deposit_balance;
int wthdraw_balance;
String customername;
String Account_Number;
String Account_Type;
int Balance=27890;
void accept()
{
Scanner s=new Scanner(System.in); 
System.out.println("Enter the customer name\n");
customername=s.next();
System.out.println("Enter the Account Number\n");
Account_Number=s.next();
System.out.println("Enter the Account type\n");
Account_Type=s.next();
}
void display()
{
System.out.println("CUSTOMER  NAME : "+customername);
System.out.println("ACCOUNT NUMBER : "+Account_Number);
System.out.println("ACCOUNT TYPE : "+Account_Type);

}

}
class curr_acct extends  Bank{

int updated_balance;
int After_cwithdrawn;
int   updated_lost_cbalance;


int cdepo_ba(){

updated_balance=Balance+deposit_balance;
return updated_balance;
}
int cwith_ba(){
After_cwithdrawn=((updated_balance)-(wthdraw_balance));
return After_cwithdrawn;
}
int minimum()
{
if((After_cwithdrawn)<=(2000))
{
updated_lost_cbalance=((After_cwithdrawn)-(200));
System.out.println("you have minimum balance below 2000 so u have lost 200 rs");

return updated_lost_cbalance;

}

else
return After_cwithdrawn;


}

}
class sav_acct extends Bank{

int supdated_balance;
int  After_swithdrawn;
int updated_lost_sbalance;
int compound_interest;
int sdepo_ba(){

supdated_balance=Balance+deposit_balance;
return supdated_balance;
}
int interest()
{
double r=0.08;
int n=12;
int t=5;
compound_interest=(int)((supdated_balance)*(Math.pow((1+(r/n)),(n*t))));
return compound_interest;
}

int Swith_ba(){
After_swithdrawn=((compound_interest)-(wthdraw_balance));
return After_swithdrawn;
}

int minimum()
{
if((After_swithdrawn)<=(1000))
{
updated_lost_sbalance=((After_swithdrawn)-(100));
return updated_lost_sbalance;

}

else
return After_swithdrawn;
}
}

class Transactions{
public static void main(String args[]){
Scanner r=new Scanner(System.in);
curr_acct CA=new curr_acct();
CA.accept();
System.out.println("Enter the money u want to deposit in current account in rupees");
CA.deposit_balance=r.nextInt();
CA.display();
System.out.println("After your deposition of "+CA.deposit_balance+"\nNow your total balance is RS-"+CA.cdepo_ba());
System.out.println("Enter the money you want to withdraw in rupees");
CA.wthdraw_balance=r.nextInt();
System.out.println("After your withdrawal of "+CA.wthdraw_balance+"\nNow your total balance is RS-"+CA.cwith_ba());
System.out.println("After checking if u have minimum balance are not your updated total balance is RS-"+CA.minimum());
sav_acct SA=new sav_acct();
SA.accept();
System.out.println("Enter the money u want to deposit in Saving account");
SA.deposit_balance=r.nextInt();
SA.display();
System.out.println("After your deposition of "+SA.deposit_balance+"\nNow your total balance is RS-"+SA.sdepo_ba());
System.out.println("After interest ur updated balance is RS-"+SA.interest());
System.out.println("Enter the money you want to withdraw in Saving account");
SA.wthdraw_balance=r.nextInt();
System.out.println("After your withdrawal of RS-"+SA.wthdraw_balance+"\nNow your total balance is RS-"+SA.Swith_ba());

System.out.println("After checking if u have minimum balance are not your updated total balance is RS-"+SA.minimum());


}
}