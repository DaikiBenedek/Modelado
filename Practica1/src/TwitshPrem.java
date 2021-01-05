public class TwitshPrem implements Paquetes{

    @Override
    public boolean pagar(int dinero, Cliente o){
        if(dinero >= 10){
            dinero -= 10;
            o.update("Pagaste Twitsh Premium y te quedan: $" + dinero);
            o.setDinero(dinero);
            return true;
        }else{
            return false;
        }
    }
}
