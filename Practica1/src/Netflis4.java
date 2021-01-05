public class Netflis4 implements Paquetes{

    @Override
    public boolean pagar(int dinero, Cliente o){
        if(dinero >= 15){
            dinero -= 15;
            o.update("Pagaste Netflis para 4 dispositivos y te quedan: $" + dinero);
            o.setDinero(dinero);
            return true;
        }else{
            return false;
        }
    }
}
