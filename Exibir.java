
public class Exibir {
    
  int tentativas;
  char[] letrasCertas;
  Palavra palavra;
  char CARACTERE_SECRETO = '_';

  
  




    public void exibirForca(){

        System.out.println(" ________     ");
        System.out.println("|        |    ");
        System.out.println("|        " + (tentativas > 0 ? "O" : ""));
        System.out.println("|       " + (tentativas > 2 ? "/" : "") + " " + (tentativas > 1 ? "|" : "") + (tentativas > 3 ? "\\" : ""));
        System.out.println("|       " + (tentativas > 4 ? "/" : "") + " " + (tentativas > 5 ? "\\" : ""));
        System.out.println("|             ");
        System.out.println("|             ");
        System.out.println("______________");

    }

    public void exibirPalavra() {
        for (int i = 0; i < letrasCertas.length; i++) {
            System.out.print(letrasCertas[i] + " ");
        }
        System.out.println();
    }

    public boolean adivinhaLetra(char letra){

        boolean acertou = false;
        for (int i = 0; i < palavra.getPalavra().length(); i++) {
            if (palavra.getPalavra().charAt(i) == letra) {
                letrasCertas[i] = letra;
                acertou = true;
            }
        }
        return acertou;
    }
    public  boolean palavraAdivinhada(){
            for (int i = 0; i < letrasCertas.length; i++) {
                if (letrasCertas[i] == CARACTERE_SECRETO) {
                    return false;
                }
            }
            return true;
        }

    
   

        
      


}

