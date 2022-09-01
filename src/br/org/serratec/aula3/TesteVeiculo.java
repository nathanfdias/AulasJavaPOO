package br.org.serratec.aula3;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.placa = ("KJL-3452");
        veiculo1.tipoCombustivel = "Flex";
        veiculo1.valor = 400000.;

        System.out.println("O valor do IPV é: "+ veiculo1.calcularIPVA());
    }
}
