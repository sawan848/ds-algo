
public class BruteForceAlgo {

    int gcd_bruteForce(int m, int n){

        int gcd;
        int last=Math.min(m, n);
        int i;

        gcd=i=1;

        while (i<=last){
            if (m%i==0 && n%i ==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    int euclid_gcd(int m,int n){
        int r=n%m;
        while (r !=0){
            n=m;
            m=r;
            r=n%m;
        }
        return m;
    }
    public static int GreaterCommonDivisior(int a,int b){
        if (a==0){//recursion method
            return a;
        }
        if (b==0){
            return a;
        }
        if (a==b){
            return a;
        }
        if (a>b){
            return GreatestCommonDivisior(a-b,b);
        }
        return GreatestCommonDivisior(a,b-a);

    }
    public int gcd_recursive(int m, int n) {
        int result;
        if (m == 0) { //test
            result = n; //end case
        } else {
            result = gcd_recursive(n % m, m); //recursive case
        }
        return result;
    }
    public static int GreatestCommonDivisior(int a,int b){
        //substraction method
        int c;
        while (a!=b){
            while (a>b){
                c=a-b;
                a=c;
            }
            while (a<b){
                c=b-a;
                b=c;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        BruteForceAlgo bf=new BruteForceAlgo();
        int number=bf.gcd_bruteForce(44,16);

        System.out.println(number);
        System.out.println(bf.euclid_gcd(44,16));
        System.out.println(bf.GreatestCommonDivisior(44,16));
        System.out.println(bf.GreaterCommonDivisior(44,16));
    }
}
