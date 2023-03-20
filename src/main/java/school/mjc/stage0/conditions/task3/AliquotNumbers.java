package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (second % first == 0) System.out.println("Aliquot");
        else System.out.println("Not aliquot");
    }
    int aliquotSum(int number){
        if(number==1) return 0;
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                sum += i;
                int d = number/i;
                if(d != i) {
                    sum+=d;
                }
            }
        }
        return sum;
    }

}
