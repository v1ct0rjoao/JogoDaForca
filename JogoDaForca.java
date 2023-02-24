import java.util.Scanner;

public class JogoDaForca{

   public static void main(String[] args) {

    
    Scanner escaneador = new Scanner(System.in);
      
      Palavra palavra = new Palavra(" abacaxi");
      RegrasDoJogo regrasDoJogo = new RegrasDoJogo(palavra);
      
   


      while(!regrasDoJogo.jogoAcabou()){
        Forca.exibirForca(regrasDoJogo.getTentativas());
        regrasDoJogo.exibirPalavraOculta();
        System.out.println("Sobre fruta");
        System.out.println("Digite uma letra: ");
        char letra = escaneador.next().charAt(0);
        boolean acertou = regrasDoJogo.adivinharLetra(letra);
        if(acertou){
            System.out.println("você acertou");
           
            
        }else{
            System.out.println("você errou");
            Forca.exibirForca(regrasDoJogo.getTentativas());
        }
       
      }

      if(regrasDoJogo.acertouTodasAsLetras()){
        System.out.println("Parabéns, você ganhou");
      }else{
        System.out.println("que pena, você perdeu! a palavra era" + palavra.getPalavra());
      }


      
  }
}




