package pkoding.world.movies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieConstroller {
    @GetMapping
    public String allMovies() {
        return "All Movies!";
    }
}
