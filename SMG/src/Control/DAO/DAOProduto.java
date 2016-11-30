/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.DAO;

import Model.Produto;

/**
 *
 * @author Convidado
 */
public class DAOProduto extends GenericDAO<Produto>{
    public DAOProduto() {
        super(Produto.class);
    }
    
}
