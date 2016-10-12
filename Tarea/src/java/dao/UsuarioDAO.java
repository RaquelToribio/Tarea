/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Usuario;
import dto.Usuario;
import ibatis.Bd;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class UsuarioDAO {

    public static void main(String[] args) throws SQLException {

        Usuario usuario = new Usuario("", "kike", "1234");
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        usuario = usuarioDAO.validarUsuario(usuario);
    }

    public ArrayList<Usuario> listar() throws SQLException {

        ArrayList<Usuario> listaUsuario
                = (ArrayList<Usuario>) Bd.conectar().queryForList("listarUsuarios");

        return listaUsuario;

    }

    public void agregar(Usuario usuario) throws SQLException {
        Bd.conectar().insert("insertUsuario", usuario);
    }

    public void editar(Usuario usuario) throws SQLException {
        Bd.conectar().update("updateUsuario", usuario);
    }

    public Usuario datosUsuario(Usuario usuario) throws SQLException {
        usuario = (Usuario) Bd.conectar().queryForObject("datosUsuario", usuario);
        return usuario;
    }

    public Usuario datosUsuarioxDni(Usuario usuario) throws SQLException {
        usuario = (Usuario) Bd.conectar().queryForObject("datosUsuarioxDni", usuario);
        return usuario;
    }

    public Usuario validarUsuario(Usuario usuario) throws SQLException {

        usuario = (Usuario) Bd.conectar().queryForObject("validarUsuario", usuario);
        return usuario;

    }

}
