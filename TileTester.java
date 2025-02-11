/*
 * Activity 3.8.1
 */
public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    
    /* your code here */

    Tile[][] gameboard = new Tile[3][4];
    int tileValue = 0;

    for(int i =0; i < gameboard.length; i ++){
        for(int j =0; j < gameboard[i].length; j ++){
            Tile temp = new Tile(tileValues[tileValue]);
            gameboard[i][j] = temp;
            tileValue++;
        }
    }
    System.out.println(java.util.Arrays.toString(gameboard[0]));
    System.out.println(java.util.Arrays.toString(gameboard[1]));
    System.out.println(java.util.Arrays.toString(gameboard[2]));
  
    
  }
}
