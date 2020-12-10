class Fraction{

    int nume, deno;
    int whole;

    public Fraction()throws Exception{
        nume = 0;
        deno = 1;
    }

    public Fraction(int n)throws Exception{
        nume = n;
        deno = 1;
    }

    public Fraction(int n, int d)throws Exception{
        nume = n;
        deno = d;
        if(deno == 0)
            throw new Exception("Fractions cannot have 0 for a denominator.");
    }

    public Fraction(String f) throws Exception{
        String [] in = f.split("/");
        if(in.length == 1){
            nume = Integer.parseInt(in[0]);
            deno = 1;
            return;
        }
        nume = Integer.parseInt(in[0]);
        deno = Integer.parseInt(in[1]);
        if(deno == 0)
            throw new Exception("Fractions cannot have 0 for a denominator.");
    }

    public String toString(){
        if(deno == 1)
            return nume+"";
        return nume+"/"+deno;
    }

}