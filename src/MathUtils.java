public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(int dividend, double divisor) {
        /* Do some casual division ... Super easy ... Shouldn't be any problems here */
        double res = dividend / divisor;
        /* Return the DEFINITELY CORRECT result */
        return res;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(int base, int exp) {
        /* Set initial result to be just the number */
        double res = base;

        /* Determine if the exponent is negative */
        boolean isNegative = false;
        if (exp < 0) {
            isNegative = true;
        }

        /* Multiply the result by the base exp times
            Ex: base = 2, exp = 2
               --> res = 2, then res = 4 */
        if(isNegative) {
            exp *= -1;
            for (int i = 1; i < exp; i++) {
                res = Math.pow(base, exp);
            }
        }
        else {
            for(int i = 1; i < exp; i++){
                res = Math.pow(base, exp);
            }
        }
        /* If it's a negative exponent, we should invert it! */
        if (isNegative) {
            return divideNumbers(1,res);
        }
        /* Otherwise, we are safe to just return the result */
        else {
            return res;
        }
    }    
}