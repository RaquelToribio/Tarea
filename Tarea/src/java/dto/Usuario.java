/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author usuario
 */
public class Usuario {
    private String codi_usua="";
    private String logi_usua="";
    private String pass_usua="";

    public Usuario() {
    }

    public Usuario(String codi_usua, String logi_usua, String pass_usua) {
        this.codi_usua = codi_usua;
        this.logi_usua = logi_usua;
        this.pass_usua = pass_usua;
    }

    public String getCodi_usua() {
        return codi_usua;
    }

    public String getLogi_usua() {
        return logi_usua;
    }

    public String getPass_usua() {
        return pass_usua;
    }

    public void setCodi_usua(String codi_usua) {
        this.codi_usua = codi_usua;
    }

    public void setLogi_usua(String logi_usua) {
        this.logi_usua = logi_usua;
    }

    public void setPass_usua(String pass_usua) {
        this.pass_usua = pass_usua;
    }
    
}
