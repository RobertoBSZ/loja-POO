
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rober
 */
public class Loja {
    public Funcionario funcionarioAGR;
    //private List listaPedidos;
    Scanner teclado = new Scanner (System.in);
    List<Pedido> listaPedidos = new ArrayList<>();
    
    
    public void menu(){
        System.out.println("Produto ID: 40 ----> Pizza R$ 30.0");
        System.out.println("Produto ID: 30 ----> Hamburguer R$ 18.0");
        System.out.println("Produto ID: 49 ----> Suco R$ 6.0");
        System.out.println("Produto ID: 50 ----> MilkShake R$ 10.0");
    }
    public void inserirPedido(Pedido pedidoAGR){
        listaPedidos.add(pedidoAGR);
        
    }
    public void buscarPedido (int pedidoAGR){
        listaPedidos.get(pedidoAGR);
        
    }
    public void removerPedido(int pedidoRE){
        listaPedidos.remove(pedidoRE);
        
    }

    
    public Funcionario getFuncionarioAGR() {
        return funcionarioAGR;
    }

    public void setFuncionarioAGR(Funcionario funcionarioAGR) {
        this.funcionarioAGR = funcionarioAGR;
    }

}