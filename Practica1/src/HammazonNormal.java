public class HammazonNormal implements Paquetes{

    @Override
    public boolean pagar(int dinero, Cliente o){
        if(dinero >= 7){
            dinero -= 7;
            o.update("Pagaste Hammazon Base y te quedan: $" + dinero);
            o.setDinero(dinero);
            return true;
        }else{
            return false;
        }
    }
}
