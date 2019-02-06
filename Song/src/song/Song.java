
package song;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Song {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    
    public static void main(String[] args) {
  // Create a program that implements a playlist for songs 
        // Create a Song class having Title and Duration for a song.  --> done
        // The program will have an Album class containing a list of songs. 
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()
        
        
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stronmbrinter", 4.6);
        
        album.addSong("Love dont mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("High ball shooter", 3.21);
        album.addSong("You can do it right",6.23);
        album.addSong("The gypsy", 4.2);
        albums.add(album);
        
        album = new Album("For those about to rock", "Ac/DC");
        album.addSong("for those about to rock", 5.44);
        album.addSong("Lets go ", 3.25);
        album.addSong("Inject the venum", 3.33);
        album.addSong("Evil walks", 3.45);
        album.addSong("COD", 5.25);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);
        
        LinkedList<Song1> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed King", playList);
        albums.get(1).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);
        
        play(playList);
      
        
    }
    private static void play(LinkedList<Song1> playList){
        Scanner scanner = new Scanner (System.in);
        boolean quit = false;
        boolean forward = true;
        
        ListIterator<Song1> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;}
        else{
            System.out.println("Now Playing "+listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Playlsit complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                        }
                    if (listIterator.hasNext()){
                        System.out.println("Now Playing "+listIterator.next().toString());
                    }
                    else{
                        System.out.println("We have reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                    
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing "+ listIterator.previous().toString());
                    }
                    else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }
                        else{
                            System.out.println("We are at the start of the list");
                        }
                        else {
                            if(listIterator.hasNext())
                                {
                                 System.out.println("Now replaying "+listIterator.next().toString());
                                 forward = true;
                                }
                                }
                             
                        else {
                                     System.out.println("We have reached the end of the list.");
                                 }
                    }
                    break;
                case 4:
                  printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }
    
    private static void printMenu(){
        System.out.println("Available actions: \n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list songs in the playlist\n "+
                "5 - print availabe actions.");
    }
    private static void printList(LinkedList<Song1> playList){
        Iterator<Song1> iterator = playList.iterator();
        System.out.println("========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
