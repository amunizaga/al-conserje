package cl.ucn.twa.amunizaga.alconserje;

import cl.ucn.twa.amunizaga.alconserje.model.Persona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USUARIO on 17/04/15.
 */
public class Controlador {
    /**
     * Base de datos SIMULADA!!!
     */
    private static final List<Persona> PERSONAS = new ArrayList<>();

    /**
     * Inicializacion de la base de datos (Se ejecuta una sola vez)
     */
    static{
        Persona p = new Persona(
                "17656660-4",
                "Alejandro",
                "Munizaga",
                "Valenzuela",
                "amunizaga016@gmail.com",
                "2222");
        PERSONAS.add(p);
    }
    /**
     * Busca una persona en la base de datos del sistema
     *
     * @param user
     * @return the Persona.
     */
    public static Persona getPersonaRut(String user) {
        //Busqueda de personas
        for(Persona p : PERSONAS){
            //Si encontro a la Persona
            if(p.getRut().equals(user))
                return p;
        }
        return null;
    }
}

