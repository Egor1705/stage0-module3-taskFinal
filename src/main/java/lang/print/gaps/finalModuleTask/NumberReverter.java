package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int newNumber = 0;
        int sum = 0;

        while(number >0){
            newNumber = number % 10 + newNumber*10;
            number = number / 10;

        }
        System.out.println(newNumber);
    }
}
