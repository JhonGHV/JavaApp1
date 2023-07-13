package org.example.validacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    public UsuarioValidacion() {
    }

    //Metodos ordinarios para validar datos
    public Boolean ValidarNombre(String nombres) throws Exception {

        String expresionRegular = "^[a-zA-Z]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher emparejador = patron.matcher(nombres);

        if (!emparejador.matches()) {
            throw new Exception("Señor Usuario su nombre solo puede tener letras");
        } else if (nombres.length() < 10) {
            throw new Exception("Señor Usuario revisa la cantidad de caracteres, debe ser mayor o igual a 10 caracteres");

        } else {
            return true;
        }
    }
}
