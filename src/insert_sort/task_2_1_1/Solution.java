package insert_sort.task_2_1_1;

public class Solution {
    public static void main(String[] args) {
    int[] input=new int[]{31, 41, 59, 26, 41, 58};
    sortFunction(input);
}

    static void sortFunction(int[] A) {
        int i,j,key;
        for (j=1;j<A.length;j++){
            key=A[j];
            i=j-1;
            while (i>-1&&A[i]>key){
                A[i+1]=A[i];
                i=i-1;
            }
            A[i+1]=key;
        }
        for(j=0;j<A.length;j++){
            System.out.print(A[j]);
            System.out.print(" ");
        }
    }
}