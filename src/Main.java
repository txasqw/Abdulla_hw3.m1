public class Main {
    public static void main(String[] args) {
        double[] fractionalNums = {8, -2, -4, 2, 3, 6, -7, 5, -3, 1, 9, -6, 4, -8, 7};

        double num = 0;
        int sum = 0;
        boolean check = false;


        for (int i = 0; i < fractionalNums.length - 1; i++) {
            for (int j = i + 1; j < fractionalNums.length; j++) {
                if (fractionalNums[i] > fractionalNums[j]) {
                    double temp = fractionalNums[i];
                    fractionalNums[i] = fractionalNums[j];
                    fractionalNums[j] = temp;
                }
            }

            for (double numbers : fractionalNums) {

                //основное дз
                if (numbers < 0) {
                    check = true;
                } else if (numbers > 0 && check) {
                    num = num + numbers;
                    sum++;
                }
            }

            System.out.println(num / sum);
        }
    }

    }
