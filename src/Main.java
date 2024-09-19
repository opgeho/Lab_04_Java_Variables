public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 23;
        int intOperandB = 14;

        int intSum = 0;
        int intProduct = 0;
        int intQuotient = 0;
        int intDifference = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The Sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The Product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The Quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intDifference = intOperandA - intOperandB;
        System.out.println("The Difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        // repeat ad nauseam

        double doubleOperandA = 88.888;
        double doubleOperandB = 3.14;

        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleQuotient = 0;
        double doubleDifference = 0;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The Sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The Product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The Quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The Difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        String firstDogName = "Ripple";
        Boolean amITall = true;
        int fingerCount = 8;
        double EIGHT = 88888.88888;
    }
}
