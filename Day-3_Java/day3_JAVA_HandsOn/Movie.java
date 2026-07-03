package com.coforge.day3;

public class Movie {
	String movieName;
	String director;
	double rating;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String movieName, String director, double rating) {
		super();
		this.movieName = movieName;
		this.director = director;
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", director=" + director + ", rating=" + rating + "]";
	}

	public static void main(String args[]) {
		Movie one = new Movie("Jurassic World","xyz",8.9);
		Movie two = new Movie("Jurassic Park","zxt",9.8);
		System.out.println(one);
		System.out.println(two);
		
	}
}
