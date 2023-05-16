public class NestedLoopPractice {
    public static void main(String[] args) {
        NestedLoopPractice n = new NestedLoopPractice();
    }

    public NestedLoopPractice() {
        //pattern1();
        // pattern2();
        //pattern3();
        //pattern4();
        //pattern6();
        //pattern7();
        pattern75();


    }

    public void pattern1() {
        //code for patern here
        // Outer loop controls the number of rows
        for (int i = 0; i < 30; i += 5) {
            System.out.println(i);
        }

        System.out.println();
    }

    public void pattern2() {
        //code for pattern2
        int increment = 5; // The increment value between pattern numbers
        int startingNumber = 2; // The starting number of the pattern

        // Outer loop controls the number of rows
        for (int i = 0; i < 6; i++) {
            // Inner loop generates the pattern values
            for (int j = 0; j <= i; j++) {
                // Compute the pattern value based on the index
                int value = startingNumber + (j * increment);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public void pattern3() {

        int decrement = 4; // The decrement value between pattern numbers
        int startingNumber = 21; // The starting number of the pattern

        // Outer loop controls the number of rows
        for (int i = 0; i < 6; i++) {
            // Inner loop generates the pattern values
            for (int j = 0; j <= i; j++) {
                // Compute the pattern value based on the index
                int value = startingNumber - (j * decrement);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public void pattern4() {
        //code for pattern 4
        //1 4 9 16 25 36
        System.out.println("pattern4");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i * i + "\t");
        }
    }

    public void pattern5() {
//code for pattern 5
        //1 2 3 4
        //1 2 3 4
        //1 2 3 4
        //1 2 3 4
        System.out.println("\npattern 5");
        for (int x = 0; x < 4; x++) {
            for (int i = 1; i < 4; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        //Pattern 6:
        //1
        // 2 2
        //3 3 3
        //4 4 4 4
        //5 5 5 5 5
        System.out.println("pattern 6");
        for (int b = 0; b < 6; b++) {

            for (int c = 1; c < b; c++) {
                System.out.print(" ");

            }
            System.out.println(b);
        }

    }

    public void pattern7() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public void pattern75(){
        //1 1 1 1 1
        //2 2 2 2
        //3 3 3
        //4 4
        //5

                int rows = 5;

                for (int i = 1; i <= rows; i++) {
                    for (int j = i; j <= rows; j++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            }
            public void pattern8(){
//*****
//****
//***
// **
//  *

            }
        }

























