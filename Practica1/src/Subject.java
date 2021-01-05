public interface Subject{

    /**
    *Metodo que agrega suscriptor al objeto tipo subject
    */
    public void AgregarSuscriptor(Cliente o);

    /**
    *Metodo que elimina un suscriptor del objeto tipo Subject
    *@param o Cliente que se va a eliminar
    */
    public void QuitarSuscriptor(Cliente o);

    /**
    *Metodo que cobra a los suscriptores del objeto tipo subject
    */
    public void CobrarSuscriptores();

    /**
    *Metodo que le recomienda algun contenido a un cliente
    *@param cliente Cliente que recibira la recomendacion
    */
    public void recomendar(Observer cliente);

}
