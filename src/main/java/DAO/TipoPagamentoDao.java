package DAO;

import domain.TipoPagamento;

public class TipoPagamentoDao extends DAO <TipoPagamento> {
    @Override
    protected String getSqlString() {
        return "select p from TipoPagamento p";
    }

    @Override
    protected Class getClassName() {
        return TipoPagamento.class;
    }
}
