package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String msg) {
        System.out.printf("Notificando %s através do e-mail %s => %s\n", cliente.getNome(), cliente.getEmail(), msg);
    }

}
