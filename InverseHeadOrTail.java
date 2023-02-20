public class InverseHeadOrTail {


    public static void main(String[] args) {
        System.out.println(minFlips(new int[]{1,0,1}));
        System.out.println(minFlips(new int[]{1,1,1}));
        System.out.println(minFlips(new int[]{1,0,1,1}));
    }


    public static int minFlips(int[] A){
        int headCount = 0;
        int tailCount = 0;

        for(int i= 0; i < A.length; i++){

            if(i%2 == 0){
                if(A[i] != 1) headCount++;
                if(A[i] != 0) tailCount++;
            }

            if(i%2 == 1){
                if(A[i] != 0) headCount++;
                if(A[i] != 1) tailCount++;
            }
        }

        return Math.min(headCount,tailCount);
    }
}
