package encapsulation;

public class Movie {
    private String title;
    private String director;
    private int duration; // in minutes

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMovieDetails() {
        int hours = duration / 60;
        int minutes = duration % 60;
        return "Movie: " + title + " | Director: " + director +
                " | Duration: " + hours + "h " + minutes + "m";
    }
}
