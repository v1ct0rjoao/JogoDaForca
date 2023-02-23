public class Forca {
    
    public static final int MAX_TENTATIVAS = 6;
 


    public static void exibirForca(int tentativas){
        System.out.println(" ________     ");
        System.out.println("|        |    ");
        System.out.println("|        " + (tentativas > 0 ? "O" : ""));
        System.out.println("|       " + (tentativas > 2 ? "/" : "") + " " + (tentativas > 1 ? "|" : "") + (tentativas > 3 ? "\\" : ""));
        System.out.println("|       " + (tentativas > 4 ? "/" : "") + " " + (tentativas > 5 ? "\\" : ""));
        System.out.println("|             ");
        System.out.println("|             ");
        System.out.println("______________");
    }
  }
   