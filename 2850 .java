import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     
     int A;
     int B;
     int C;
      Scanner sc = new Scanner(System.in);
     

      System.out.println("Humberto tem um papagaio inteligente. Quando ele tem as duas pernas no chão, o papagaio fala");
      System.out.println("português. Quando ele levanta a perna esquerda, ele fala em inglês. Finalmente, quando ele levanta o");
      System.out.println("seu direito, ele fala francês. Nico, amigo de Humberto, era fascinado pelo animal. Em sua excitação, ele");
      System.out.println("perguntou:  quando ele levanta os dois? Antes que Humberto pudesse responder, o papagaio gritou:");
      System.out.println("Oh, eu vou cair, seu idiota!");
      System.out.println("  ");
      System.out.println("Escolha: 1- Direita ou 2- Esquerdo");
      System.out.println("  ");
      System.out.println("o papagaio esta falando portugues");
      
      
     A = sc.nextInt();
     
     if (A ==2) {
            System.out.println("o papagaio esta falando ingles");
            B = sc.nextInt();
            
            if(B == 1) {
            System.out.println("o papagaio caiu");}
            
    }else {
            System.out.println("o papagaio esta falando frances");
            C = sc.nextInt();
            
            if (C == 2) {
            System.out.println("o papagaio caiu");
                
            
    }}}}
