public class Account {

    double balance;
    public void deposit(int plus) {

        System.out.println("Popolnenie");
        System.out.println("Ostatok:");
        System.out.println(  balance + plus);
    }

   public void withdrawal(int minus) {
       System.out.println("Obnalichivanie");
       System.out.println("Ostatok:");
       System.out.println( balance - minus);
    }
    public void transfer(Account account3,int a){

        System.out.println("Perevod ot:account1");
        account3.balance+=a;
        System.out.println("Ostatok:");
        System.out.println(account3.balance);
        Account account1=new Account();
        System.out.println("Perevedeno na:account3");
       account1.balance-=a;
        System.out.println(account1.balance);
    }


}
