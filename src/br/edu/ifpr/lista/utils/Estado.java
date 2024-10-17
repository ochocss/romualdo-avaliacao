package br.edu.ifpr.lista.utils;

public enum Estado {
	DF(1), GO(1), MS(1), MT(1), TO(1),
    AC(2), AM(2), AP(2), PA(2), RO(2), RR(2),
    CE(3), MA(3), PI(3), 
    AL(4), PB(4), PE(4), RN(4),
    BA(5), SE(5),
    MG(6),
    ES(7), RJ(7),
    SP(8),
    PR(9), SC(9),
    RS(0);
	
    private final int numero;

    Estado(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
