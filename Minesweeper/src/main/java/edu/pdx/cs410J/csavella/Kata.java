package edu.pdx.cs410J.csavella;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  public char[][] getMinesweeper(int length, int width) {
    char[][] minesweeper = new char[length][width];
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < length; j++) {
        minesweeper[i][j] = '.';
      }
    }
    return minesweeper;
  }
                                                                                    

  public static void main(String[] args) {
    int length, width;

    if (args.length != 2) {
      System.err.println("Missing command line arguments.");
    }

    length = Integer.parseInt( args[0] );
    width = Integer.parseInt( args[1] );
  }
}