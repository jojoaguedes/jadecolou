package DAO;

import domain.Pagamento;

public class PagamentoDao extends DAO <Pagamento> {
    @Override
    protected String getSqlString() {
        return "select p from Pagamento p";
    }

    @Override
    protected Class getClassName() {
        return Pagamento.class;
    }
}
