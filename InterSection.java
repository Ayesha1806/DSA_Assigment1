package DSAAssg1;

public class InterSection {
    public static void main(String[] args) {
        int[] a = {3, 6, 8};
        int[] a1 = {1, 2, 3, 5, 6, 90, 789};
        for (int i = 0; i < a.length - 1; i++){
            for(int j=0;j<a1.length;j++)
            {
                if(a[i]==a1[j]){
                    System.out.print(a[i]+",");
                }
            }
        }
    }
}