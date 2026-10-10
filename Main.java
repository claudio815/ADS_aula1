public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de veiculos");
        System.out.println("-------------------");

        // Criando um array do tipo Veiculo com 3 posições
        Veiculo[] frota = new Veiculo[3];

        // Instanciando: Veiculo, Caminhao e Onibus (conforme pede o item 3)
        frota[0] = new Veiculo("TTCW-4543", 2023);
        frota[1] = new Caminhao("ESRS-4345", 2024, 3);
        frota[2] = new Onibus("TREW-4545", 2025, 45);

        // Percorrendo o array com o For-Each
        for (Veiculo v : frota) {
            v.exibirDados();
            System.out.println("-------------------");
        }
    }
}
