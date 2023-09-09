public class BinCoeff {

    public static int FactorialFun(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static int binomial_coefficient(int n, int r){
        int fn=FactorialFun(n);
        int fr=FactorialFun(r);
        int n_r=n-r;
        int nmr=FactorialFun(n_r);
        int BinCoeff_Coeff = fn/(fr*nmr);
        return BinCoeff_Coeff;
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c=binomial_coefficient(a,b);
        System.out.println(c);
    }
    
}
