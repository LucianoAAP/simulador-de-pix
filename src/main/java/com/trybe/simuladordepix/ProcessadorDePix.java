package com.trybe.simuladordepix;

import java.io.IOException;

public class ProcessadorDePix {

  private final Servidor servidor;

  public ProcessadorDePix(Servidor servidor) {
    this.servidor = servidor;
  }

  /**
   * Executa a operação do pix. Aqui é implementada a lógica de negócio
   * sem envolver as interações do aplicativo com a pessoa usuária.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @throws ErroDePix Erro de aplicação, caso ocorra qualquer inconformidade.
   * @throws IOException Caso aconteça algum problema relacionado à comunicação
   *                     entre o aplicativo e o servidor na nuvem.
   */
  public void executarPix(int valor, String chave) throws ErroDePix, IOException {
    if (valor <= 0) {
      throw new ErroValorNaoPositivo(Mensagens.VALOR_NAO_POSITIVO);
    }
    if (chave == null || chave.isBlank()) {
      throw new ErroChaveEmBranco(Mensagens.CHAVE_EM_BRANCO);
    }
    
    Conexao connection = this.servidor.abrirConexao();
    try {
      String result = connection.enviarPix(valor, chave);
      switch (result) {
        case CodigosDeRetorno.SUCESSO:
          break;
        case CodigosDeRetorno.SALDO_INSUFICIENTE:
          throw new ErroSaldoInsuficiente(Mensagens.SALDO_INSUFICIENTE);
        case CodigosDeRetorno.CHAVE_PIX_NAO_ENCONTRADA:
          throw new ErroChaveNaoEncontrada(Mensagens.CHAVE_NAO_ENCONTRADA);
        default:
          throw new ErroInterno(Mensagens.ERRO_INTERNO);
      }
    } finally {
      connection.close();
    }
  }
}
