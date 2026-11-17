public interface IMovieTickets  {
    int TotalMovieSales(int[] movieTicketSales);

    String TopMovie(String[] movies, int[] totalSales);

    public interface IMovieTicket {
        int TotalMovieSales(int[]movieTicketSales);
        String TopMovie(String[] movies,int[] totalSales);
    }
}
