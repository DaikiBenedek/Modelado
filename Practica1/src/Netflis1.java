public class Netflis1 implements Paquetes{

    @Override
    public boolean pagar(int dinero,String nombre, Cliente o){
        if(dinero >= 7){
            dinero -= 7;
            o.update("Pagaste Netflis para un dispositivo y te quedan: $" + dinero);
            o.setDinero(dinero);
            return true;
        }else{
            return false;
        }
    }
}
