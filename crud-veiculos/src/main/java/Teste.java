/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Teste {
    
    public static Leitura leitura = new Leitura();
    
    public static Passeio veiculoPasseio;
    public static Carga veiculoCarga;
    
    public static Passeio[] vetVeiculoPasseio = new Passeio[5];
    public static Carga[] vetVeiculoCarga = new Carga[5];
    
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("############ ATENÇÃO ############");
        System.out.println("");
        
        boolean continuar = true;
        int opcao = 0;
        
        while (continuar) {
            System.out.println("\n\t\t\t MENU INICIAL");
            System.out.println("\n\t (1) Cadastrar Veículo de PASSEIO");
            System.out.println("\n\t (2) Cadastrar Veículos de CARGA");
            System.out.println("\n\t (3) Imprimir todos os veículos de PASSEIO");
            System.out.println("\n\t (4) Imprimir todos os veículos de CARGA");
            System.out.println("\n\t (5) Imprimir todos os veículos de PASSEIO pela placa");
            System.out.println("\n\t (6) Imprimir todos os veículos de CARGA pela placa");
            System.out.println("\n\t (7) Sair do sistema");
            
            opcao = Integer.parseInt(leitura.entDados("\n\t Escolher uma opção"));
            
            
            switch (opcao) {
                case 1:
                        for (int i = achaVagoPasseio(); i < vetVeiculoPasseio.length; i++) {
                            if (i == -1) {
                                leitura.entDados("\nVetor de PASSEIO está cheio! press <ENTER>");
                                break;
                            }
                            
                            veiculoPasseio = new Passeio();
                            vetVeiculoPasseio[i] = cadastraVeiculoPasseio(veiculoPasseio);
                            
                            leitura.entDados("\nVeículo de PASSEIO armazenado na posição " + i + " do vetor - press <ENTER>");
                            
                            String respPasseio = leitura.entDados("\nDeseja cadastrar outro veículo de PASSEIO? <s/n>");
                            
                            if (respPasseio.equalsIgnoreCase("n")) {
                                break;
                            }
                            
                            if (achaVagoPasseio() == -1) {
                                leitura.entDados("\nVetor de PASSEIO está cheio! press <ENTER>");
                                break;
                            }
                        }
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    System.out.println("\nVeículo de PASSEIO - Imprime TODOS os veículos");
                    System.out.println("=================================================");
                    for (int i = 0; i < vetVeiculoPasseio.length; i++) {
                        if (vetVeiculoPasseio[i] != null) {
                            imprimeVeiculoPasseio(vetVeiculoPasseio[i], i);
                        } else {
                            leitura.entDados("\nSem mais veículos de PASSEIO para imprimir - press <ENTER>");
                        }
                    }
                    System.out.println("=================================================");
                    break;
                    
                case 7:
                    continuar = false;
                    break;
                    
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    public static int achaVagoPasseio() {
        for (int i = 0; i < vetVeiculoPasseio.length; i++) {
            if (vetVeiculoPasseio[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public static int achaVagoCarga() {
        for (int i = 0; i < vetVeiculoCarga.length; i++) {
            if (vetVeiculoCarga[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public static Passeio cadastraVeiculoPasseio(Passeio veiculoPasseio) {
        System.out.println("\n==============================");
        System.out.println("Cadastro de veículo de PASSEIO");
        System.out.println("==============================");
        veiculoPasseio.setCor(leitura.entDados("Cor......................:"));
        veiculoPasseio.setMarca(leitura.entDados("Marca..................:"));
        veiculoPasseio.setModelo(leitura.entDados("Modelo................:"));
        veiculoPasseio.setPlaca(leitura.entDados("Placa..................:"));
        veiculoPasseio.setQtdRodas(Integer.parseInt(leitura.entDados("Qtdade de rodas................:")));
        veiculoPasseio.setVelocMax(Float.parseFloat(leitura.entDados("Veloc. Máx.....................:")));
        veiculoPasseio.setQtdPassageiros(Integer.parseInt(leitura.entDados("Qtdade de passageiros....:")));
        veiculoPasseio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("Potencia do motor...:")));
        veiculoPasseio.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("Qtdade de pistão do motor.......:")));
        return veiculoPasseio;
    }
    
    public static void imprimeVeiculoPasseio(Passeio veiculoPasseio, int i) {
        System.out.println("\nO veículo de PASSEIO armazenado no endereço.......:" + i +" (vetor do vetVeiculoPasseio)");
        System.out.println("Cor......................: " + veiculoPasseio.getCor());
        System.out.println("Marca....................: " + veiculoPasseio.getMarca());
        System.out.println("Placa....................: " + veiculoPasseio.getPlaca());
        System.out.println("Qtdade de rodas..........: " + veiculoPasseio.getQtdRodas());
        System.out.println("Veloc. Máx...............: " + veiculoPasseio.getVelocMax());
        System.out.println("Qtdade de passageiros....: " + veiculoPasseio.getQtdPassageiros());
        System.out.println("Potência do motor........: " + veiculoPasseio.getMotor().getPotencia());
        System.out.println("Qtdade de pistão.........: " + veiculoPasseio.getMotor().getQtdPist());
        System.out.println("Qtdade passag. + qtdade rodas...: " + veiculoPasseio.calcular());
        
    }
    
}
