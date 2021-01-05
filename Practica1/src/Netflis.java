import java.util.ArrayList;
import java.util.Random;

public class Netflis implements Subject{

    private ArrayList<Cliente> Observers;
    private ArrayList<Cliente> ViejosSuscriptores = new ArrayList();

    private String[] contenido = {"Marriage Story", "Umbrella Academy", "Pulp Fiction", "You", "Narcos", "Django", "The Walking Dead", "Good Will Hunting", "Forest Gump",
    "Naruto Shippuden", "Modern Family", "Breaking Bad", "Spiderman 2", "Volver al futuro", "El padrino", "Death Note", "Lost", "Cobra Kai"};

    /**
    *Constructor de Netflis
    */
    public Netflis(){
        Observers = new ArrayList();
    }

    @Override
    public void AgregarSuscriptor(Cliente o){
        Observers.add(o);
        if(ViejosSuscriptores.contains(o) == true){
            o.update("Bienvenid@ de vuelta a Netflis :D");
        }
        else{
            o.update("Bienvenid@ a Netflis :D");
        }
    }

    @Override
    public void QuitarSuscriptor(Cliente o){
        if(Observers.remove(o)){
            o.update("Lamentamos que dejes el servicio de Netflis :c");
            ViejosSuscriptores.add(o);
        }

    }

    @Override
    public void CobrarSuscriptores(){
        ArrayList<Cliente> Copia = new ArrayList();
        for(Cliente o: Observers){
            Copia.add(o);
        }
        for(Cliente o: Copia){
            if(!o.PagarNetflis()){
                QuitarSuscriptor(o);
            }else{
                recomendar(o);
            }
        }
    }

    @Override
    public void recomendar(Observer cliente){
        Random rd = new Random();
        int indiceAleatorio = rd.nextInt(contenido.length-1);
        cliente.update("El dia de hoy te recomendamos que veas " + contenido[indiceAleatorio] + " en Netflis\n");
    }
}
