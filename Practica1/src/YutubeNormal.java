public class YutubeNormal implements Paquetes{

    @Override
    public boolean pagar(int dinero, Cliente o){
        o.update("Tienes suscripcion de Yutube gratis");
        return true;
    }
}
