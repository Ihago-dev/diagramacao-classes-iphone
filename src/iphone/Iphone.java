package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }


    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void silenciar() {
        System.out.println("Modo silencioso ativo");
    }

    @Override
    public void adicionarContato() {
        System.out.println("Contato adicionado");
    }

    @Override
    public void editarContato() {
        System.out.println("Contato alterado");
    }

    @Override
    public void removerContato() {
        System.out.println("Contato removido");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo página do navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void fecharAbaNavegador() {
        System.out.println("Aba encerrada");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando nova música");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume");
    }
}
