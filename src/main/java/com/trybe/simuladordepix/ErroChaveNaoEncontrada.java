package com.trybe.simuladordepix;

public class ErroChaveNaoEncontrada extends ErroDePix {

  private static final long serialVersionUID = -4295535862746588987L;

  public ErroChaveNaoEncontrada(String mensagem) {
    super(mensagem);
  }
  
  public ErroChaveNaoEncontrada() {
    super(Mensagens.CHAVE_NAO_ENCONTRADA);
  }

}
