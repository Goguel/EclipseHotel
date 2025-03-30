package com.miguelx.eclipseHotel.model;

public enum Status {
    SCHEDULED ("S"), // Indica que o quarto selecionado está reservado para o período de check-in escolhido
    IN_USE ("I"), // Indica que o quarto está neste momento ocupado pela reserva realizada
    ABSENCE ("A"), // Indica que o responsável pela reserva não compareceu ao hotel para se hospedar. (Nesse cenário, este status é considerado como situação final da reserva e não deve ser atualizado para manter histórico)
    FINISHED ("F"), // Indica que a reserva foi concluída com sucesso e o cliente já deixou o hotel. (Nesse cenário, este status é considerado como situação final da reserva e não deve ser atualizado para manter histórico)
    CANCELED("C"); // Indica uma reserva cancelada antes de iniciar o check-in. (Nesse cenário, este status é considerado como situação final da reserva e não deve ser atualizado para manter histórico)

    private String codigo;

    private Status(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
