package LambdaBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a.shipulin on 26.02.18.
 */
public class FirstExample {
    public static void main(String[] args) {
        List<Artist> allArtists = new ArrayList<>();
        allArtists.add(new Artist("Madonna", "New York"));
        allArtists.add(new Artist("C.C. Catch", "Hamburg"));
        allArtists.add(new Artist("Elton John", "London"));
        allArtists.add(new Artist("Lara Fabian", "Quebek"));
        allArtists.add(new Artist("Sophie Ellis-Bextor", "London"));

        /*
        allArtists.stream().filter(artist -> {
            System.out.println(artist.getFio());
            return artist.isFrom("Lonson").count();
        });*/
        Iteration iteration = new Iteration();
        System.out.println(iteration.internalCountArtistsFromLondon(allArtists));


    }
}
