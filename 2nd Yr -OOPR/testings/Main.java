class Main{
    public static void main(String [] args){
        mfrac a = new mfrac(4,3,4);
        mfrac b = new mfrac(1,3,4);

        //a.plus(b);
        a.subt(b);
    }
}

class mfrac{
    int num;
    int den;
    int who;

    mfrac(int who, int num, int den){
        this.num = num;
        this.den = den;
        this.who = who;
    }

    private int getGcd(int a, int b){
        if (b==0) return a;
        return getGcd(b,a%b);
    }

    void plus(mfrac f){
        System.out.println(this.toString()+" + "+f.toString());
        mfrac ab = new mfrac(0, den * who + num, den);
        mfrac cd = new mfrac(0, f.den * f.who + f.num, f.den);
        
        int newNum = (ab.num * cd.den) + (ab.den * cd.num);
        int newDen = ab.den * cd.den;

        int gcd = getGcd(newNum, newDen);

        newNum /= gcd;
        newDen /= gcd;

        who = newNum / newDen;
        newNum = newNum % newDen;

        //System.out.printf("%d %d %d %d \n",a,b,c,d);
        System.out.println(who+" "+newNum+"/"+newDen);
    }

    void subt(mfrac f){
        System.out.println(this.toString()+" + "+f.toString());
        mfrac ab = new mfrac(0, den * who + num, den);
        mfrac cd = new mfrac(0, f.den * f.who + f.num, f.den);
        
        int newNum = (ab.num * cd.den) - (ab.den * cd.num);
        int newDen = ab.den * cd.den;

        int gcd = getGcd(newNum, newDen);

        newNum /= gcd;
        newDen /= gcd;

        who = newNum / newDen;
        newNum = newNum % newDen;

        //System.out.printf("%d %d %d %d \n",a,b,c,d);
        System.out.println(who+" "+newNum+"/"+newDen);
    }

    void mult(mfrac f){
        System.out.println(this.toString()+" + "+f.toString());
        mfrac ab = new mfrac(0, den * who + num, den);
        mfrac cd = new mfrac(0, f.den * f.who + f.num, f.den);
        
        int newNum = ab.num * cd.num;
        int newDen = ab.den * cd.den;

        int gcd = getGcd(newNum, newDen);

        newNum /= gcd;
        newDen /= gcd;

        who = newNum / newDen;
        newNum = newNum % newDen;

        //System.out.printf("%d %d %d %d \n",a,b,c,d);
        System.out.println(who+" "+newNum+"/"+newDen);
    }

    public String toString(){ return String.format("%d %d/%d",who,num,den); }
}