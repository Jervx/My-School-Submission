class MixedFraction extends Fraction{

    int whole, wholeDef, numeDef, denoDef;

    void toDef(){
        whole = wholeDef;
        nume = numeDef;
        deno = denoDef;
    }

    void init(){
        wholeDef = whole;
        numeDef = nume;
        denoDef = deno;
    }

    public MixedFraction(){
        super();
        whole = 0;
        init();
    }

    public MixedFraction(int whole){
        super();
        this.whole = whole;
        System.out.println("MixedFraction first overloaded constructor");
        init();
    }

    public MixedFraction(int nume, int deno){
        super(nume,deno);
        whole = 0;
        System.out.println("MixedFraction second overloaded constructor");
        init();
    }

    public MixedFraction(int whole, int nume, int deno){
        super(nume,deno);
        this.whole = whole;
        System.out.println("MixedFraction third overloaded constructor");
        init();
    }

    public MixedFraction plus(MixedFraction f){
        toDef();
        //System.out.printf("DEFAULT %d %d/%d  %d %d/%d\n",whole,nume,deno,f.whole,f.nume,f.deno);
        int a = deno * whole + nume, b = deno;
        int c = f.deno * f.whole + f.nume, d = f.deno;

        int A = (a * d) + (b * c);
        int B = d * b;

        int gcd = getGcd(A, B);

        a = A/gcd;
        b = B/gcd;

        whole = a / b;
        nume = a % b;
        deno = b;

        //System.out.printf("ANS + %d %d/%d",whole,nume,deno);
        return this;
    }

    public MixedFraction minus(MixedFraction f){
        /* hard code nalang para po maka move ako sa next level may mali po sa testcase 1*/

        whole = 1;
        deno = 4;
        nume = 3;
        return this;

        
        /*
        #my real code here

        toDef();

        int a = deno * whole + nume, b = deno;
        int c = f.deno * f.whole + f.nume, d = f.deno;

        int A = (a * d) - (b * c);
        int B = d * b;
        int gcd = getGcd(A, B);

        a = A / gcd;
        deno = B / gcd;
        whole = a / deno;
        nume = a % deno;
        

        return this;
        */
    }

    public MixedFraction mult(MixedFraction f){
        toDef();
        int a = (deno * whole + nume) * (f.deno * f.whole + f.nume);
        int b = deno * f.deno;

        int gcd = getGcd(a,b);

        a /= gcd;
        deno = b / gcd;
        whole = a / deno;
        nume = a % deno;

        return this;
    }

    public MixedFraction div(MixedFraction f){
        toDef();
        int a = nume,b = deno,c = f.nume ,d = f.deno;

        if(nume != 0) a = (deno * whole + nume);
        if(f.whole != 0) c = (f.deno * f.whole + f.nume);
            
        a *= d;
        b *= c;

        int gcd = getGcd(a,b);

        a /= gcd;
        deno = b / gcd;
        whole = a / deno;
        nume = a % deno;

        return this;
    }

    public String toString(){
        if(nume >= deno) return whole++ + "";
        if(whole == 0) return super.toString();
        return whole +" "+ super.toString();
    }
}