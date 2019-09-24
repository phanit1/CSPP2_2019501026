/**
 * Given a binary string that contains a sequence of 1's and 0's, returns an
 * equivalent to the decimal value in integer form.
 * 
 * Input : 1010
 * Output : 10
 * 
 * Input : 000000000000001010
 * Output : 10
 * 
 * @author Siva Sankar
 **/
import java.math.BigInteger;
public class BinaryToDecimal {

    /**
     * This method reads in a Binary String and returns the equivalent to the
     * decimal value of the binary string.
     * @param s, the binary string that contains only sequence of 1's and 0's.
     * @return the decimal number n of the binary string.
     */
    public static BigInteger binaryToDecimal(String s) 
   { 
    BigInteger bin; 
    bin = new BigInteger(s);
    BigInteger ten;
    ten = new BigInteger(10);
    BigInteger decimalNumber = (BigInteger)0, remainder;
    int i = 0;
    
    while (bin != 0)
    {
        remainder = bin.mod(ten);
        decimalNumber = decimalNumber + (remainder * (BigInteger)(Math.pow(2,i)));
        bin=bin.divide(ten);

        i++;
    }
    return decimalNumber;
     
    }
 }
