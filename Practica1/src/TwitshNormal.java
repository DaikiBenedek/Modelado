public class TwitshNormal implements Paquetes{

    @Override
    public boolean pagar(int dinero, Cliente o){
        if(dinero >= 6){
            dinero -= 6;
            o.update("Pagaste Twitsh Base y te quedan: $" + dinero);
            o.setDinero(dinero);
            return true;
        }else{
            return false;
        }
    }
}
