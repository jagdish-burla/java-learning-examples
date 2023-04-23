public class Movie {

    private String title;
    private String type;

    public Movie(String title) {
        this.title = title;
        type = title.substring(0,1);
        switch (type){
            case "A": this.type = "Adventure";
            case "C": this.type = "Comedy";
            case "S": this.type = "Scifi";
            default: this.type = "Movie";
        }
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("%s is a %s movie \n",title,instanceType);
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Adventure movies might not be boring \n");
    }
}

class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println( "Comedy movies could be boring \n");
    }
}

class Scifi extends Movie{
    public Scifi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Scifi movies might be boring if not directed well");
    }
}
