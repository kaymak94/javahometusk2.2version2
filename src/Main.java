public class Main {
    public static void main(String[] args) {
        int firstAccount = 1000;
        int addedAmmount = 2000;
        int bonus = addedAmmount / 100;
        int result;
        if (addedAmmount > 1000) {
            result = firstAccount + addedAmmount + bonus;
        } else {
            result = firstAccount + addedAmmount;
            bonus = 0;
        }
        System.out.println("Итоговая сумма:" + result);
        System.out.println("Количество начисленных бонусов:" + bonus);
    }

}