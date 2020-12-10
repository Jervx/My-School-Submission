package Encapsulation.prob2;
class Fraction {
    int nume, deno;
    
    Fraction() {
        System.out.println("Fraction default constructor");
        nume = 0;
        deno = 1;
    }
    
    Fraction(int n, int d) {
        System.out.println("Fraction overloaded constructor");
        nume = n;
        deno = d;
    }

    int getGcd(int a, int b){
        if (b==0) return a;
        return getGcd(b,a%b);
    }
    
    Fraction plus(Fraction f) {
        int a = (deno * f.nume) + (nume * f.deno);
        int b = deno * f.deno;

        nume = a;
        deno = b;

        return this;
    }
    
    // Fraction minus(Fraction f) {
    //     // replace this with the actual implementation
    //     System.out.println("Fraction minus");
    // }
    
    // Fraction times(Fraction f) {
    //     // replace this with the actual implementation
    //     System.out.println("Fraction times");
    // }
    
    // Fraction divide(Fraction f) {
    //     // replace this with the actual implementation
    //     System.out.println("Fraction divide");
    // } 
    
    public String toString() {
        if(deno == 1) return "";
        return nume+"/"+deno;
    }
}