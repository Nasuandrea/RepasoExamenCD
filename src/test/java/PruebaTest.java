import edu.gorillas.Prueba;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaTest {
    @BeforeEach //Alt+Ins SetUp method -> crea el Before, aqui se mete la creacion del objeto que vamos a testear
    void setUp() {
        Prueba prueba1 = new Prueba();
    }


    @Test //Alt+Ins - Test Metod -> crea test
    void suma() {
        Prueba prueba1 = new Prueba();
        int resultado = prueba1.suma(2,3);
     assertEquals(5, resultado);

    }

}
