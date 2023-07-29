package com.trybe.simuladordepix;

public class ErroChaveEmBranco extends ErroDePix {

  private static final long serialVersionUID = 3662744259485015452L;

  public ErroChaveEmBranco(String mensagem) {
    super(mensagem);
  }
  
  public ErroChaveEmBranco() {
    super(Mensagens.CHAVE_EM_BRANCO);
  }

}
