public class HammazonPrem implements Paquetes{

    @Override
    public boolean pagar(int dinero, Cliente o){
        if(dinero >= 13){
            dinero -= 13;
            o.update("Pagaste Hammazon Premium y te quedan: $" + dinero);
            o.setDinero(dinero);
            return true;
        }else{
            return false;
        }
    }
}
