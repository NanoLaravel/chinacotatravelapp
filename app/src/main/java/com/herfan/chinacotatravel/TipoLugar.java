package com.herfan.chinacotatravel;

public enum TipoLugar {
    //espacio de objetos

    OTROS( "otros", 5),
    RESTAURANTE("Restaurante", 2),
    BAR("Bar", 6),
    COPAS("Copas", 0),
    ESPECTACULO("espectaculo", 0),
    HOTEL("Hotel", 0),
    COMPRAS("Compras", 0),
    EDUCACION("educacion", 0),
    DEPORTE("deporte", 0),
    NATURALEZA("Naturaleza", 0),
    GASOLINERA("Gasolinera", 0);

    private final String texto; //atributos
    private final int recurso;

    //constructor
    TipoLugar(String texto, int recurso) {
        this.texto = texto;
        this.recurso = recurso;
    }

    public String getTexto() {
        return texto;
    }

    public int getRecurso() {
        return recurso;
    }
}
