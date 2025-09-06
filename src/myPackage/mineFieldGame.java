package myPackage;

import java.util.Random;
import java.util.Scanner;

// MAYIN=-1, 
// SEÇİLEN KUTUNUN SAĞINDA SOLUNDA AŞAĞISINDA YUKARISINDA MAYIN YOKSA -2 
// ÇEVRESİNDE MAYIN VARSA MAYIN SAYISI KADAR DEĞER YAZILIR 

public class mineFieldGame {
	int rowNumber=4, colNumber=4,size;
	int [][]map;
	int[][] board;
	boolean game=true;
	Random rand = new Random() ;
	Scanner scan=new Scanner(System.in);
	
	mineFieldGame(int rowNumber, int colNumber) {
		this.rowNumber=rowNumber;
		this.colNumber=colNumber;
		this.map=new int[rowNumber][colNumber];
		this.board=new int[rowNumber][colNumber];
		this.size= rowNumber * colNumber;
	} 
	
	public void checkMine(int r, int c) {
		if(map[r][c]==0) { //array index out of bounds exception
		
		if(( c< colNumber-1 ) && (map[r][c+1]==-1) ){ //last index--> arrayindexoutofbounds exception
			board[r][c]++; // box on the right
		}
		if((r<rowNumber-3) && (map[r+1][c]==-1) )  { 
			board[r][c]++; // box on the below
		}
		if((r>0) && map[r-1][c]==-1) {
			board[r][c]++; // box on the top
		}
		if((c>0) && map[r][c-1]==-1) {
			board[r][c]++; // box on the left
		}
		if (board[r][c] ==0) {
			board[r][c]= -2; 
		}
		
		}	
	}
	public void run() {
		int row, column;
		int success=0;
		prepeareGame();
		print(map);
		System.out.println("Game starting...");
		while (game) {
			print(board);
			System.out.println("Row:");
			row= scan.nextInt();
			System.out.println("Column: ");
			column=scan.nextInt();
			
			if(map[row][column] != -1) {
				 checkMine(row,column);	
				 success++;
				 if(success == (size - (size/4))) {
					 System.out.println("Successfull");
					 break; 
				 }
			}else {
				game=false;
				System.out.println("Game Over!! ");
			}
			
		}
	}
	public void prepeareGame() {
		int randRow, randColumn,count=0;
		while(count != (size/4)) {
			randRow= rand.nextInt(rowNumber	);
			randColumn= rand.nextInt(colNumber);
			if(map[randRow][randColumn] != -1 ) { // mine=-1 
				map[randRow][randColumn] = -1;
				count++;
			}
		}
	}
   public void print(int[][] arr ){
    	   for(int i=0 ; i< arr.length; i++) {
    		   for(int j=0; j<arr[0].length ; j++) {
    			   if(arr[i][j]>=0) {
    				   System.out.print(" ");
    				   
    			   }
    			   System.out.print(arr[i][j] + " ");
    		   }
    		   System.out.println();
    	   }
    	   
    	   
       }
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int row,column;
	System.out.println("Welcome to Minefield Game");
	System.out.println("Enter the number columns and rows you want to play.");
	System.out.print("Row:");
	row=scan.nextInt();
	System.out.print("Column: ");
	column=scan.nextInt();
	mineFieldGame mineField = new mineFieldGame(row, column);
	mineField.run();
}
}