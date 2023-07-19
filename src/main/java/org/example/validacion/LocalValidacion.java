package org.example.validacion;

import org.example.utilidades.Util;

public class LocalValidacion {

    protected Util util = new Util();

    public LocalValidacion (){}



// Validadcion de atributo nit de de la clase local //

    public Boolean validarDigitos (String nit ) throws  Exception{

        String expresionRegular = "^-?\\d+$";
        if (!util.buscarCoincidencia(expresionRegular, nit)){
            throw new Exception("Señor Usuario solo se permiten numero enteros en este campo");
        } else if (nit.length() < 10 ) {
            throw new Exception("El numero de nit debe ser mayor a diez digitos");
        }

        return true;
    }



    // Validacion del atributo NombreEmpresa de la clase loca //


    public Boolean validarNombreEmpresa ( String nombre)throws  Exception {

        String expresionRegular = "^[a-zA-ZñÑ ]+$";
        if (!util.buscarCoincidencia(expresionRegular, nombre)) {
            throw new Exception("Señor Usuario su nombre solo puede tener letras");
        } else if (nombre.length() > 30 ){

            throw new Exception("Señor Usuario el nomobre de la empresa no puede sobrepasar los 30 caracteres");

        }
        else
        {
            return true;
        }
    }
}