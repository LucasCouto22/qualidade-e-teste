package CarrinhoTeste;

import carrinho.Carrinho;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import produto.Produto;

public class CarrinhoTest {
    @Test
    public void VerificarValorTotal() {
	Carrinho car = new Carrinho();
        Produto jogo = new Produto("Fifa 2022",180);
        Produto videogame = new Produto("Playstation 5",2000);
        Produto controle = new Produto ("Controle Ps5",400);
        car.addItem(jogo);
        car.addItem(videogame);
        car.addItem(controle);
        double valor = car.getValorTotal(); 
        assertEquals(2580, valor);	
    }
    @Test
    public void VerificaPrecoDoProduto(){
        Carrinho car = new Carrinho();
        Produto controle = new Produto ("Controle Ps5",400);
        double valor = controle.getPreco();
        assertEquals(900,valor);
    }
    @Test
    public void VerificaNomeDoProduto(){
         Carrinho car = new Carrinho();
        Produto jogo = new Produto ("Jogo MarioCart",150);
        String nome = jogo.getNome();
        assertEquals("Jogo MarioCart",nome);
    }
}