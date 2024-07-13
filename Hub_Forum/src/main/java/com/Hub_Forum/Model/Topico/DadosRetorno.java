package com.Hub_Forum.Model.Topico;

import java.time.LocalDateTime;

import com.Hub_Forum.Model.Curso;

public record DadosRetorno(Long id, String titulo, Curso curso, String mensagem, String nome, LocalDateTime horario) {
    public DadosRetorno(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getCurso(), topico.getMensagem(), topico.getUsuario().getNome(), topico.getHorario());
    }
}
