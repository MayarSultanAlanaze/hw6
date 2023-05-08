// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     } /* 1 question
         public static void main(String[] args) {
        int num1, num2;
        num1 = 5;
        num2 = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the operator (+,-,*,/)");
        try {
            char op = s.next().charAt(0);
            int M = 0;
            switch (op) {
                case '+':
                    M = num1 + num2;
                    break;
                case '-':
                    M = num1 - num2;
                    break;
                case '*':
                    M = num1 * num2;
                    break;
                case '/':
                    M = num1 / num2;
                    break;
                default:
            }
                    System.out.println("The final result: ");
                    System.out.println(num1 + " " + op + " " + num2 + " = " + M);

            } catch(IndexOutOfBoundsException e1){
                System.out.println("still run");
            } catch(InputMismatchException e2) {
            System.out.println("Please enter number!");
        }finally {
            System.out.println("Alwyas run");


            }
        }
    }*/

    
    }/* 2 question
      public static void main(String[] args) {
        int arr[] = {1, 3, 7, 8, 10};
        int temp = 0;
        Scanner S = new Scanner(System.in);
        int j = S.nextShort();
        System.out.println("Elements of given array: ");
        try {
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("please enter correct index");
        } catch (InputMismatchException e2) {
            System.out.println("please enter number");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        for (int i = 0; i < arr.length; i++) {
            for (int J = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println();
            System.out.println("Elements of array sorted in ascending order: ");
            for (int I = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");


            }
        }
    }
} */
