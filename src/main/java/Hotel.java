

public class Hotel {
    private String nome;
    private Integer rating;
    private Double weekRegularPrice;
    private Double weekendRegularPrice;
    private Double weekRewardPrice;
    private Double weekendRewardPrice;
    
   

    public Hotel(String nome, Integer rating, Double weekRegularPrice, Double weekendRegularPrice,
            Double weekRewardPrice, Double weekendRewardPrice) {
        this.nome = nome;
        this.rating = rating;
        this.weekRegularPrice = weekRegularPrice;
        this.weekendRegularPrice = weekendRegularPrice;
        this.weekRewardPrice = weekRewardPrice;
        this.weekendRewardPrice = weekendRewardPrice;
    }



    public String getnome() {
        return nome;
    }



    public void setnome(String nome) {
        this.nome = nome;
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
