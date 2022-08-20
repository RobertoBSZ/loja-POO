
import java.util.Date;
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
public class ClassPrincipal {
    public static void main(String[] args) {
        int i = 0;
        float SOMA = 0;
        
        Loja l01 = new Loja ();
        Scanner teclado = new Scanner (System.in);
        Funcionario f01 = new Funcionario("Juninho", 2021);
        
        
        Date d01 = new Date();
        Pedido p01 = new Pedido(0,0);
        p01.setDataEmissao(d01); 
        
        System.out.println("Nome do Funcionario: "+ f01.getNome());
        System.out.println("Matricula do Funcionario: " + f01.getMatricula());
        System.out.println("==============================");           
        l01.inserirPedido(p01);
        System.out.println("Quantos produtos você deseja:");
        int seusPro = teclado.nextInt();            
        while(i < seusPro){
            System.out.println("==========================");
            l01.menu();
            System.out.println("ID do " + (i+1) + "º Pedido:" );
            int idPedido = teclado.nextInt();
            
                
            System.out.println("Preco do lanche:");
            float precoDoPedido = teclado.nextFloat();                           
            
                
                
            System.out.println("O seu pedido foi efetuado em : " + p01.getDataEmissao());  
            i++;
            l01.listaPedidos.add(new Pedido(idPedido, precoDoPedido));
            }    
        System.out.println("==============================");
        System.out.println("A lista de seus pedidos:");
        for( i = 1; i < l01.listaPedidos.size(); i++) {
            Pedido cc = (Pedido) l01.listaPedidos.get(i);            
            System.out.println("Produto ID: " + cc.getPedidold() + "|" + "Preco: R$ " + cc.getValorTotalCalculado()+ "|" + i + "º Pedido");
            SOMA += cc.getValorTotalCalculado();
        }
        System.out.println("==============================");
        System.out.println("Buscar pedido com o seu número:");
        int busqPedi = teclado.nextInt();
        for( i = 1; i < l01.listaPedidos.size(); i++) {
            if(busqPedi == i){
                Pedido bb = (Pedido) l01.listaPedidos.get(i);
                System.out.println("Produto ID: " + bb.getPedidold() + "|" + "Preco: R$ " + bb.getValorTotalCalculado() + "|" + i + "º Pedido");
            }
        }
        System.out.println("==============================");
        
        System.out.println("Sua dívida é de R$ " + SOMA);
        
        System.out.println("==============================");
        
        System.out.println("Remova seu pedido com o seu número :");
        int removerNome = teclado.nextInt();
        System.out.println("Pedido " + removerNome + "º excluido");
        for( i = 1; i < l01.listaPedidos.size(); i++) {
            if(removerNome == i){
                Pedido rr = (Pedido) l01.listaPedidos.remove(i);
                SOMA -= rr.getValorTotalCalculado();
            }
            
        }
        System.out.println("===========");
        
        System.out.println("Sua dívida é de R$ " + SOMA);
        
        
        
        
        
        
        
        
        
        
        
        /*int MeuPedido = teclado.nextInt();
        l01.buscarPedido(MeuPedido);
        
        if (MeuPedido == idPedido){
            System.out.println("Seu pedido foi encontrado!");
            System.out.println(p01.getPedidold());
        }
        else
            System.out.println("Pedido não encontrado");
        
        /*
        l01.setFuncionarioAGR(f01);
        l01.setPedidoAGR(p01);
        System.out.println(l01.getFuncionarioAGR().getNome());
        System.out.println(l01.getFuncionarioAGR().getCpf());
        System.out.println(l01.getPedidoAGR().getPedidold());
        System.out.println(l01.getPedidoAGR().getDataEmissao());
        p01.dividaatual(2);
        System.out.println("Sua dívida total é: " + l01.getPedidoAGR().getValorTotalCalculado() + "$");
        p01.dividaatual(30);
        System.out.println("Sua dívida total é: " + l01.getPedidoAGR().getValorTotalCalculado() + "$");
        
        Pedido p02 = new Pedido();
        Date d02 = new Date();
        p02.setPedidold(2);
        p02.setDataEmissao(d02);
        p02.setValorTotalCalculado(0);
        
        l02.setFuncionarioAGR(f02);
        l02.setPedidoAGR(p02);
        System.out.println(l02.getFuncionarioAGR().getNome());
        System.out.println(l02.getFuncionarioAGR().getCpf());
        System.out.println(l02.getPedidoAGR().getPedidold());
        System.out.println(l02.getPedidoAGR().getDataEmissao());
        p02.dividaatual(40);
        p02.dividaatual(34);
        System.out.println("Sua dívida total é: " + l02.getPedidoAGR().getValorTotalCalculado() + "$");*/
        
        
    }
}
