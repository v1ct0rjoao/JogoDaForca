
import java.util.Random;

public class Palavra {

private String[] palavras = {"computador", "erro", "java", "algoritmo", "cartas"};
private String palavra;


  public Palavra(){

    selecionarPalavrasAleatorias();

  }


  private void selecionarPalavrasAleatorias(){
    
    Random aleatorio = new Random();
    int index = aleatorio.nextInt(palavras.length);
    palavra = palavras[index];

    //escolhe aleatoriamente uma palavra do array e a armazena variavel "palavra"
  }

  public String getPalavra(){

    return palavra;

    //o metodo getpalavras retorna a palavra que privada no metodo anterior
  }

}
