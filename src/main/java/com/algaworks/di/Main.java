package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {

    public static void main(String[] args) {

        Cliente joao = new Cliente("João", "joao@xyz.com.br", "34999239911");
        Cliente maria = new Cliente("Maria", "maria@xyz.com.br", "3199801920");

        AtivacaoClienteService ativador = new AtivacaoClienteService(new NotificadorEmail());
        ativador.ativar(joao);
        ativador.ativar(maria);

    }
}
