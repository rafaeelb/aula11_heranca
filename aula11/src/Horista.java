public class Horista extends Empregado {
    
    private double horas;

    public Horista(String nome, String endereco, double horas){
        super(nome, endereco);
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
        System.out.println("INSS a pagar: "+calcularInss());
        System.out.println("IRPF a pagar: "+calcularIrpf());
        System.out.println("========================================");
    }
}
