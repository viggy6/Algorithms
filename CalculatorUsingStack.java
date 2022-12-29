import java.util.Stack;

public class CalculatorUsingStack {

    public static void main(String[] args) {
        String[] input="( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )".split(" ");
        Stack<String> operators= new Stack<>();
        Stack<Double> operands= new Stack<>();
        for(String statement:input){
            if(statement.matches("[+-/*()]")){
                if(!statement.equals("(")){
                    if(!statement.equals(")")){operators.push(statement);}
                    else{
                        Double output=mathOp(operands.pop(), operands.pop(), operators.pop());
                        operands.push(output);
                    }
                }
            }
            else{
                operands.push(Double.parseDouble(statement));
            }
        }
        System.out.println(operands.pop());
    }
    public static Double mathOp(Double val1,Double val2,String operator){
       
        if(operator.equals("+")) return val1+val2;
        else if(operator.equals("-")) return val1-val2;
        else if(operator.equals("*")) return val1*val2;
        else if(operator.equals("/")) return val1/val2;
        return 0.0;
    } 
}
