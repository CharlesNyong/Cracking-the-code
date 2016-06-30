package Crack;

import java.util.Arrays;
/* This is my solution to problem 1.7 in
 * the 5th edition of Cracking the coding interview problem
 * */
public class FillArrayWithZeros {
	
	public static int N = 4;
	public static int M = 3;
	
	/*this function can be modified to populate
	 * the array in any other. This just gives
	 * you an array to work with.
	 * */
	public static void populateArray(int[][]A, int k, int l){
		int num = 0; 
		for(int i=0; i<k; i++){
			for(int m =0; m<l; m++){
				A[i][m] = (m + num);
			}
			num++;
		}
	} 
	
	public static void print2DArray(int[][]B, int k, int l){
		for(int i=0; i<k; i++){
			for(int m =0; m<l; m++){
				System.out.print(B[i][m] + " ");
			}
			System.out.println();
		}
	}
	/* function copies desired contents from the first array to second
	 * array
	 */ 
	public static void copyArrayContents(int[][]First, int[][]Second, int row, int col){
		for(int i=0; i<row; i++){
			for(int m =0; m<col; m++){
				if((First[i][m] != Second[i][m]) && (Second[i][m]!=0)){
					Second[i][m] = First[i][m];
				}
			}
		}
	}
	
	public static void fillArrayCells(int[][]C, int RowIndex, int ColIndex){
		
		// fill rows with zero
		for(int i = 0; i<M; i++){
			C[RowIndex][i] = 0;
		}
		
		// fill columns with zero
		for(int j = 0; j<N; j++){
			C[j][ColIndex] = 0;
		}

	}
	
	public static void main(String[] args) {
		int[][] OriginalArray = new int[N][M];
		int[][]TemporaryArray = new int[N][M];
		// populate temporary array with ones
		for(int[] row: TemporaryArray){
		    Arrays.fill(row, 1);
		}  
		populateArray(OriginalArray, N, M);
		print2DArray(OriginalArray, N, M);
		System.out.println();
		for(int RowIndex =0; RowIndex<N; RowIndex++){
			for(int ColIndex = 0; ColIndex<M; ColIndex++){
				if(OriginalArray[RowIndex][ColIndex] == 0){
					fillArrayCells(TemporaryArray, RowIndex, ColIndex);
				}
			}
		}
		copyArrayContents(OriginalArray, TemporaryArray, N, M);
		print2DArray(TemporaryArray, N, M);
	}

}
