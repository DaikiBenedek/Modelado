public class SpootifyPrem implements Paquetes{

    @Override
    public boolean pagar(int dinero, Cliente o){
        if(dinero >= 4){
            dinero -= 4;
            o.update("Pagaste Spootify Premium y te quedan: $" + dinero);
            o.setDinero(dinero);
            return true;
        }else{
            return false;
        }
    }
}
