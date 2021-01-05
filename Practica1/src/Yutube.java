import java.util.ArrayList;
import java.util.Random;

public class Yutube implements Subject{

    private ArrayList<Cliente> Observers;
    private ArrayList<Cliente> ViejosSuscriptores = new ArrayList();

    private String[] contenido = {"KSI", "w2mCrew", "David Dobrik", "Luisitorey", "El fedelobo", "levelup", "Vsauce", "La Capital",
    "MrBeast", "Auronplay", "DrossRotzank", "Prankeady", "smosh", "PewDiePie", "Dude Perfect"};

    /**
    *Constructor de Yutube
    */
    public Yutube(){
        Observers = new ArrayList();
    }

    @Override
    public void AgregarSuscriptor(Cliente o){
        Observers.add(o);
        if(ViejosSuscriptores.contains(o) == true){
            o.update("Bienvenid@ de vuelta a Yutube :D");
        }
        else{
            o.update("Bienvenid@ a Yutube :D");
        }
    }

    @Override
    public void QuitarSuscriptor(Cliente o){
        if(Observers.remove(o)){
            o.update("Lamentamos que dejes el servicio de Yutube");
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
            if(!o.PagarYutube()){
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
        cliente.update("El dia de hoy te recomendamos que veas a  " + contenido[indiceAleatorio] + " en Yutube\n");
    }
}
