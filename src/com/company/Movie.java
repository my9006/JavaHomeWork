package com.company;

public class Movie {
	private String title;
	private int rating;

	public Movie(String title, int rating) {
		this.title = title;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	private static String[] getHighestRatedMovie(Movie[] movies) {
		int highestRating = 0;
		for (int i = 0; i < movies.length - 1; i++) {
			if (movies[i].getRating() > highestRating) {highestRating = movies[i].getRating();}
		}
		String[] highestRatingMoviesNames = new String[movies.length];
		int highestRatingMovieIndex = 0;
		for (int i = 0; i < movies.length; i++) {
			if (movies[i].getRating() == highestRating) {
				highestRatingMoviesNames[highestRatingMovieIndex++] = movies[i].getTitle();
			}
		}
		return highestRatingMoviesNames;
	}

	public static void printHighestRtingMoviesNames(String[] highestRatingMovies) {
		for (int i = 0; i < highestRatingMovies.length; i++) {
			if (highestRatingMovies[i] != null) {
				System.out.println(highestRatingMovies[i]);
			}
		}
	}
}