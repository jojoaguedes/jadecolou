package DAO;

import domain.Pessoa;

public class PessoaDao extends DAO <Pessoa> {
    @Override
    protected String getSqlString() {
        return "select p from Pessoa p";
    }

    @Override
    protected Class getClassName() {
        return Pessoa.class;
    }
}
