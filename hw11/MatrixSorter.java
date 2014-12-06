//////////////////////////////////////////////////////////////
/*

jordan hess
12/3/14
hw11 - program 2


*/
public class MatrixSorter{
   
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        
        System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        
        sort(mat3d[2]);
        show(mat3d);
   }
   
   public static int[][][] buildMat3d(){
       
        
        int[][][] array = new int[3][][];//[] the slab [] the column [] the row
        
        array[0] = new int[3][];
        array[1] = new int[5][];
        array[2] = new int[7][];
        
        array[0][0] = new int[1];
        array[0][1] = new int[2];
        array[0][2] = new int[3];
        
        array[1][0] = new int[2];
        array[1][1] = new int[3];
        array[1][2] = new int[4];
        array[1][3] = new int[5];
        array[1][4] = new int[6];
        
        array[2][0] = new int[3];
        array[2][1] = new int[4];
        array[2][2] = new int[5];
        array[2][3] = new int[6];
        array[2][4] = new int[7];
        array[2][5] = new int[8];
        array[2][6] = new int[9];
        
        
        
        for (int i = 0; i < 3; i++){
            
            for (int m = 0; m < array[i].length; m++){
                
                for (int k = 0; k < array[i][m].length; k++){
                
                    array[i][m][k] = (int)(Math.random() * 99);;
                }
            }
            
        }
        
        return array;
       
      
   }
   
   public static void show(int[][][] array){
       
        for (int i = 0; i < 3; i++){
            
            System.out.println("------------ slab " + i);
            
            for (int m = 0; m < array[i].length; m++){
                
                for (int k = 0; k < array[i][m].length; k++){
                
                    System.out.print(array[i][m][k] + " ");
                }
                
                System.out.println(" ");
            }
            
            System.out.println(" ");
        }
       
   }
   
   public static int findMin(int[][][] array){
      
       int min = 100;
       
       for (int i = 0; i < 3; i++){
            
            for (int m = 0; m < array[i].length; m++){
                
                for (int k = 0; k < array[i][m].length; k++){
                
                    if (array[i][m][k] < min){
                        min = array[i][m][k];
                    }
                }
            }
            
        }
        
        return min;
       
       
   }
   
   
   public static int[] sort(int[] array){

        int min;

        for (int i = 0; i < array.length; i++) {
            min = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[min]) {
                    min = j;
                }
            }
        if (min != i) {

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }
     
      return array;
      
   }
   
    public static int[][] sort(int[][] array) {

        int j;
        int[] temp = new int[array.length];

        for (int i = 1; i < array.length; i++) {
            
            sort(array[i]); //sort the indivudual row
            
            temp = array[i];
            j = i - 1;
            while ((j >= 0) && (temp[0] < array[j][0])) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
            
        }

        System.out.println("second sort");
        return array;
    

    }
}