package DAO;

import domain.Estado;

public class EstadoDao extends DAO <Estado> {
    @Override
    protected String getSqlString() {
        return "select e from Estado e";
    }

    @Override
    protected Class getClassName() {
        return Estado.class;
    }
}
