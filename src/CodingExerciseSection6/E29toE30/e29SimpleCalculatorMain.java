package CodingExerciseSection6.E29toE30;

public class e29SimpleCalculatorMain {
    public static void main(String[] args) {
        e29SimpleCalculator calculator = new e29SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= "+calculator.getAdditionResult());
        System.out.println("subtract= "+calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= "+calculator.getMultiplicationResult());
        System.out.println("divide= "+calculator.getDivisionResult());
    }
}
