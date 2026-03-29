public class solution {
    public static void hollowRectangle(int rows, int columns){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i == 0 || j == 0 || i == rows-1 || j == columns-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRectangle(4, 5);
    }
}