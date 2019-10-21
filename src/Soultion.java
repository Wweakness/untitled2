public class Soultion {
    public static int game(int[] guess,int[] answer){
        int count=0;
        for(int i=0;i<3;i++){
            if(guess[i]==answer[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a={1,3,4};
        int[] b={2,3,5};
        int n=game(a,b);
        System.out.println(n);

    }
}
