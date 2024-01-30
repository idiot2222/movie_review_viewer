package me.bogeun.data;

import java.util.*;

public class RawData {
    private static List<Movie> movieList;

    static {
        movieList = movieList();
    }

    public static List<Movie> getMovieList() {
        return movieList;
    }

    private static List<Movie> movieList() {
        return List.of(
                new Movie("The Dark Knight", "Christopher Nolan", "Warner Bros. Pictures", randomReviewList()),
                new Movie("Inception", "Christopher Nolan", "Warner Bros. Pictures", randomReviewList()),
                new Movie("Interstellar", "Christopher Nolan", "Warner Bros. Pictures", randomReviewList()),
                new Movie("Dunkirk", "Christopher Nolan", "Warner Bros. Pictures", randomReviewList()),
                new Movie("Harry Potter and the Deathly Hallows – Part 2", "David Yates", "Warner Bros. Pictures", randomReviewList()),
                new Movie("Jurassic Park", "Steven Spielberg", "Universal Pictures", randomReviewList()),
                new Movie("E.T. the Extra-Terrestrial\"", "Steven Spielberg", "Universal Pictures", randomReviewList()),
                new Movie("Jaws", "Steven Spielberg", "Universal Pictures", randomReviewList()),
                new Movie("Schindler's List", "Steven Spielberg", "Universal Pictures", randomReviewList()),
                new Movie("Despicable Me", "Pierre Coffin", "Universal Pictures", randomReviewList()),
                new Movie("The Lion King", "Roger Allers", "Walt Disney Studios Motion Pictures", randomReviewList()),
                new Movie("Frozen", "Chris Buck", "Walt Disney Studios Motion Pictures", randomReviewList()),
                new Movie("Beauty and the Beast", " Gary Trousdale", "Walt Disney Studios Motion Pictures", randomReviewList()),
                new Movie("Toy Story", "John Lasseter", "Walt Disney Studios Motion Pictures", randomReviewList()),
                new Movie("Finding Nemo", "Andrew Stanton", "Walt Disney Studios Motion Pictures", randomReviewList()),
                new Movie("Forrest Gump", "Robert Zemeckis", "Paramount Pictures", randomReviewList()),
                new Movie("Titanic", "James Cameron", "Paramount Pictures", randomReviewList()),
                new Movie("Indiana Jones and the Raiders of the Lost Ark", "Steven Spielberg", "Paramount Pictures", randomReviewList()),
                new Movie("Transformers", "Michael Bay", "Paramount Pictures", randomReviewList()),
                new Movie("The Godfather", "Francis Ford Coppola", "Paramount Pictures", randomReviewList()),
                new Movie("Avatar", "James Cameron", "20th Century Studios", randomReviewList()),
                new Movie("Star Wars: Episode IV - A New Hope", "George Lucas", "20th Century Studios", randomReviewList()),
                new Movie("The Sound of Music", "Robert Wise", "20th Century Studios", randomReviewList()),
                new Movie("Home Alone", "Chris Columbus", "20th Century Studios", randomReviewList()),
                new Movie("Spider-Man: Into the Spider-Verse", "Peter Ramsey", "Sony Pictures Entertainment", randomReviewList()),
                new Movie("The Social Network", "David Fincher", "Sony Pictures Entertainment", randomReviewList()),
                new Movie("Men in Black", "Barry Sonnenfeld", "Sony Pictures Entertainment", randomReviewList()),
                new Movie("Ghostbusters", "Ivan Reitman", "Sony Pictures Entertainment", randomReviewList()),
                new Movie("The Amazing Spider-Man", "Marc Webb", "Sony Pictures Entertainment", randomReviewList()),
                new Movie("Spirited Away", "Hayao Miyazaki", "Studio Ghibli", randomReviewList()),
                new Movie("My Neighbor Totoro", "Hayao Miyazaki", "Studio Ghibli", randomReviewList()),
                new Movie("Howl's Moving Castle", "Hayao Miyazaki", "Studio Ghibli", randomReviewList())
        );
    }

    private static List<Review> randomReviewList() {
        List<Review> reviews = new ArrayList<>();
        int reviewCnt = getRandomInt(5, 10);

        for (int i = 0; i < reviewCnt; i++) {
            reviews.add(generateRandomReview());
        }

        return reviews;
    }

    private static Review generateRandomReview() {
        Gender[] genders = Gender.values();

        return new Review(genders[getRandomInt(0, 2)],
                                getRandomInt(10, 70),
                                getRandomInt(1, 10));
    }

    private static int getRandomInt(int offset, int bound) {
        return new Random().nextInt(bound) + offset;
    }
}
