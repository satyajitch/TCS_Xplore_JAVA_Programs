import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
 public static void main(String[] args)
 {
  int songId, rating;
  String title, artist;
  Scanner scanner = new Scanner(System.in);
  Song[] song = new Song[5];
  for(int i=0;i<5;i++){
      songId = scanner.nextInt();scanner.nextLine();
      title = scanner.nextLine();
      artist = scanner.nextLine();
      rating = scanner.nextInt();
      song[i] = new Song(songId, title, artist, rating);
  }
  scanner.nextLine();
  String newArtist1 = scanner.nextLine();
  String newArtist2 = scanner.nextLine();
  scanner.close();

  int average = findAvgRatingForArtist(song, newArtist1);
  Song[] s = searchSongByArtist(newArtist2, song);

  if(average == 0)
    System.out.println("There are no songs with the given artist");
  else
        System.out.println(average);
    
  if(s == null)
    System.out.println("There are no songs available for the given artist");
  else{
      for(int i=0;i<s.length;i++){
          System.out.println(s[i].getSongId());
      }
    }
}

public static int findAvgRatingForArtist(Song[] song, String artist)
  {
   //method logic
   int average = 0, value = 0;
   for(int i=0;i<song.length;i++){
       if(artist.equalsIgnoreCase(song[i].getArtist())){
           average += song[i].getRating();
           value++;
       }
   }
   if(average > 0) return average/value;
   else return average;
  }

public static Song[] searchSongByArtist(String artist, Song[] song)
  {
   int value = 0;
   for(int i=0;i<song.length;i++){
       if(artist.equalsIgnoreCase(song[i].getArtist()))
        value++;
   }
   if(value == 0)
    return null;
   Song[] s = new Song[value];
   value = 0;
   for(int i=0;i<song.length;i++){
       if(artist.equalsIgnoreCase(song[i].getArtist())){
           s[value++] = song[i];
       }
   }
   for(int i=0;i<s.length;i++){
       for(int j=i+1;j<s.length;j++){
           if(s[i].getSongId()<=s[j].getSongId()){
               Song temp = s[i];
               s[i] = s[j];
               s[j] = temp;
           }
       }
   }
   return s;
  }
}
    
class Song
{
  //code to build the class
  int songId;
  String title;
  String artist;
  int rating;
    Song(int songId, String title, String artist, int rating){
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.rating = rating;
    }
    int getSongId(){
        return songId;
    }
    String getTitle(){
        return title;
    }
      String getArtist(){
        return artist;
    }
    int getRating(){
        return rating;
    }
}