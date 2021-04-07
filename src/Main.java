public class Main {public static void main (String[] args) {
    int deposit = 150; //сумма на счёте
    int payment = 1100; //сумма пополнения
    int bonusRub = 100;
    int finalBonus;
    if (payment>=1000) {
                     finalBonus = payment/bonusRub;
                    }
    else {finalBonus=0;
          }
    int finalDeposit = deposit+payment+finalBonus;
    System.out.println (finalBonus);
    System.out.println (finalDeposit);
}
}
