package DAO;

import domain.TipoDestino;

public class TipoDestinoDao extends DAO <TipoDestino> {
    @Override
    protected String getSqlString() {
        return "select p from TipoDestino p";
    }

    @Override
    protected Class getClassName() {
        return TipoDestino.class;
    }
}
