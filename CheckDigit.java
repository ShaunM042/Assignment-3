/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
       long a= Long.parseLong(args[0]);
       int l= args[0].toString().length();
       long sum1=0;
       long sum2=0;
       for (int i=0 ;i<=l;i++){
            if (i %2==0){
                sum1=sum1+ a%10;
                a=a/10;
            }
            else{
                sum2=sum2+a%10;
                a=a/10;
            }
       }
       long k= sum2 *3;
       long result=(sum1+ k)%10;
       System.out.println(result);
    }
}