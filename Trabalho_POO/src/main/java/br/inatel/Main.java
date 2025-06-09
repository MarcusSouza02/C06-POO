package br.inatel;

import br.inatel.DAO.*;
import br.inatel.Model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {

            Tecnicos tecnico1 = new Tecnicos(1914, "Abel Ferreira", "Ofensivo", "Portugues");
            Tecnicos tecnico2 = new Tecnicos(1911, "Dorival Junior", "Defensivo", "Brasileiro");
            Tecnicos tecnico3 = new Tecnicos(3, "Felipe Luis", "Equilibrado", "Brasileiro");


            Estadios estadio1 = new Estadios("Barra Funda", 43713, "Híbrido", "Allianz Parque");
            Estadios estadio2 = new Estadios("Itaquera", 62000, "Natural", "Arena Corinthians");
            Estadios estadio3 = new Estadios("Maracanã", 78838, "Natural", "Maracanã");

            Jogador jogador1 = new Jogador("Estevão", "Atacante", 18, 101, "Palmeiras");
            Jogador jogador2 = new Jogador("Yuri", "Centro Avante", 24, 254, "Corinthians");
            Jogador jogador3 = new Jogador("Arrascaeta","Meia", 31, 303, "Flamengo");

            List<Jogador> jogadoresPalmeiras = new ArrayList<>();
            jogadoresPalmeiras.add(jogador1);

            List<Jogador> jogadoresCorinthians = new ArrayList<>();
            jogadoresCorinthians.add(jogador2);

            List<Jogador> jogadoresFlamengo = new ArrayList<>();
            jogadoresFlamengo.add(jogador3);

            Time time1 = new Time("Palmeiras", "Verde e Branco", "São Paulo", tecnico1, estadio1, jogadoresPalmeiras);
            Time time2 = new Time("Corinthians", "Alvinegro", "São Paulo", tecnico2, estadio2, jogadoresCorinthians);
            Time time3 = new Time("Flamengo", "Rubro-Negro", "Rio de Janeiro", tecnico3, estadio3, jogadoresFlamengo);

            Campeonato camp1 = new Campeonato("Brasileirão", "Pontos Corridos", "A");
            Campeonato camp2 = new Campeonato("Copa do Brasil", "Grupos e Eliminatórias", "Única");

            ParticipacaoCampeonato p1 = new ParticipacaoCampeonato(time1.getNome(), tecnico1.getCpf(), camp1.getNome());
            ParticipacaoCampeonato p2 = new ParticipacaoCampeonato(time2.getNome(), tecnico2.getCpf(), camp2.getNome());
            ParticipacaoCampeonato p3 = new ParticipacaoCampeonato(time3.getNome(), tecnico3.getCpf(), camp1.getNome());

            TecnicosDAO tecnicosDAO = new TecnicosDAO();
            tecnicosDAO.insertTecnico(tecnico1);
            tecnicosDAO.insertTecnico(tecnico2);
            tecnicosDAO.insertTecnico(tecnico3);

            EstadiosDAO estadiosDAO = new EstadiosDAO();
            estadiosDAO.insertEstadio(estadio1);
            estadiosDAO.insertEstadio(estadio2);
            estadiosDAO.insertEstadio(estadio3);

            TimeDAO timeDAO = new TimeDAO();
            timeDAO.insertTime(time1);
            timeDAO.insertTime(time2);
            timeDAO.insertTime(time3);

            JogadorDAO jogadorDAO = new JogadorDAO();
            jogadorDAO.insertJogador(jogador1);
            jogadorDAO.insertJogador(jogador2);
            jogadorDAO.insertJogador(jogador3);

            CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
            campeonatoDAO.insertCampeonato(camp1);
            campeonatoDAO.insertCampeonato(camp2);

            ParticipacaoCampeonatoDAO participacaoDAO = new ParticipacaoCampeonatoDAO();
            participacaoDAO.insertParticipacao(p1);
            participacaoDAO.insertParticipacao(p2);
            participacaoDAO.insertParticipacao(p3);

            List<ParticipacaoCampeonato> todasParticipacoes = participacaoDAO.selectParticipacoes();

            System.out.println("Informações dos Times:");
            time1.exibirInfo(todasParticipacoes);
            System.out.println();
            time2.exibirInfo(todasParticipacoes);
            System.out.println();
            time3.exibirInfo(todasParticipacoes);
            System.out.println();

            System.out.println("Informações dos Campeonatos:");
            camp1.exibirInfo();
            camp2.exibirInfo();

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}