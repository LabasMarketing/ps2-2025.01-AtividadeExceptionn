package br.dev.joaquim;

public class App {
  /**
   * Método principal que inicializa a interface do usuário
   * 
   * @param args nenhum argumento é requerido para a execução
   */
  public static void main(String[] args) {
    //Try e catch para tratar as duas execuções //
    try{
    UserInterface main = new UserInterface();
    main.start();
    }catch(IllegalArgumentException a){
      System.out.println(a.getMessage());
    }
    catch(InsufficientFoundsException e){
      System.out.println(e.getMessage());
    }
  }
}
