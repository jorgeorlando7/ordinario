/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import excepciones.AlumnoExistenteException;
import excepciones.AlumnoInnexistenteException;
import objects.Alumnos;

import java.util.ArrayList;
/**
 *
 * @author JOHDLS
 */
public class Controlador {
    private ArrayList<Alumnos> listaAlumnos;

    public Controlador() {

        listaAlumnos = new ArrayList<>();
    }

    public void addAlumno(Alumnos alumno) throws AlumnoExistenteException{
        if(listaAlumnos.contains(alumno)){
            throw new AlumnoExistenteException();
        }
        listaAlumnos.add(alumno);
    }

    public ArrayList<Alumnos> getListaAlumnos() {
        return listaAlumnos;
    }

    public Alumnos getAlumno(String matricula) throws AlumnoInnexistenteException{
        int index = listaAlumnos.indexOf(new Alumnos(matricula));
        if(index < 0){
            throw new AlumnoInnexistenteException();
        }
            return listaAlumnos.get(index);
    }

    public int getAlumnosCount(){
        return listaAlumnos.size();
    }

    public Alumnos getAlumno(int index){
        return listaAlumnos.get(index);
    }
}