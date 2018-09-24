package movies;
import util.Input;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MoviesApplication {
    static Input scan = new Input();
    private static Movie[] getCategories(String categories){
        Movie[] everything = MoviesArray.findAll();
        Movie[] newArr = Arrays.stream(everything).filter(movie -> movie.getCategory().equalsIgnoreCase(categories)).toArray(Movie[]::new);


        return newArr;
    }
    public static void getAll(){
        for(Movie movie:MoviesArray.findAll()){
            System.out.printf("%s -- %s%n",movie.getName(),movie.getCategory());
        }
    }
    public static void showCategory(Movie[] m){
        for(Movie movie:m){
            System.out.printf("%s -- %s%n",movie.getName(),movie.getCategory());
        }
    }
    public static void getMovies(){
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view all movies in the animated category");
        System.out.println("3 - view all movies in the drama category");
        System.out.println("4 - view all movies in the horror category");
        System.out.println("5 - view all movies in the scifi category");
        System.out.print("Enter your choice:");
        int userInput = scan.getInt(0,5);
        if(userInput == 0){
            System.exit(0);
        } else if(userInput == 1){
            getAll();
        } else if(userInput == 2){
            showCategory(getCategories("animated"));
        } else if(userInput == 3){
            showCategory(getCategories("drama"));
        } else if(userInput == 4){
            showCategory(getCategories("horror"));
        } else if(userInput == 5){
            showCategory(getCategories("scifi"));
        }
    }
    public static void main(String[] args) {
        getMovies();
        System.out.println("Do you want to continue?");
        while(Input.yesNo()) {
            getMovies();
            System.out.println("Do you want to continue?");

        }

    }
}
