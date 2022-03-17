package videojuegos_1130am;

import entidades.Jugador;
import enumeradores.Sexo;
import implementaciones.DAOSFactory;
import interfaces.IJugadoresDAO;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
//        Sexo sexo = Sexo.MASCULINO;
//        
//        if(sexo == Sexo.MASCULINO){
//            
//        }
//        
//        Opciones a = Opciones.ABRIR;
//        
//        if(a == Opciones.CERRAR){
//            
//        }
        
        IJugadoresDAO jugadoresDAO = DAOSFactory.crearJugadoresDAO();
        Jugador jugador = new Jugador("Batman", "batman@gmail.com", new GregorianCalendar(), Sexo.MASCULINO);
        jugadoresDAO.agregar(jugador);
        
//        IJugadoresDAO jugadoresDAO = DAOSFactory.crearJugadoresDAO();
//        jugadoresDAO.agregar(new Jugador("Lois Lane", "lois.lane@gmail.com"));
//        List<Jugador> jugadores = jugadoresDAO.consultarTodos("lo");
//        jugadores.forEach(jugador -> {
//            System.out.println(jugador);
//        });
        
        List<Jugador> jugadores2 = jugadoresDAO.consultarTodos("a");
        jugadores2.forEach(jugador -> { System.out.println(jugador);
        });
        
//        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Videojuegos_1130amPU");
    
        // EM = BD PERO EN JAVA
//        EntityManager em = emFactory.createEntityManager();
//        
        // INICIO DE TRANSACCIÓN PARA ACTUALIZAR, INSERTAR O ELIMINAR DATOS
//        em.getTransaction().begin();
//        
//        Jugador jugador = em.find(Jugador.class, 1L);
//        Logro logro3 = em.find(Logro.class, 3L);
//        Logro logro4 = em.find(Logro.class, 4L);
//        
//        RelacionJugadorLogro relacion1 = new RelacionJugadorLogro(jugador, logro3);
//        RelacionJugadorLogro relacion2 = new RelacionJugadorLogro(jugador, logro4);
//        em.persist(relacion1);
//        em.persist(relacion2);



//        jugador.getLogros().add(new RelacionJugadorLogro(jugador, logro3));
//        jugador.getLogros().add(new RelacionJugadorLogro(jugador, logro4));
//        em.persist(jugador);

//    Videojuego videojuego = em.find(Videojuego.class, 2L);
//    Logro logro1 = new Logro("Best Lap", 60, videojuego);
//    Logro logro2 = new Logro("50  wins in a row", 100, videojuego);
//    //OPCION 1 GUARDAR LOS LOGROS DIRECTAMENTE
//    em.persist(logro1);
//    em.persist(logro2);
        
//        //OPCION 2 SETEAR LA LISTA AL VIDEOJUEGO
//        if(videojuego.getLogros() == null || videojuego.getLogros().isEmpty()){
//            videojuego.setLogros(Arrays.asList(logro1, logro2));
//        }else{ //OPCION 3 AGREGAR LOGORS A LA LISTA EXISTENTE
//            videojuego.getLogros().add(logro1);
//            videojuego.getLogros().add(logro2);
//        }
//        em.persist(videojuego);
//        Jugador jugador = em.find(Jugador.class, 1L);
//        if(jugador != null){
//            System.out.println(jugador);
//            for (Videojuego videojuego : jugador.getVideojuegos()){
//                System.out.println(videojuego);
//            }
//        }else{
//            System.out.println("El jugador no existe");
//        }

//        Jugador jugador = em.find(Jugador.class, 1L);
//        if(jugador != null){
//            Videojuego videojuego = new Videojuego("Gears of War", "Epic", jugador);
//            em.persist(videojuego);
//        }else{
//            System.out.println("El jugador no existe");
//        }


//        Jugador jugador = new Jugador("Mario", "mario.bros@gmail.com");
//        Videojuego videojuego1 = new Videojuego("Mario Kart", "Nintendo", jugador);
//        Videojuego videojuego2 = new Videojuego("Fortnite", "Epic", jugador);
//        jugador.setVideojuegos(Arrays.asList(videojuego1, videojuego2));
//        em.persist(jugador);
        
//        Jugador jugador = em.find(Jugador.class, 5L);
//        if(jugador != null){
//            em.remove(jugador);
//        }else{
//            System.out.println("El jugador no existe");
//        }
        
        // CIERRE DE TRANSACCIÓN = DONDE SE EJECUTAN LAS OPERACIONES EN BD REALMENTE
//        em.getTransaction().commit();
    }
    
}
