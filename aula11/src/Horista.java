public class Horista extends Empregado {
    
    private double horas;

    public Horista(String nome, String endereco, double salario, double horas){
        super(nome, endereco, salario);
        this.horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void calcularSalario(){
        salario = horas * 50;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Salario: " + getSalario());
        System.out.println("Horas: " + getHoras());
        System.out.println("========================================");
    }
}
