package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie();
        movie1.setTitle("Interstellar");
        movie1.setDescription("Sci-fi");
        System.out.println("this movie was added " + movieService.add(movie1));
        System.out.println("this movie was got " + movieService.get(1L));;
    }
}
