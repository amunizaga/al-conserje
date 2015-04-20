package cl.ucn.twa.amunizaga.alconserje.model;

/**
 * Created by USUARIO on 17/04/15.
 */
public class Persona {
    /**
     * Rut de una persona
     */
    private String rut;
    /**
     * Nombre de una persona
     */
    private String nombre;
    /**
     * Password de la persona
     */
    private String password;
    /**
     * Apellido paterno de una persona
     */
    private String apellidoPaterno;
    /**
     * Apellido materno de una persona
     */
    private String apellidoMaterno;
    /**
     * Correo electronico de una persona
     */
    private String correoElectronico;


    /**
     * M�todo que devuelve el rut de una persona
     *
     * @return el rut de una persona
     */
    public String getRut() {
        return rut;
    }

    /**
     * M�todo que devuelve el nombre de una persona
     *
     * @return el nombre de una persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * M�todo que devuelve el apellido paterno de una persona
     *
     * @return el apellido paterno de una persona
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * M�todo que devuelve el apellido materno de una persona
     *
     * @return el apellido materno de una persona
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * M�todo que devuelve el password de una persona
     *
     * @return el password de una persona
     */
    public String getPassword() {
        return password;
    }

    /**
     * M�todo que devuelve el correo electronico de una persona
     *
     * @return el correo electronico de una persona
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Constructor con 5 parametros
     *
     * @param rut_               Rut de la persona
     * @param nombre_            Nombre de la persona
     * @param apellidoPaterno_   Apellido paterno de la persona
     * @param apellidoMaterno_   Apellido materno de la persona
     * @param correoElectronico_ Correo electronico de la persona
     * @param password_          password de la persona
     */
    public Persona(String rut_, String nombre_, String apellidoPaterno_, String apellidoMaterno_, String correoElectronico_, String password_) {
        rut = rut_;
        nombre = nombre_;
        apellidoPaterno = apellidoPaterno_;
        apellidoMaterno = apellidoMaterno_;
        correoElectronico = correoElectronico_;
        password = password_;
    }

}
