public abstract class pessoa {
    /*
     * Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados
     * de pessoa jurídica
     * são nome, renda anual e número de funcionários
     */
    private String name;
    private double rendaAnual;


    public pessoa(String name, double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }
    public pessoa(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
    public double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }


    public abstract double calcImposto();


}