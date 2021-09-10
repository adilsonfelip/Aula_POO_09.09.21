package group.quintoprojeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc;
        Imovel[] imobiliaria;
        imobiliaria = new Imovel[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Qual o tipo de Imovel");
            System.out.println("1 - Casa");
            System.out.println("2 - Apartamento");
            sc = new Scanner(System.in);
            int op = sc.nextInt();
            System.out.println("Area Util..: ");
            sc = new Scanner(System.in);
            double areaUtil = sc.nextDouble();
            System.out.println("Endereco.: ");
            sc = new Scanner(System.in);
            String endereco = sc.nextLine();

            if (op == 1) {
                System.out.println("Entre com a quantidade de andares..: ");
                sc = new Scanner(System.in);
                int andar = sc.nextInt();
                Casa casa = new Casa(areaUtil, endereco, andar);
                imobiliaria[i] = casa;
            } else {
                System.out.println("Seu apartamento tem cobertura? ");
                sc = new Scanner(System.in);
                boolean cobertura = sc.nextBoolean();
                Apartamento apartamento = new Apartamento(areaUtil, endereco, cobertura);
                imobiliaria[i] = apartamento;

            }
        }

        //Casa casa = new casa(300000,"Rua Joao de Barro Mesquita Filho")
        System.out.println("\nSoma do IPTU: " + somarIPTUs(imobiliaria));
        exibirInfos(imobiliaria);
    }

    private static double somarIPTUs(Imovel[] imoveis) {
        double soma = 0;
        for (Imovel imovel : imoveis) {
            soma += imovel.calcularIPTU();
        }
        return soma;
    }

    private static void exibirInfos(Imovel[] imoveis) {
        for (Imovel imovel : imoveis) {
            System.out.println(imovel);
        }
    }
}
