/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.DAO;

import Model.Cliente;

/**
 *
 * @author Convidado
 */
public class DAOCliente extends GenericDAO<Cliente>{
    public DAOCliente() {
        super(Cliente.class);
    }
}
