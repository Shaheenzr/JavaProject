import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist
    = new ArrayList<String>();
    desertIslandPlaylist.add("I want it that way");
    desertIslandPlaylist.add("As long as you love me");
    desertIslandPlaylist.add("Show me the meaning of being lonely");
    desertIslandPlaylist.add("Incomplete");
    desertIslandPlaylist.add("Shape of my heart");
    desertIslandPlaylist.add("My love");
    desertIslandPlaylist.add("Every night in my dreams");

    System.out.println(desertIslandPlaylist.toString());
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(4);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(3);
    System.out.println(desertIslandPlaylist.size());

   int indexA = desertIslandPlaylist.indexOf("As long as you love me");
   int indexB = desertIslandPlaylist.indexOf("My love");

   String tempA = desertIslandPlaylist.get(indexA);
   String tempB = desertIslandPlaylist.get(indexB);

   desertIslandPlaylist.set(indexB, tempA);
   desertIslandPlaylist.set(indexA, tempB);
   System.out.println(desertIslandPlaylist.toString());

  }
  
}