package main.start;

public class BreakContinueReturn {
    public static void main(String[] args) {
    int [] array = {2, 9, 6, 7};
        System.out.println(array);

    for (int i = 0; i<=3; i++) {
        System.out.println("Cycle №" + i + "start");
        System.out.println(array[i]);
        if (array [i] == 9){
            System.out.println("Found 9");
            break;
        }
        System.out.println("Cycle №" + i + "finish");
    }
//            int trainingsPassed = 0;
//            while (trainingsPassed < 10){
//                trainingsPassed++;
//            }
//            System.out.println(trainingsPassed);
//

}
}
