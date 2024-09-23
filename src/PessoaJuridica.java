public  class PessoaJuridica extends pessoa{
    private int funcionarios;

    @Override
    public double calcImposto() {
        double rendaAnual = getRendaAnual();
       if(this.funcionarios >= 10){
        return rendaAnual * 0.14;
       }else{
        return rendaAnual * 0.16;
       }
   
    }

    public PessoaJuridica(String nome, double renda, int funcionarios){
        super(nome,renda);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public String toString(){
        return " " + getName() +
        " $" + String.format("%.2f",calcImposto());
    }

    
}
