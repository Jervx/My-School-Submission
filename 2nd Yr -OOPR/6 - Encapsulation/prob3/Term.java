class Term{
    int coefficient, exponent;

    public Term times(Term t){
        return new Term(coefficient * t.coefficient, exponent + t.exponent);
    }

    public Term(int coefficient, int exponent){
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public String toString(){
        String str = "";
        if(coefficient != 1) str += coefficient;
        str += "x";
        if(exponent != 1) str += "^"+exponent;
        if(exponent == 0) str = coefficient +"";
        return str;
    }
}