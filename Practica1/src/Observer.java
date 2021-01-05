public interface Observer{

    /**
    *Metodo que Suscribe a un objeto tipo Observer a un
    *objeto tipo subject
    *@param o Objeto tipo Subject al que se suscribira
    */
    public void Suscribirse(Subject o);

    /**
    *Metodo que Elimina la suscripcion que se tiene a un Subject
    @param o Objeto Subject del que se va a Anular la suscripcion
    */
    public void AnularSuscripcion(Subject o);

    /**
    *Metodo que imprimira un mensaje en el Observer
    *@param mensaje String que se imprimira como parte del mensaje
    */
    public void update(String mensaje);


}
