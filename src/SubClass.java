public class SubClass  {

    private String fmovie;

    public void setMovie(String movieName) {
        fmovie = movieName;
    }

    public String getMovie(){
        return fmovie;
    }

    public void fResult(){
        System.out.printf("Your favourite movie is %s", getMovie());
    }
}
