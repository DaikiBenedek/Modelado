public class Cliente implements Observer{

    private String Nombre;
    private int dinero;
    private String Notificacion;

    public Paquetes paqSpootify;
    public Paquetes paqHammazon;
    public Paquetes paqNetflis;
    public Paquetes paqTwitsh;
    public Paquetes paqYutube;

    /**
    *Constructor de cliente
    *@param
    */
    Cliente(String Nombre, int dinero){
        this.Nombre = Nombre;
        this.dinero = dinero;
    }

    /**
    *Devuelve la variable Nombre del Objeto
    *@return Nombre del Objeto
    */
    String GetNombre(){
        return Nombre;
    }

    /**
    *Devuelve la variable dinero del objeto
    *@return dinero del Objeto
    */
    int GetDinero(){
        return dinero;
    }

    /**
    *Modifica la varible dinero del objeto
    *@param monto int que se le asignara a dinero
    */
    void setDinero(int monto){
        this.dinero = monto;
    }

    @Override
    public void Suscribirse(Subject o){
        o.AgregarSuscriptor(this);
    }

    @Override
    public void AnularSuscripcion(Subject o){
        o.QuitarSuscriptor(this);
    }

    @Override
    public void update(String mensaje){
        Notificacion = mensaje;
        System.out.println(GetNombre() + ", " + Notificacion);
    }

//Setters de paquetes

    /**
    *Metodo que asigna un paquete a paqSpootify
    *@param paquete Objeto Paquete que se asignara
    */
    public void setPaqSpootify(Paquetes paquete){
        this.paqSpootify = paquete;
    }

    /**
    *Metodo que asigna un paquete a paqNetflis
    *@param paquete Objeto Paquete que se asignara
    */
    public void setPaqNetflis(Paquetes paquete){
        this.paqNetflis = paquete;
    }

    /**
    *Metodo que asigna un paquete a paqHammazon
    *@param paquete Objeto Paquete que se asignara
    */
    public void setPaqHammazon(Paquetes paquete){
        this.paqHammazon = paquete;
    }

    /**
    *Metodo que asigna un paquete a paqYutube
    *@param paquete Objeto Paquete que se asignara
    */
    public void setPaqYutube(Paquetes paquete){
        this.paqYutube = paquete;
    }

    /**
    *Metodo que asigna un paquete a paqTwitsh
    *@param paquete Objeto Paquete que se asignara
    */
    public void setPaqTwitsh(Paquetes paquete){
        this.paqTwitsh = paquete;
    }
//Pagar paquetes

    /**
    *Metodo que ejecuta el metodo pagar de paqSpootify
    *@return regresa true si se realizo el pago correctamente y
    * se regresa false si el cliente no tiene dinero suficiente
    */
    public boolean PagarSpootify(){
        return paqSpootify.pagar(dinero,this);
    }

    /**
    *Metodo que ejecuta el metodo pagar de paqHammazon
    *@return regresa true si se realizo el pago correctamente y
    * se regresa false si el cliente no tiene dinero suficiente
    */
    public boolean PagarHammazon(){
        return paqHammazon.pagar(dinero, this);
    }

    /**
    *Metodo que ejecuta el metodo pagar de paqNetflis
    *@return regresa true si se realizo el pago correctamente y
    * se regresa false si el cliente no tiene dinero suficiente
    */
    public boolean PagarNetflis(){
        return paqNetflis.pagar(dinero, this);
    }

    /**
    *Metodo que ejecuta el metodo pagar de paqTwitsh
    *@return regresa true si se realizo el pago correctamente y
    * se regresa false si el cliente no tiene dinero suficiente
    */
    public boolean PagarTwitsh(){
        return paqTwitsh.pagar(dinero, this);
    }

    /**
    *Metodo que ejecuta el metodo pagar de paqYutube
    *@return regresa true si se realizo el pago correctamente y
    * se regresa false si el cliente no tiene dinero suficiente
    */
    public boolean PagarYutube(){
        return paqYutube.pagar(dinero, this);
    }
}
