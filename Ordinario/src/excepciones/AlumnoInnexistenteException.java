/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;
/**
 *
 * @author JOHDLS
 */
public class AlumnoInnexistenteException extends Exception{
    public AlumnoInnexistenteException() {
    }

    public AlumnoInnexistenteException(String message) {
        super(message);
    }
}
