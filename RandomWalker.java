/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {
    public static void main(String[] args) {
	
    // WRITE YOUR CODE HERE
    double distanceBtPts= 0.0;
    int firstpos=0;
    int secondpos=0; 
    int newPosone=firstpos; 
    int newPossecond=secondpos;
    int num= Integer.parseInt(args[0]) ;
    int count=0;
    System.out.println("(" + newPosone + "," + newPossecond + ")");
    while (count<num){
        double randnum = Math.random();
        randnum= (randnum%4)+1;
        if (randnum<.25)
        newPosone += 1;
        else if (randnum<.5)
        newPosone -= 1;
        else if (randnum<.75)
        newPossecond += 1;
        else
        newPossecond -= 1;
        System.out.println("(" + newPosone + "," + newPossecond + ")"); 
        count ++;
    }
    distanceBtPts= (newPosone-firstpos)*(newPosone-firstpos) + (newPossecond-secondpos)*(newPossecond-secondpos) ;
    System.out.println("Squared distance =" + distanceBtPts);
    }
}
