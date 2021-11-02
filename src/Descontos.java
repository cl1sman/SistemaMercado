package SistemaMercado;

/**
 *
 * @author Cl1sman ¯_(ツ)_/¯
 */
public class Descontos {
    private float price;
    private float desconto;

    Descontos(){}

    Descontos(float price, float desconto){
        this.setPrice(price);
        this.setDesconto(desconto);
    }

    float desconto(){
        return (getPrice() - (getPrice() * (getDesconto() / 100)));
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    
}
