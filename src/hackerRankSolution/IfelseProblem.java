package hackerRankSolution;

public class IfelseProblem {

	public static void main(String[] args) {
		/*
		 * Given an integer , n, perform the following conditional actions:
		 * 
		 * If n is odd, print Weird If n is even and in the inclusive range of 2 to 5 ,
		 * print Not Weird If n is even and in the inclusive range of 6 to 20 , print
		 * Weird If n is even and greater than 20 , print Not Weird
		 */
		int N=1;
		
		if(N%2==0){
            if(N>=2&&N<=5){
                System.out.println("Not Weird");
            }else
            if(N>=6&&N<=20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }else{
           System.out.println("Weird"); 
        }
	}

}
