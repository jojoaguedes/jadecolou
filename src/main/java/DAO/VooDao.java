package DAO;

import domain.Voo;

public class VooDao extends DAO <Voo> {
    @Override
    protected String getSqlString() {
        return "select v from Voo v";
    }

    @Override
    protected Class getClassName() {
        return Voo.class;
    }
}
