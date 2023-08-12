class Fraction{
    private int numerator;
    private int denominator;

    Fraction(int numerator,int denominator){
        this.numerator = numerator;
        if(denominator==0){
            return;
        }
        this.denominator = denominator;
        simplyfy();
    }

    public void setDenominator(int denominator) {
        if(denominator==0){
            return;
        }
        this.denominator = denominator;
    }
    
    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    private void simplyfy(){
        int gcd = 1;
        int min = Math.min(this.numerator, this.denominator);
        for(int i=2;i<=min;i++){
            if(this.numerator%i==0 && this.denominator%i==0){
                gcd = i;
            }
        }
        this.numerator = this.numerator/gcd;
        this.denominator = this.denominator/gcd;
    }

    public void add(Fraction f2){
        int num = this.numerator * f2.denominator + this.denominator * f2.numerator;
        int deno = this.denominator * f2.denominator;

        if(deno==0){
            return;
        }

        this.denominator = deno;  
        this.numerator   = num;
        simplyfy();
    }

    public void multiply(Fraction f2){
        this.denominator = this.numerator * f2.numerator;  
        this.numerator   = this.denominator * f2.denominator;  
        simplyfy();
    }

    public static Fraction add(Fraction f1,Fraction f2){
        int num = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int deno = f1.denominator * f2.denominator;

        if(deno==0){
            // Error
        }

        return new Fraction(num,deno);
    }

    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
}

public class FractionUse{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(10, 30);
        Fraction f2 = new Fraction(10, 2);
        f1.print();
        f2.print();

        f1.multiply(f2);
        f1.print();
        // f1.print();
    }
}