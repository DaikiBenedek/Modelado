import java.util.ArrayList;
import java.util.Random;

public class Twitsh implements Subject{

    private ArrayList<Cliente> Observers;
    private ArrayList<Cliente> ViejosSuscriptores = new ArrayList();

    private String[] contenido = {"sinatraa","TenZ","JimRsNg","Disguised Toast","dogdog","ibai","itsHafu",
    "ApexPredatox","dapr","Subroza","xQcOW","Aztkk","Reptile","cTori"};

    /**
    *Constructor de Twitsh
    */
    public Twitsh(){
        Observers = new ArrayList();
    }

    @Override
    public void AgregarSuscriptor(Cliente o){
        Observers.add(o);
        if(ViejosSuscriptores.contains(o) == true){
            o.update("Bienvenid@ de vuelta a Hammazon :D");
        }
        else{
            o.update("Bienvenid@ a Hammazon :D");
        }
    }

    @Override
    public void QuitarSuscriptor(Cliente o){
        if(Observers.remove(o)){
            o.update("Lamentamos que dejes el servicio de Twitsh :c");
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
            if(!o.PagarTwitsh()){
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
        cliente.update("El dia de hoy te recomendamos que veas a " + contenido[indiceAleatorio] + " en Twitsh\n");
    }
}
