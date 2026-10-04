import java.util.*;

class PrimeSpf{
    static int maxN=100001;
    static int[] spf=new int[maxN];
    static void sieve()
    {
        Arrays.fill(spf,1);
        spf[0]=0;
        for (int i=2;i<maxN;i++)
        {
            if (spf[i]==1)
            {
                for (int j=i;j<maxN;j += i) {

                    if (spf[j]==1) {
                        spf[j]=i;
                    }
                }
            }
        }
    }
    static ArrayList<ArrayList<Integer>> factors(int a[]) {
        sieve();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for (int i=0;i<a.length;i++) {
            int x=a[i];
            ArrayList<Integer> res1 = new ArrayList<>();
            while(x!=1) 
            {
                res1.add(spf[x]);
                x=x/spf[x];
            }
            res.add(res1);
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value...");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> ans=factors(a);
        for (ArrayList<Integer> l:ans) {
            System.out.println(l);
        }
    }
}