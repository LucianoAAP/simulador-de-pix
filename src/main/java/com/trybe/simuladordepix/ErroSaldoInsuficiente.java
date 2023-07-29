package com.trybe.simuladordepix;

public class ErroSaldoInsuficiente extends ErroDePix {

  private static final long serialVersionUID = 4059112963269739104L;

  public ErroSaldoInsuficiente(String mensagem) {
    super(mensagem);
  }
  
  public ErroSaldoInsuficiente() {
    super(Mensagens.SALDO_INSUFICIENTE);
  }

}
