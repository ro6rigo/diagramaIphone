// Interface
interface ReprodutorMusical {
  public void tocar(); 
  public void pausar(); 
  public void selecionarMusica(); 
}

// Interface
interface AparelhoTelefonico {
  public void ligar(); 
  public void atender(); 
  public void iniciarCorreioVoz(); 
}

// Interface
interface NavegadorNaInternet {
  public void exibirPagina(); 
  public void adicionarNovaAba(); 
  public void atualizarPagina(); 
}

// Classe
class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
  public void tocar() {
    // TODO
  }
  public void pausar() {
    // TODO
  }
  public void selecionarMusica() {
    // TODO
  }
  public void ligar() {
    // TODO
  }
  public void atender() {
    // TODO
  }
  public void iniciarCorreioVoz() {
    // TODO
  }
  public void exibirPagina() {
    // TODO
  }
  public void adicionarPagina() {
    // TODO
  }
  public void atualizarPagina() {
    // TODO
  }
}

class Main {
  public static void main(String[] args) {
    Iphone myIphone = new Iphone(); 
    myIphone.tocar();
    myIphone.pausar();
    myIphone.selecionarMusica();
    myIphone.ligar();
    myIphone.atender();
    myIphone.iniciarCorreioVoz();
    myIphone.exibirPagina();
    myIphone.adicionarPagina();
    myIphone.atualizarPagina();
  }
}