public class PessoaFisica extends pessoa {
    private double gastosSaude;

    public PessoaFisica(String nome, double renda, double gastosSaude) {
        super(nome, renda);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    @Override
    public double calcImposto() {
      if(getRendaAnual() < 20000){
        return getRendaAnual() * 0.15 - gastosSaude * 0.5;
      }else{
        return getRendaAnual() * 0.25 - gastosSaude * 0.5;
      }
    }

    public String toString(){
        return " " + getName() +
        " $"  + String.format("%.2f",calcImposto());
    }
}    
    

