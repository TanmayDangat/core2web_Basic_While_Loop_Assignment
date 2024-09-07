package Basic_While_Loop_Assignment;

public class Q_9 {
    public static void main(String[] args) {
        int i = 150;
        int sum = 0;
        while(i >= 101){
            if(i % 2 != 0){
                sum += i;
            }
            i--;
        }
        System.out.println(sum);

    }
}
