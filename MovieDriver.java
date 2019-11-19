import java.util.ArrayList;


/**
 * Write a description of class ArrayListDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieDriver
{
    
    public static void main(String[] args)
    {
        Movie moana   = new Movie("Moana", "Disney", 7.6, 2016);
        Movie frozen  = new Movie("Frozen", "Disney", 7.5, 2013);
        Movie bh6     = new Movie("Big Hero 6", "Disney", 7.8, 2014);
        
        Movie spirit  = new Movie("Spirited Away", "Ghibli", 8.6, 2003);
        Movie howel   = new Movie("Howl's Moving Castle", "Ghibli", 8.2, 2005);
        Movie ponyo   = new Movie("Ponyo", "Ghibli", 7.7, 2009);
        Movie marnie  = new Movie("When Marnie Was There", "Ghibli", 7.7, 2014);
        Movie neTor = new Movie("My Neighbor Totoro","Ghibli",8.2,1988);
        
        Movie april   = new Movie("April and the Extraordinary World", "Indy", 7.3, 2015);
        Movie kubo    = new Movie("Kubo and the two strings", "Indy", 7.8,  2016);
        Movie anastasia = new Movie("Anastasia", "Indy", 7.1, 1997);
        Movie spider    = new Movie("Spider-Man: Into the Spider-Verse", "Indy", 8.4, 2019);
        
        Movie mha1    = new Movie("My Hero Academia: Two Heroes","Toho",7.6, 2018);
        Movie sbz     = new Movie("Dragon Ball Super: Broly","Toho",7.9,2019);
        Movie mha2    = new Movie("My Hero Academia: Heroes Rising","Toho",10.0,2019);
        Movie mt3     = new Movie("d25l8ybundaqcq Magic Tiles 3","oops",384.0,2020);
        
        Movie[] movieArray = {moana, mha2, frozen, bh6, neTor, spirit, mha1, howel, ponyo, marnie, sbz, april, kubo, anastasia, spider, mt3};
       
        System.out.println("Big Hero 6 info:\n"+bh6);
       
        MovieListAL movieList = new MovieListAL(movieArray);
        System.out.println("Studios:\n"+movieList.getByStudio("Disney"));
       
        System.out.println(movieList.getByStudio("Indy"));
       
        System.out.println(movieList.getByStudio("Ghibli"));
        System.out.println(movieList.getByStudio("Toho"));
        System.out.println(movieList.getByStudio("oops")+"\nAnalysis:");
       
        ArrayList<Movie> highestRated = movieList.findHighestRatedByStudio();
        for (int i=0 ; i<highestRated.size() ; i++)
           System.out.println(highestRated.get(i));
    }
}