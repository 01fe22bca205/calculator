// calculator

public class calculator {

    float addition(float operand_1, float operand_2){
        return(operand_1 + operand_2);
    }
    float substraction(float operand_1, float operand_2){
        return(operand_1 - operand_2);
    }
    float multiplication(float operand_1, float operand_2){
        return(operand_1 * operand_2);
    }
    float division(float operand_1, float operand_2){
        return(operand_1 / operand_2);
    }
    public static void main(String[] args){
        float operand_1=10;
        float operand_2=5;
        calculator cal=new calculator();
        float add_result=cal.addition(operand_1, operand_2);
        System.out.println("result of addtion is:" +add_result);
        float sub_result=cal.substraction(operand_1, operand_2);
        System.out.println("result of substraction is:" +sub_result);
        float mul_result=cal.multiplication(operand_1, operand_2);
        System.out.println("result of multiplication is:" +mul_result);
        float div_result=cal.division(operand_1, operand_2);
        System.out.println("result of division is:" +div_result);
    }
}     