public class Calculator {
    public int add(int arg, int arg2) {
        long a=(long)arg;
        long b=(long)arg2;
        if(a+b>Integer.MAX_VALUE) throw new ArithmeticException("Overflow");
        if(a+b<Integer.MIN_VALUE) throw new ArithmeticException("Underflow");
        return arg+arg2;
    }

    public int diff(int arg, int arg2) {

        long a=(long)arg;
        long b=(long)arg2;
        if(a-b>Integer.MAX_VALUE) throw new ArithmeticException("Overflow");
        if(a-b<Integer.MIN_VALUE) throw new ArithmeticException("Underflow");
       return arg-arg2;
    }

    public int mul(int arg, int arg2) {
        if ((long)arg*(long)arg2 < Integer.MIN_VALUE) throw new ArithmeticException("Underflow");
        if ((long)arg*(long)arg2 > Integer.MAX_VALUE) throw new ArithmeticException("Overflow");
        return (int) checkBladMnozenia(arg, arg2);
    }

    public int div(int arg, int arg2) {
        if (arg2==0)
            throw new ArithmeticException("Nie mozna dzielic przez 0");
        else
        return arg / arg2;
    }

    public double add(double arg, double arg2) {
        return arg + arg2;
    }

    public double diff(double arg, double arg2) {
        return arg - arg2;
    }

    public double mul(double arg, double arg2) {
        return checkBladMnozenia(arg, arg2);
    }

    private double checkBladMnozenia(double arg, double arg2) {
        if (arg>0 && arg2>0 && arg*arg2<0) throw new ArithmeticException("Blad mnozenia (+)*(+)=(-)");
        if (arg<0 && arg2<0 && arg*arg2<0) throw new ArithmeticException("Blad mnozenia (-)*(-)=(+)");
        if (arg>0 && arg2<0 && arg*arg2>0) throw new ArithmeticException("Blad mnozenia (+)*(-)=(+)");
        if (arg<0 && arg2>0 && arg*arg2>0) throw new ArithmeticException("Blad mnozenia (-)*(+)=(+)");
        return arg * arg2;
    }

    public double div(double arg, double arg2) {
        if (arg2==0)
            throw new ArithmeticException("Nie mozna dzielic przez 0");
        return arg / arg2;
    }


}
