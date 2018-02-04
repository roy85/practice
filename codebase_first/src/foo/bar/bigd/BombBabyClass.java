package foo.bar.bigd;

import java.math.BigInteger;

public class BombBabyClass {

public static void main(String [] args)
{
    //System.out.println("Input: " + Arrays.toString(args));
    System.out.println(answer("2978183212347123467888","8832131497"));
}

public static String answer(String M, String F) {

    try {
        BigInteger numM = new BigInteger(M);
        BigInteger numF = new BigInteger(F);

        String output = "impossible";
        long count = 0;
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        
        while (numM.compareTo(one) ==1 || numF.compareTo(one) ==1) {

            if (!checkIsValid(numM, numF)) {
                numM = numF = zero;
            }
            else if (numM.compareTo(numF) == 1) {
                numM = numM.subtract(numF);
                count++;
            }
            else if (numF.compareTo(numM) == 1) {
                numF = numF.subtract(numM);
                count++;
            }

            //System.out.println("cycle: " + count + " " + numM + " " + numF);
        }

        if (numM.compareTo(one) == 0 && numF.compareTo(one) == 0) {
            output = ""+count;
        }

        return output;
    }
    catch (NumberFormatException nfe) {
        return "impossible";
    }
}


//public static String answer2(String M, String F) {
//
//    try {
//        long numM = Long.parseLong(M);
//        long numF = Long.parseLong(F);
//
//        String output = "impossible";
//        long count = 0;
//        while (numM > 1 || numF > 1) {
//
//            if (!checkIsValid(numM, numF)) {
//                numM = numF = 0;
//            }
//            else if (numM > numF) {
//                numM -= numF;
//                count++;
//            }
//            else if (numF > numM) {
//                numF -= numM;
//                count++;
//            }
//
//            //System.out.println("cycle: " + count + " " + numM + " " + numF);
//        }
//
//        if (numM == 1 && numF == 1) {
//            output = ""+count;
//        }
//
//        return output;
//    }
//    catch (NumberFormatException nfe) {
//        return "impossible";
//    }
//}

protected static boolean checkIsValid(BigInteger numM, BigInteger numF) {
    boolean valid = true;
    BigInteger zero = new BigInteger("0");
    BigInteger one = new BigInteger("1");
    BigInteger two = new BigInteger("2");
    if (numM.remainder(two).intValue() == 0 && numF.remainder(two).intValue() == 0) {
        valid = false;
    }
    else if (numM == numF) {
        valid = false;
    }
    else if (numM.compareTo(zero) == -1 || numF.compareTo(zero) == -1) {
        valid = false;
    }
    else if (numM.compareTo(one) == 1 && numF.remainder(numM).intValue() == 0) {
        valid = false;
    }
    else if (numF.compareTo(one) == 1 && numM.remainder(numF).intValue() == 0) {
        valid = false;
    }

    return valid;
}
}