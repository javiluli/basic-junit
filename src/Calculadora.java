
/**
* @author javiluli (github)
*/

/**
 * The Class Calculadora.
 */
public class Calculadora {
  private int ans;

  /**
   * Instancia de una nueva calculadora.
   */
  public Calculadora() {
    ans = 0;
  }

  /**
   * Suma dos numeros.
   *
   * @param a the a
   * @param b the b
   * @return the int
   */
  public int add(int a, int b) {
    ans = a + b;
    return ans;
  }

  /**
   * Concatena la suma de un nuevo valor con el de una operacion anterior.
   *
   * @param v the v
   * @return the int
   */
  public int add(int v) {
    ans += v;
    return ans;
  }

  /**
   * Resta dos numeros.
   *
   * @param a the a
   * @param b the b
   * @return the int
   */
  public int sub(int a, int b) {
    ans = a - b;
    return ans;
  }

  /**
   * Concatena la resta de un nuevo valor con el de una operacion anterior.
   *
   * @param v the v
   * @return the int
   */
  public int sub(int v) {
    ans -= v;
    return ans;
  }

  /**
   * Devulve el valor ans.
   *
   * @return the int
   */
  public int ans() {
    return ans;
  }

  /**
   * Multiplica dos numeros.
   *
   * @param a the a
   * @param b the b
   * @return the int
   */
  public int mult(int a, int b) {
    ans = a * b;
    return ans;
  }

  /**
   * Divide dos numeros. Controla la division entre 0.
   *
   * @param a the a
   * @param b the b
   * @return the int
   */
  public int div(int a, int b) {
    if (b == 0)
      throw new ArithmeticException("No puede dividir por 0");
    ans = a / b;
    return ans;
  }

  /**
   * Operacion optima. Bucle infinito para la prueba de tiempo en el Test.
   */
  public void operacionOptima() {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < startTime; i++) {
    }
  }

  /**
   * Limpia la variable ans.
   */
  public void clear() {
    ans = 0;
  }
}
