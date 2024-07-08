// imagine that a Arrey is a box, that have divisory
	// where in that box, you can places  items, that can be organized and manipuled
	// for you when need.
	// a space of a divisory ever to be indentified  for a number int
	// that number ever to start with the  number zero
	// it can to be of any type: int, String...




package array;
import java.util.Scanner;
public class Array01 {

    public static void main(String[] args) {
        
   
        Scanner ler = new Scanner(System.in);
        
        
        //int caixa[] = new int [5];
        /*caixa[0] = 2;
        caixa[1] = 3;
        caixa[2] = 1;
        caixa[3] = 5;
        caixa[4] = 7;
        /*System.out.print(caixa[0]+" ");
        System.out.print(caixa[1]+" ");
        System.out.print(caixa[2]+" ");
        System.out.print(caixa[3]+" ");
        System.out.print(caixa[4]+" ");
        */
        
        System.out.println("digite o tamanho para sua caixa: ");
        int espaco = ler.nextInt();
        String continuar = "S";
        
        int caixa[] = new int[espaco];
        
        
        while(continuar.equals("S")) {
        System.out.println("Digite o compartilhamento do caixa que quer acessar: ");
        int compart = ler.nextInt();
        
        System.out.println("Digite o item que quer alocar no compartimento: ");
        int item = ler.nextInt();
        
        ler.nextLine();
        
        caixa[compart - 1] = item;
        
            System.out.println("Deseja alocar mais itens: S/N ");
            continuar = ler.nextLine();
        }
    
        
            if(continuar.equalsIgnoreCase("S")) {    
                
         }else {
        
             
          for (int i = 0; i< caixa.length; i++) {
              
          System.out.print(caixa[i]+ " ");
         }
            
            
            
            
    }    

}
}



