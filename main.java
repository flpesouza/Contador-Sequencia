import java.util.*;

public class Contador {
    public static void main(String[] args){
        int valor=0;
        int cont=0;
        int aux=0;
        int aux2=0;
        Scanner sc = new Scanner(System.in);
        while(valor!=-1){
        System.out.println("Digite o valor: ");
        valor = sc.nextInt();
        if(valor>aux){
            cont++;
            if(cont>aux2){
            aux2=cont;
            }
        }else{
            cont=1;
        }
        aux=valor;
        }
        System.out.println("Resposta: "+aux2);
        sc.close();
    }
}
