package OOPS;

public   class Fractions {


    public static class Fraction {
        int num;
        int dem;

        public Fraction(int num, int dem) {
            this.num = num;
            this.dem = dem;
            Simplfy();
        }
        public void Simplfy(){
            int hcf = gcd(num,dem);
            num /= hcf;
            dem /= hcf;
        }
    }
        public static Fraction multiply(Fraction f1,Fraction f2){
            int numerator = f1.num*f2.num;
            int denominator = f1.dem*f2.dem;
            Fraction f3 = new Fraction(numerator,denominator);
            return f3;
        }
        public static Fraction add(Fraction f1,Fraction f2){
        int up = (f1.num*f2.dem+f2.num* f1.dem);
        int down = f1.dem* f2.dem;
        Fraction f4 = new Fraction(up,down);
        return f4;

        }
    public static Fraction subtract(Fraction f1,Fraction f2){
        int up = (f1.num*f2.dem - f2.num* f1.dem);
        int down = f1.dem* f2.dem;
        Fraction f5 = new Fraction(up,down);
        return f5;

    }
    public static Fraction div(Fraction f1,Fraction f2){

        if (f1.dem != 0 || f2.dem != 0){
        }
        int  firstDiv = f1.num / f2.dem;

        int  secDiv = f2.num / f1.dem;
        Fraction f6 = new Fraction(firstDiv,secDiv);
        return f6;


    }

    public static int gcd(int num, int dem){
        int min = Math.min(num,dem);
        for (int i=min;i>=1;i--){
            if (num%i==0 && dem%i==0){
                return i;
            }
        }
        return min;
    }

    public static void main(String[] args){
        Fraction f1 = new Fraction(3,7);
        System.out.println(f1.num+"/"+ f1.dem);
        Fraction f2 = new Fraction(3,9);
        System.out.println(f2.num+"/"+ f2.dem);
        Fraction f3 = multiply(f1,f2);
        System.out.println(f3.num+"/"+f3.dem);
        Fraction f4 = add(f1,f2);
        System.out.println(f4.num+"/"+ f4.dem);
        Fraction f5 = subtract(f1,f2);
        System.out.println(f5.num+"/"+f5.dem);
        Fraction f6 = div(f1,f2);
        System.out.println(f6.num+"/"+ f6.dem);


    }
}
