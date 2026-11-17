//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] movieTickets = {{3000, 1500,1700},{3500, 1200,1600}};
        String[] movies = {"Napoleon", "oppenheimer"};
        String[] months = {"JAN", "FEB", "MAR"};

        MovieTickets mt = new MovieTickets();
        int[] TotalSales = new int[movies.length];
        int topIndex = 0;

        System.out.println("MOVIE TICKETS SALES REPORT - 2024");
        System.out.printf("%n%-15s%-10s%-10s%-10s%n", " ", "JAN", "FEB", "MAR");
        System.out.println("---------------------------------------------------------------");


        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-15s", movies[i]);


            for (int j = 0; j < movieTickets[i].length; j++) {
                System.out.printf("%-10d", movieTickets[i][j]);
            }

            System.out.println();
            TotalSales[i] = mt.TotalMovieSales(movieTickets[i]);


        }
        System.out.println();

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Total movie ticket sales for " + movies[i] + " " + TotalSales[i]);
        }

        System.out.println();

        String topMovie = mt.TopMovie(movies, TotalSales);
        System.out.println("Top performing movie: " + topMovie);
    }
}





