//Micah Warner
//APCSA
//8/28/2020

class StringOperations{
  public static void main(String[] args){
    /*Challenge One: Scramble the words Scissors, Picture, and Computer so that they print with the second half in the fron and lowercase*/
    String word1 = "Scissors";
    String word2 = "Picture";
    String word3 = "Computer";

    String word1_1 = word1.substring(0, 4);
    String word1_2 = word1.substring(4);

    String word2_1 = word2.substring(0, 3);
    String word2_2 = word2.substring(3);

    String word3_1 = word3.substring(0, 4);
    String word3_2 = word3.substring(4);

    System.out.println(word1_2 + word1_1.toLowerCase());
    System.out.println(word2_2 + word2_1.toLowerCase());
    System.out.println(word3_2 + word3_1.toLowerCase());

    /*Challenge Two: Print an ASCII art exactly as shown using escapes*/
    System.out.println("     __");
    System.out.println("(___()\'`;");
    System.out.println("/,    /`");
    System.out.println("\\\\\"--\\\\");
  }
}