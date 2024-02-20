/**
 * The Calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division on two float operands.
 */
class Calculator extends ExtendedCalculator{



    /**
     * The function "multiplication" takes two float operands and returns their product.
     * 
     * @param operand_1 The first operand of the multiplication operation. It is a floating-point
     * number.
     * @param operand_2 The second operand in the multiplication operation.
     * @return The product of operand_1 and operand_2 is being returned.
     */
    int cube(int operand_1){
        return(operand_1 * operand_1 * operand_1);
    }

    /**
     * The division function takes two float operands and returns their quotient.
     * 
     * @param operand_1 The first operand of the division operation.
     * @param operand_2 The second operand in the division operation.
     * @return the result of dividing operand_1 by operand_2.
     */
    int square(int operand_1){
        return(operand_1 * operand_1);
    }




    public static void main(String[] args){
        int operand_1 = 10;
        int operand_2 = 5;
        Calculator calc = new Calculator();

        int square_result = calc.square(operand_1);
        System.out.println("Result of square is: " + square_result);
        int cube_result = calc.cube(operand_1);
        System.out.println("Result of cube is: " + cube_result);
    }
}