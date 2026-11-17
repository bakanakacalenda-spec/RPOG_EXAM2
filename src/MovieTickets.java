public class MovieTickets implements IMovieTickets {
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int Total = 0;
        for (int i = 0; i < movieTicketSales.length; i++) {
            Total += movieTicketSales[i];
        }

        return Total;
    }
@Override
public String TopMovie(String[] movies, int[] totalSales) {
        int topIndex = 0;
        for (int j = 1; j < totalSales.length; j++) {
            if (totalSales[j] > totalSales[topIndex]) {
                topIndex = j;
            }


        }

        return movies[topIndex];
    }
}

