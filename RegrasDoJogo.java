import java.util.Arrays;

public class RegrasDoJogo {
  private char[] letrasAdivinhadas; //array de caracteres para armazenar as letras adivinhadas 
  private Palavra palavra;
  private int tentativas;

  public RegrasDoJogo(Palavra palavra){
     
    this.palavra = palavra;
    this.letrasAdivinhadas = new char[palavra.getPalavra().length()];
    Arrays.fill(letrasAdivinhadas, '_');
    this.tentativas = 0;


  }

  public boolean letraValida(char letra){
    return letra >= 'a' && letra <= 'z';
  }

  public boolean letraNaPalavra(char letra){
    boolean acertou = false;
    for(int i = 0; i< palavra.getPalavra().length();i++){
        if(palavra.getPalavra().charAt(i) == letra){
            acertou = true;
        }
    }
    return acertou;
  }

  public boolean jogoAcabou(){
    return acertouTodasAsLetras() || tentativas >= Forca.MAX_TENTATIVAS;
  }


  public boolean adivinharLetra(char letra){
    if(!letraValida(letra)){
        System.out.println("letra invalida. digite uma entre A e Z");
        return false;
    }

    boolean acertou = letraNaPalavra(letra);

    if(acertou){
        for(int i = 0; i<palavra.getPalavra().length();i++){
            if(palavra.getPalavra().charAt(i) == letra){
                letrasAdivinhadas[i] = letra;
            }
        }
    }else{
        tentativas++;
    }
    return acertou;
  }


  public boolean exibirPalavraOculta(){
    for(char letra: letrasAdivinhadas){
        if(letra == '_'){
            return false;
        }
    }
    return true;
  }

  public boolean acertouTodasAsLetras(){
    for(char letra : letrasAdivinhadas){
      if(letra == '_'){
        return false;
      }
    }
  return true;
}
  public void decrementarTentativas(){
    tentativas--;
  }
  public int getTentativas(){
    return tentativas;
  }
  public void setTentativas(int tentativas){
    this.tentativas = tentativas;
  }

  // public boolean acertouLetra(char letra){
  //   boolean acertou = acertouTodasAsLetras();
  //   if(acertou){
  //       for(int i = 0; i<palavra.getPalavra().length();i++){
  //           if(palavra.getPalavra().charAt(i)== letra){
  //               letrasAdivinhadas[i] = letra;
  //               tentativas++;
  //           }
  //       }
  //   }else{
  //     decrementarTentativas();
  //   }
  //   return acertou;
  }




   