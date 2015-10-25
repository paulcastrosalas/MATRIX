/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Jennelyn Bantucan, Melanie Villanueva
 */
import java.util.Scanner;

class Matrix {
	final int SIZE = 4;
	private int [] [] squares = new int [SIZE] [SIZE];
	public Matrix() {}

public void setCell(int x, int y, int value){
	this.squares[x] [y] = value;
}

public void addMatrices(Matrix a, Matrix b){
  int x,y;
  for (x=0; x < SIZE; x++) {
  	for ( y=0; y < SIZE; y++) {
  squares[x][y] = a.getCell(x,y) + b.getCell(x,y);
  	}
  }
}

public int getCell (int x, int y){
	return this.squares[x] [y];
}

public void displayMatrix() {
	int x, y;
	for (x=0; x < SIZE; x++) {
  	for ( y=0; y < SIZE; y++) 
  		showCell (x, y);
        System.out.println("");
  }

  System.out.println ("");
}

public void showCell (int x, int y) {
	System.out.print( squares[x] [y] + " ");
}
}