import java.util.Scanner;
public class Jogar {
    
int MAX_TENTATIVAS = 6;
  char LIMITE_INFERIOR_LETRAS = 'a';
  char LIMITE_SUPERIOR_LETRAS = 'Z';
  int tentativas = 0;
  Palavra palavra;


 
    
    Exibir regra = new Exibir();
    Scanner escaneador = new Scanner(System.in);

    
    public void jogar() {
          
        boolean jogoAcabou = false;
        while(!jogoAcabou){

    
    regra.exibirForca();
    regra.exibirPalavra();
    
    System.out.println("Dgitie uma letra: ");
    char letra = escaneador.next().toLowerCase().charAt(0);

    if(letra < LIMITE_INFERIOR_LETRAS || letra > LIMITE_SUPERIOR_LETRAS){

    System.out.println("Digite uma letra valida!!");

    }

    if(!regra.adivinhaLetra(letra)){

        tentativas++;
    }

    if(tentativas >= MAX_TENTATIVAS){
        jogoAcabou = true;
        System.out.println("Você perdeu! a palavra era: " + palavra.getPalavra());

    } else if(regra.palavraAdivinhada()){
        jogoAcabou = true;
        System.out.println("Parabéns, vc ganhou");                
    }
}



 }
}
