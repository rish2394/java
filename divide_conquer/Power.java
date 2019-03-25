import java.util.Scanner;




class Power {
    /* assuming x and y are positive integers 
     * Time Complexity - O(y) 
     * Space Complexity - O(1)
     * */
    static int power(int x, int y) {
        int answer = 1;
        while(y != 0) {
            answer *= x;
            y--;
        }
        return answer;
    }
    /* assuming x and y are positive integers
     * Time Complexity - O(logy)
     * 
     * */
    static int powerOpti(int x, int y) {
        if(y == 0) {
            return 1;
        }
        if(y % 2 == 0) {
            return  powerOpti(x, y/2) * powerOpti(x, y/2);
        } else {
            return x * powerOpti(x, y-1);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        System.out.println("The " + x + " raise to the power " + y + " is " + power(x, y));
        System.out.println("The " + x + " raise to the power " + y + " is " + powerOpti(x, y));
    }
}
