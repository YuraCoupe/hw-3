public class ATM {
    public int countBanknotes(int sum) {
      int number = 0;
      int index = 0;
      int moneyType[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
      while (sum > 0) {
        number += sum / moneyType[index];
        sum = sum % moneyType[index];
        index++;
      }
      return number;
    }
}
