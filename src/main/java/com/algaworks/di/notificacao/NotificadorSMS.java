package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String msg) {
        System.out.printf("Notificando %s por SMS através do telefone %s => %s\n");
    }
}
