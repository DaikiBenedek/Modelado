import java.util.ArrayList;
import java.util.Random;

public class Spootify implements Subject{

    private ArrayList<Cliente> Observers;
    private ArrayList<Cliente> ViejosSuscriptores = new ArrayList();

    private String[] contenido = {"The Beatles", "Lil Peep", "The Joe Rogan Experience", "Aries", "Illenium", "Marshmello",
    "Deorro", "Borgore", "Los Guayabers", "El grupo marrano", "Imagine Dragons"};

    /**
    *Constructor de Spootify
    */
    public Spootify(){
        Observers = new ArrayList();
    }

    public void AgregarSuscriptor(Cliente o){
        Observers.add(o);
        if(ViejosSuscriptores.contains(o) == true){
            o.update("Bienvenid@ de vuelta a Spotify :D");
        }
        else{
            o.update("Bienvenid@ a Spotify :D");
        }
    }

    public void QuitarSuscriptor(Cliente o){
        if(Observers.remove(o)){
            o.update("Lamentamos que dejes el servicio de Spootify :c");
            ViejosSuscriptores.add(o);
        }
    }

    public void CobrarSuscriptores(){
        ArrayList<Cliente> Copia = new ArrayList();
        for(Cliente o: Observers){
            Copia.add(o);
        }
        for(Cliente o: Copia){
            if(!o.PagarSpootify()){
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
        cliente.update("El dia de hoy te recomendamos que escuches a  " + contenido[indiceAleatorio] + " en Spotify\n");
    }
}
