public class YutubePrem implements Paquetes{

    @Override
    public boolean pagar(int dinero, Cliente o){
        if(dinero >= 6){
            dinero -= 6;
            o.update("Pagaste Yutube Premium y te quedan: $" + dinero);
            o.setDinero(dinero);
            return true;
        }else{
            return false;
        }
    }
}
