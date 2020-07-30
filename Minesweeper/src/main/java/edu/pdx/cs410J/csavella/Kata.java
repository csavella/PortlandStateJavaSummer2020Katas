package edu.pdx.cs410J.csavella;

import java.util.Scanner;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  private static char[][] minesweeper;
  static int length;
  static int width;

  public static void getMinesweeper() {
    char[][] minesweeper = new char[length][width];
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < length; j++) {
        minesweeper[i][j] = '.';
      }
    }
    //return minesweeper;
  }
                                                                                    

  public static void main(String[] args) {

    if (args.length != 2) {
      System.err.println("Missing command line arguments.");
    }

    length = Integer.parseInt( args[0] );
    width = Integer.parseInt( args[1] );

    getMinesweeper();
    populateMines();

  }

  public static void populateMines(){
    String answer;
    int row, col;
    Scanner read = new Scanner(System.in);

    do
    {
      System.out.print("Enter in two numbers to populate a mine in that index: ");
      row = read.nextInt();
      col = read.nextInt();

      minesweeper[row][col] = '*';

      System.out.println("Would you like to enter another mine? (y/n): ");
      answer = read.next();

    } while (answer =="y");
  }

  public static void calculateOutput()
  {
    for (int i = 0; i < length; ++i)
    {
      for (int j = 0; j < width; ++j)
      {

        checkForMines(length, width);








      }
    }
  }

  private static void checkForMines(int row, int col)
  {
    int count = 0;

    // [0, 0]
    if (row - 1 < 0 && col - 1 < 0)
    {
      if (minesweeper[row + 1][col] == '*')
        ++count;

      if (minesweeper[])

    }




  }
}