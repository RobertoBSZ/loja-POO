/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Rober
 */
public class Funcionario {
    private String nome;
    private int matricula;
    Scanner teclado = new Scanner (System.in);

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
         
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
