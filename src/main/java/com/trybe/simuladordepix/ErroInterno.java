package com.trybe.simuladordepix;

public class ErroInterno extends ErroDePix {

  private static final long serialVersionUID = -5868471973357264488L;

  public ErroInterno(String mensagem) {
    super(mensagem);
  }
  
  public ErroInterno() {
    super(Mensagens.ERRO_INTERNO);
  }

}
