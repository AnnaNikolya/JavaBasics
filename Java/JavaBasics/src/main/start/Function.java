package main.start;

public class Function {
    public static void main(String[] args) {
//        double getAverageValue(int[] array)
//        void printArrayToConsole(int[] array)
//        void printCurrentTimeToConsole()
//        double sum(double a, double b)

        int [] array = {2,9,9,7};
        printArrayToComsole(array);
        double sum = 0.0;
        sum = sumDouble(1.0, 2.0);
        System.out.println(sum);

    }

    static double sumDouble (double a, double b) {
        double sum = a+ b;
        return sum;
    }

    static void printArrayToComsole(int [] arrayToPrint){
        for (int i =0; i< arrayToPrint.length; i++)
            System.out.println(arrayToPrint[i]);

    }
}
