/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.util.ArrayList;
import model.ClienteModel;

/**
 *
 * @author anfeo
 */
public interface IClienteDAO {
    public ArrayList<ClienteModel> obtenerClientes();

    public ArrayList<ClienteModel> obtenerClientesPorTag(String tag);

    public ArrayList<ClienteModel> obtenerClientesPorCorreo(String correo);

    public void agregarCliente(ClienteModel cliente);

    public void actualizarCliente(ClienteModel cliente);

    public void eliminarClientePorTag(String tag);
}
