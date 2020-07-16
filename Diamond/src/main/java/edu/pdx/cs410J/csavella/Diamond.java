package edu.pdx.cs410J.csavella;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
  public Character c;

  public Diamond(Character c) {
    this.c = c;
  }

  public ArrayList<String> getText() {
    ArrayList<String> diamondList = new ArrayList<>();
    int asciiCode = c;
    int asciiValue = (int)c;
    int asciiValueA = 65;
    int diff = asciiValue - asciiValueA;

    String inner = "", outer = "";
    for(int i = 0; i < diff; i++){
      outer += " ";
    }

    int innerSpace = diff;
    for(int i = 0; i <= diff; ++i) {
      if(i == 0){
        diamondList.add(outer + "A" + outer);
        inner = " ";
        outer = outer.substring(0, outer.length() - 1);

      }else{
        diamondList.add(outer + ((char)(asciiValueA + i)) + inner + ((char)(asciiValueA + i)) + outer );
        inner += "  ";
        outer = outer.substring(0, outer.length() - 2);
      }

      for (String s: diamondList){
        System.out.println(s);
      }
    }

    return null;
  }

  public static void main(String[] args) {
  }
}