import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        int parametro1, parametro2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        parametro1 = sc.nextInt();
        System.out.println("Digite o primeiro parâmetro: ");
        parametro2 = sc.nextInt();

        try{
            contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }


    }
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametro2 - parametro1;
        for(int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }

}