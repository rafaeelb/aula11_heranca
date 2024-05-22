public class Horista extends Empregado {
    
    private double horas;
    private double vl_horas;

    public Horista(String nome, String endereco, double salario, double horas, double vl_horas){
        super(nome, endereco, salario);
        this.horas = horas;
        this.vl_horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getVl_horas(){
        return vl_horas;
    }

    public void setVl_horas(double vl_horas){
        this.vl_horas = vl_horas;
    }

    public void calcularSalario(double vl_horas){
        salario = horas * vl_horas;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Salario: " + getSalario());
        System.out.println("Valor horas: " + getVl_horas());
        System.out.println("========================================");
    }
}
