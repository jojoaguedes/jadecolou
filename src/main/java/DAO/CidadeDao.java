package DAO;

import domain.Cidade;

public class CidadeDao extends DAO <Cidade> {
    @Override
    protected String getSqlString() {
        return "select c from Cidade c";
    }

    @Override
    protected Class getClassName() {
        return Cidade.class;
    }
}
