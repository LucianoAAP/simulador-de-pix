package com.trybe.simuladordepix;

public class ErroValorNaoPositivo extends ErroDePix {

  private static final long serialVersionUID = -5093739495126907107L;

  public ErroValorNaoPositivo(String mensagem) {
    super(mensagem);
  }
  
  public ErroValorNaoPositivo() {
    super(Mensagens.VALOR_NAO_POSITIVO);
  }

}
