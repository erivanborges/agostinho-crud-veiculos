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
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 7:
                    continuar = false;
                    break;
                    
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
}
