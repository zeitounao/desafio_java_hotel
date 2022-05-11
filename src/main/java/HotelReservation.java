import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class HotelReservation {

    private List<Hotel> hotels;

    public HotelReservation() {

        this.hotels = new ArrayList<>(Arrays.asList(new Hotel[] {
                new Hotel("Lakewood", 3, 110.0, 90.0, 80.0, 80.0),
                new Hotel("Bridgewood", 4, 160.0, 60.0, 110.0, 50.0),
                new Hotel("Ridgewood", 5, 220.0, 150.0, 100.0, 40.0)
        }));

    }


    /**
     * The nome of the cheapeast hotel for a given reservation
     * @param input data from customer(regular or rewards) and book days
     * @return the cheapeast hotel nome for given data
     */
    public String getCheapestHotel(String input) {
        String[] data = input.split(": ");
        String customerType = data[0];
        String[] dates = data[1].split(", ");

        int[] weekDays = Arrays.stream(dates).mapToInt(str -> strToDayOfWeek(str)).toArray();
        return hotels.stream().sorted((h1, h2) -> (-h1.getavaliacao().compareTo(h2.getavaliacao())))
                .sorted((h1, h2) -> reservationCost(h1, weekDays, customerType)
                        .compareTo(reservationCost(h2, weekDays, customerType)))
                .reduce((h1, h2) -> h1).get().getnome();
    }

    

    /**
     * Calculate the cost of the reservation
     * @param hotel for get the hotel`s prices
     * @param weekDays array of days of week 
     * @param customerType regular or rewards
     * @return the cost of the reservation
     */
    private Double reservationCost(Hotel hotel, int[] weekDays, String customerType) {
        double sum = 0;
        switch (customerType) {
            case "Regular":
                sum = Arrays.stream(weekDays).mapToDouble(wd -> {
                    if (wd > 1 && wd < 7)
                        return hotel.getpreco_regular_semana();
                    else
                        return hotel.getpreco_regular_fim_da_semana();
                }).sum();

                break;
            case "Rewards":
                sum = Arrays.stream(weekDays).mapToDouble(wd -> {
                    if (wd > 1 && wd < 7)
                        return hotel.getpreco_Reward_semana();
                    else
                        return hotel.getpreco_Reward_fim_da_semana();
                }).sum();

                break;

        }
        return sum;
    }

    /**
     * Parse a string of a date to the day of the week 
     * @param strDate string format ddMMMyy 
     * @return the day of the week starting from 1 for sunday until 7 for saturday
     */
    private int strToDayOfWeek(String strDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMMyy", Locale.US);
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = simpleDateFormat.parse(strDate);
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
