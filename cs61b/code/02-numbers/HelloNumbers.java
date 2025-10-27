/*
  Java comments are non-executable things used to explain code
  for readability. Code is mainly for other programmer.
  
  single-line comments start with //
  multiple-line commments
  
  ex 1.1.2: print out 0 1 3 6 10 ... and end with 45
  
 */
public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 10) {
            System.out.print(y + " ");
            x = x + 1; //x: 0 1 2 3 4 5 6 7 8 9
            y = x + y; //y: 0 1 3 6 10 15 21 28 36 45
        }
    }
}
