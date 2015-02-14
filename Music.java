// Coded by Jared Smith
// Class to keep track of music
// 2/13/15 - start

public class Music {
  public  String album;
  public String artist;
  public String genre;
  public String media;
  public String location;
  public int copies;

// Data is up above this line
// ---------------------------------------------------------------------
// Behavior is below this line


  Music()  {
    album = "No album";
    artist = "No artist";
    genre = "No genre";
    media = "None";
    location = "Nowhere";
    copies = 1;
   }

  Music(String thisAlbum, String thisArtist, String thisGenre, String thisMedia) {
    this();
    album = thisAlbum;
    artist = thisArtist;
    genre = thisGenre;
    media = thisMedia;
    }

  Music(String thisArtist) {
    this();
    artist = thisArtist;
    }

  public String toString() {
    String output = "";
    output = "Album: " + album + " Artist: " + artist + " Genre: " + genre + " Media: " + media + " Location: " + location + " Copies: " + copies;
    return output;
    }
}
