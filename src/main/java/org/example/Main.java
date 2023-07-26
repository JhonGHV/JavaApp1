package org.example;

import org.example.modelos.Oferta;
import org.example.utilidades.Util;
import org.example.modelos.Usuario;
import java.util.Scanner;

public class Main {
    protected Util util = new Util();

    public static void main(String[] args) {


        Scanner teclado =  new  Scanner(System.in);

      System.out.println("*** Bienvenidos ***");
      System.out.println("1.: Recogiendo datos de usuario: ");
      System.out.println("Digita tus nombres y apellidos: ");

     Usuario usuario = new Usuario();

      usuario.setNombres(teclado.nextLine());
      System.out.println("Digita tu correo electronico");
      usuario.setCorreoElectronico(teclado.nextLine());
      System.out.println("....................");
      System.out.println(usuario);

        Oferta oferta = new Oferta();

        System.out.println("Digite la fecha de inicio");
        oferta.setFechaInicio(teclado.nextLine());

        System.out.println("Digite la fecha de fin");
        oferta.setFechaFin(teclado.nextLine());



    }
}