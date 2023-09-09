public class StarPattern {
    public static void main(String ar[]){

        int i;
        int j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int k=10;k>5;k--){
            for(int l=k;l>=5;l--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

