
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rober
 */
public class Pedido {
    private int pedidold;
    private Date dataEmissao;
    private float valorTotalCalculado;

    public Pedido(int pedidold, float valorTotalCalculado) {
        this.pedidold = pedidold;
        this.valorTotalCalculado = valorTotalCalculado;
    }

    
    
    
    public int getPedidold() {
        return pedidold;
    }

    public void setPedidold(int pedidold) {
        this.pedidold = pedidold;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public float getValorTotalCalculado() {
        return valorTotalCalculado;
    }

    public void setValorTotalCalculado(float valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
    }
    
    
}
