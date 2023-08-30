public class Principal {
  public static void main(String[] args) {
    Aeronave aviaoGol = new Aeronave();
    aviaoGol.totalAssentos = 100;

    aviaoGol.desativar();
    aviaoGol.ativar();

    aviaoGol.reservarAssentos(10);

    System.out.printf("GOL (%s): %d assentos disponiveis%n",
        aviaoGol.ativo ? "Ativo" : "Inativo",
        aviaoGol.calcularAssentosDisponiveis()
        );

    Aeronave aviaoLatam = new Aeronave();

    aviaoLatam.totalAssentos = 200;
    aviaoLatam.desativar();

    aviaoLatam.reservarAssentos(50);

    System.out.printf("Latam (%s): %d assentos disponiveis%n",
        aviaoLatam.ativo ? "Ativo" : "Inativo",
        aviaoLatam.calcularAssentosDisponiveis()
        );
  }
}
