class Movie {
    String title;
    String director;

    Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    // Copy Constructor
    Movie(Movie other) {
        this.title = other.title;
        this.director = other.director;
    }

    void display() {
        System.out.println("Title: " + title + ", Director: " + director);
    }

    public static void main(String[] args) {
        
        Movie movie1 = new Movie("Inception", "Christopher Nolan");

        Movie movie2 = new Movie(movie1);

        movie1.display(); 
        movie2.display(); 
    }
}
