import edu.gorillas.Prueba;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaTest {
    private Prueba prueba1; //añadimos un objeto de la clase Prueba para usarlo en los metodos Test
    @BeforeEach //Alt+Ins SetUp method -> crea el Before, aqui se mete la creacion del objeto que vamos a testear
    public void setUp() {//ponemos public
      prueba1 = new Prueba();
    }


    @Test //Alt+Ins - Test Metod -> crea test
    public void suma() {//ponemos public
        int resultado = prueba1.suma(2,3);
     assertEquals(5, resultado);
     int resultado2 = prueba1.suma(-2,3);
     assertEquals(1, resultado2);
    }

    @Test
    public void resta() {
        int resultado= prueba1.resta(3,2);
        assertEquals(1, resultado);
    }

    @Test
    public void restaConNegativos() {
        int resultado= prueba1.resta(-3,-2);
        assertEquals(-1, resultado);
    }
}
