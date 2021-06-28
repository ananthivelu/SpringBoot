package com.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MoviesController {
	
	@Autowired
	Movierepository moviesrepository;
	
	private static List<Movie> movies= new ArrayList<Movie>();
	@GetMapping("/getmovies")
	public List<Movie> getMovies()
	{
		return (List<Movie>) moviesrepository.findAll();
		
	}
	
	@PostMapping("/addmovies")
	public Movie addMovies(@RequestBody Movie movie) {
		movies.add(movie);
		return movie;
		
	}

}
