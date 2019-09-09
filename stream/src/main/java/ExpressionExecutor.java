public class ExpressionExecutor {

    public void executeExpression(double a, double b, MathExpriession mathExpriession){

        double result = mathExpriession.calculateExpression(a, b);
        System.out.println("result equals " +result);



    }

}
