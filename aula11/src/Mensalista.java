public class Mensalista extends Empregado {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public Mensalista(String nome, String endereco, String cargo){
        super(nome, endereco);
        this.cargo = cargo;
    }

    public void calcularSalario(){
        if (cargo.equals("Junior")) {
            salario = 2500;
        } else if(cargo.equals("Pleno")){
            salario = 3500;
        }else{
            salario = 5500;
        }
    }

    public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Cargo: "+getCargo());
        System.out.println("Salario: " + getSalario());
        System.out.println("INSS a pagar: "+calcularInss());
        System.out.println("IRPF a pagar: "+calcularIrpf());
        System.out.println("========================================");
    }
}
