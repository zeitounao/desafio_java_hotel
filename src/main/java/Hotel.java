

public class Hotel {
    private String nome;
    private Integer avaliacao;
    private Double preco_regular_semana;
    private Double preco_regular_fim_da_semana;
    private Double preco_Reward_semana;
    private Double preco_Reward_fim_da_semana;
    
   

    public Hotel(String nome, Integer avaliacao, Double preco_regular_semana, Double preco_regular_fim_da_semana,
            Double preco_Reward_semana, Double preco_Reward_fim_da_semana) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.preco_regular_semana = preco_regular_semana;
        this.preco_regular_fim_da_semana = preco_regular_fim_da_semana;
        this.preco_Reward_semana = preco_Reward_semana;
        this.preco_Reward_fim_da_semana = preco_Reward_fim_da_semana;
    }



    public String get nome() {
        return nome;
    }



    public void set nome(String nome) {
        this.nome = nome;
    }



    public Integer get avaliacao() {
        return avaliacao;
    }



    public void set avaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }



    public Double get preco_regular_semana() {
        return preco_regular_semana;
    }



    public void set preco_regular_semana(Double preco_regular_semana) {
        this.preco_regular_semana = preco_regular_semana;
    }



    public Double get preco_regular_fim_da_semana() {
        return preco_regular_fim_da_semana;
    }



    public void set preco_regular_fim_da_semana(Double preco_regular_fim_da_semana) {
        this.preco_regular_fim_da_semana = preco_regular_fim_da_semana;
    }



    public Double get preco_Reward_semana() {
        return preco_Reward_semana;
    }



    public void set preco_Reward_semana(Double preco_Reward_semana) {
        this.preco_Reward_semana = preco_Reward_semana;
    }



    public Double get preco_Reward_fim_da_semana() {
        return preco_Reward_fim_da_semana;
    }



    public void set preco_Reward_fim_da_semana(Double preco_Reward_fim_da_semana) {
        this.preco_Reward_fim_da_semana = preco_Reward_fim_da_semana;
    }

}
