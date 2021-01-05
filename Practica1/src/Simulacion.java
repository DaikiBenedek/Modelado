import java.util.ArrayList;

public class Simulacion{

    public static void main(String[] args){
        ArrayList<Subject> servicios = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();

        Spootify spootify = new Spootify(); servicios.add(spootify);
        Netflis netflis = new Netflis(); servicios.add(netflis);
        Twitsh twitsh = new Twitsh(); servicios.add(twitsh);
        Hammazon hammazon = new Hammazon(); servicios.add(hammazon);
        Yutube yutube = new Yutube(); servicios.add(yutube);

        Cliente alicia = new Cliente("Alicia", 500); clientes.add(alicia);
        Cliente bob = new Cliente("Bob", 70); clientes.add(bob);
        Cliente cesar = new Cliente("Cesar", 40); clientes.add(cesar);
        Cliente diego = new Cliente("Diego", 200); clientes.add(diego);
        Cliente erika = new Cliente("Erika", 220); clientes.add(erika);

        System.out.println("Día 0\n");
        imprimirDinero(clientes);

        System.out.println("Día 1\n");

        alicia.Suscribirse(spootify);
        alicia.paqSpootify = new SpootifyPrem();
        alicia.Suscribirse(netflis);
        alicia.paqNetflis = new Netflis4();
        alicia.Suscribirse(twitsh);
        alicia.paqTwitsh = new TwitshPrem();
        alicia.Suscribirse(hammazon);
        alicia.paqHammazon = new HammazonPrem();
        alicia.Suscribirse(yutube);
        alicia.paqYutube = new YutubePrem();

        bob.Suscribirse(spootify);
        bob.paqSpootify = new SpootifyPrem();
        bob.Suscribirse(netflis);
        bob.paqNetflis = new Netflis4();
        bob.Suscribirse(twitsh);
        bob.paqTwitsh = new TwitshPrem();
        bob.Suscribirse(hammazon);
        bob.paqHammazon = new HammazonPrem();
        bob.Suscribirse(yutube);
        bob.paqYutube = new YutubePrem();

        cesar.Suscribirse(spootify);
        cesar.paqSpootify = new SpootifyPrem();
        cesar.Suscribirse(yutube);
        cesar.paqYutube = new YutubeNormal();

        diego.Suscribirse(netflis);
        diego.paqNetflis = new Netflis2();
        diego.Suscribirse(hammazon);
        diego.paqHammazon = new HammazonPrem();

        erika.Suscribirse(spootify);
        erika.paqSpootify = new SpootifyNormal();
        erika.Suscribirse(netflis);
        erika.paqNetflis = new Netflis4();
        erika.Suscribirse(twitsh);
        erika.paqTwitsh = new TwitshNormal();
        erika.Suscribirse(yutube);
        erika.paqYutube = new YutubeNormal();

        System.out.println("\nDía 2\n");

        imprimirDinero(clientes);

        diego.Suscribirse(twitsh);
        diego.paqTwitsh = new TwitshNormal();

        erika.paqYutube = new YutubePrem();
        erika.paqSpootify = new SpootifyPrem();

        serviciosCobrar(servicios);

        System.out.println("\nDía 3\n");

        imprimirDinero(clientes);

        diego.paqSpootify = new SpootifyNormal();
        diego.Suscribirse(spootify);
        diego.AnularSuscripcion(netflis);

        erika.AnularSuscripcion(netflis);
        erika.Suscribirse(hammazon);
        erika.paqHammazon = new HammazonPrem();
        erika.paqTwitsh = new TwitshPrem();

        serviciosCobrar(servicios);

        System.out.println("\nDía 4\n");

        imprimirDinero(clientes);

        diego.Suscribirse(netflis);
        diego.paqNetflis = new Netflis4();

        serviciosCobrar(servicios);

        System.out.println("\nDia 5\n");

        imprimirDinero(clientes);
        serviciosCobrar(servicios);

        System.out.println("Al final de la Simulacion:");

        imprimirDinero(clientes);
    }


    /**
    *Metodo que llama a la funcion CobrarSuscriptores de los servicios de un arreglo
    *@param servicios Servicios de los que se va a cobrar a sus suscriptores
    */
    static private void serviciosCobrar(ArrayList<Subject> servicios){
        for(Subject servicio: servicios){
            servicio.CobrarSuscriptores();
        }
    }

    /**
    *Metodo que imprime el atributo dinero de todos los clientes en el arreglo
    *@param clientes Se imprimira el dinero de los clientes en este arreglo
    */
    static private void imprimirDinero(ArrayList<Cliente> clientes){
        for(Cliente cliente: clientes){
            System.out.println(cliente.GetNombre() + ", tiene: $" + cliente.GetDinero());
        }
        System.out.println("\n");
    }

}
