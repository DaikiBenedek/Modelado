public class SpootifyNormal implements Paquetes{

    @Override
    public boolean pagar(int dinero, Cliente o){
        o.update("Pagaste Spootify Base y te quedan: $" + dinero);
        return true;
    }
}
