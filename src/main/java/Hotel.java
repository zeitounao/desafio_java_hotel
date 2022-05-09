

public class Hotel {
    private String name;
    private Integer rating;
    private Double weekRegularPrice;
    private Double weekendRegularPrice;
    private Double weekRewardPrice;
    private Double weekendRewardPrice;
    
   

    public Hotel(String name, Integer rating, Double weekRegularPrice, Double weekendRegularPrice,
            Double weekRewardPrice, Double weekendRewardPrice) {
        this.name = name;
        this.rating = rating;
        this.weekRegularPrice = weekRegularPrice;
        this.weekendRegularPrice = weekendRegularPrice;
        this.weekRewardPrice = weekRewardPrice;
        this.weekendRewardPrice = weekendRewardPrice;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public Integer getRating() {
        return rating;
    }



    public void setRating(Integer rating) {
        this.rating = rating;
    }



    public Double getWeekRegularPrice() {
        return weekRegularPrice;
    }



    public void setWeekRegularPrice(Double weekRegularPrice) {
        this.weekRegularPrice = weekRegularPrice;
    }



    public Double getWeekendRegularPrice() {
        return weekendRegularPrice;
    }



    public void setWeekendRegularPrice(Double weekendRegularPrice) {
        this.weekendRegularPrice = weekendRegularPrice;
    }



    public Double getWeekRewardPrice() {
        return weekRewardPrice;
    }



    public void setWeekRewardPrice(Double weekRewardPrice) {
        this.weekRewardPrice = weekRewardPrice;
    }



    public Double getWeekendRewardPrice() {
        return weekendRewardPrice;
    }



    public void setWeekendRewardPrice(Double weekendRewardPrice) {
        this.weekendRewardPrice = weekendRewardPrice;
    }

}
