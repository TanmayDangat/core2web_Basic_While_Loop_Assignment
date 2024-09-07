// package Basic_While_Loop_Assignment;

public class Q_6 {
    public static void main(String[] args) {
        int i = 65;
        while(i <= 90){
            if(i == 65 || i == 69 || i == 73 || i == 79 || i == 85){
                i++;
                continue;
            }
            System.out.print((char)i + " ");
            i++;

        }
    }
}
