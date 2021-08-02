
/**
* @author javiluli (github)
*/

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * The Class CalculadoraTest.
 */
@RunWith(value = Parameterized.class)
public class CalculadoraTest {

  static Calculadora c;

  private int n, m, res;

  /**
   * getData. Permite iterar varias veces un test con diferentes valores,m los 2
   * primeros varores sera los que se utiliza para el calculo y el tercer valor el
   * resultado de los dos anteriores.
   *
   * @return un objeto
   */
  // ================================================
  @Parameters
  public static Iterable<Object[]> getData() {
    List<Object[]> obj = new ArrayList<>();
    obj.add(new Object[] { 2, 4, 8 });
    obj.add(new Object[] { -3, 2, -6 });
    obj.add(new Object[] { 2, 0, 0 });
    return obj;
  }

  /**
   * Instancia de una nueva calculadora test.
   *
   * @param n   es un numero.
   * @param m   es un numero.
   * @param res el resultado.
   */
  public CalculadoraTest(int n, int m, int res) {
    this.n = n;
    this.m = m;
    this.res = res;
  }

  /**
   * testMult. Comprueba que la multiplicacion este bien codificada. Este test
   * utiliza el Iterable para realizar varias pruebas, tantas como objetos se
   * agregen al Iterable.
   */
  @Test
  public void testMult() {
    int resul = c.mult(n, m);
    assertEquals(res, resul);
  }
  // ================================================

  /**
   * beforeClass. Se ejecuta una unica vez al principio de todo
   */
  @BeforeClass
  public static void beforeClass() {
    System.out.println("beforeClass()");
    c = new Calculadora();
  }

  /**
   * before. Se ejecurta antes de cada metodo.
   */
  @Before
  public void before() {
    System.out.println("before()");
    c.clear();
  }

  /**
   * after. Se ejecurta despues de cada metodo.
   */
  @After
  public void after() {
    System.out.println("after()");
    c.clear();
  }

  /**
   * afterClass. Se ejecuta una unica vez al final de todo
   */
  @AfterClass
  public static void afterClass() {
    System.out.println("afterClass()");
  }

  /**
   * testAdd. Comprueba que la suma este bien codificada.
   */
  @Test
  public void testAdd() {
    System.out.println("testAdd()");
    int resul = c.add(3, 2);
    int esper = 5;
    assertEquals(esper, resul);
  }

  /**
   * testSub. Comprueba que la resta esta bien condificada.
   */
  @Test
  public void testSub() {
    System.out.println("testSub()");
    int resul = c.sub(3, 2);
    int esper = 1;
    assertEquals(esper, resul);
  }

  /**
   * testDiv.
   */
  @Test
  public void testDiv() {
    System.out.println("testDiv()");
    c.div(5, 2);
  }

  /**
   * testDivPorCero. Permite capturas excepciones como la creada al dividir por 0.
   */
  @Test(expected = ArithmeticException.class)
  public void testDivPorCero() {
    System.out.println("testDivPorCero() - Exception");
    c.div(5, 0);
  }

  /**
   * Test algoritmo optimo. Puede ayudar a la hora de controlar bucles infinitos o
   * metodos que tardan demasiado en realizar su funcion.
   */
//  @Test(timeout = 100)
//  public void testAlgoritmoOptimo() {
//    System.out.println("testAlgoritmoOptimo()");
//    c.operacionOptima();
//  }

}
