public class Patterm {
    
    static void pattern31(int n){
        // int total = (2*n) - 1;
        for(int row=0;row < 2 * n -1;row++){
            for(int col=0;col < 2 * n -1;col++){
                int value = n - Math.min(Math.min(row, col), Math.min(2*n-row-2, 2*n-col-2));
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern31(4);
    }
    
}