public interface Paquetes{

    /**
    *Metodo para pagar un servicio
    *@param dinero dinero del Cliente
    *@param o Cliente que pagara
    *@return regresara true si se realiza el pago correctamente y
    *regresara false si el dinero no es suficiente
    */
    public boolean pagar(int dinero,Cliente o);
}
