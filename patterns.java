public class patterns {
    public static void main(String[] args) {
        for(int i=0; i<=4; i++){
            //space
            for(int j=0; j<4-i+1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print('*');
            }
            for(int j=0; j<4-i+1; j++){
                System.out.print(" ");
            }
            System.out.println();

        }
        
    }
    
}
