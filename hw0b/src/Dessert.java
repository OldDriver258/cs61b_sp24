/*
 * @Author: error: error: git config user.name & please set dead value or install git && error: git config user.email & please set dead value or install git & please set dead value or install git
 * @Date: 2024-08-04 15:25:10
 * @LastEditors: error: error: git config user.name & please set dead value or install git && error: git config user.email & please set dead value or install git & please set dead value or install git
 * @LastEditTime: 2024-08-04 15:44:51
 * @FilePath: \hw0b\src\Dessert.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
public class Dessert {
    private int flavor, price;
    private static int numDesserts = 0;

    public Dessert (int f, int p) {
        flavor = f;
        price  = p;
        Dessert.numDesserts += 1;
    }

    public void printDessert () {
        System.out.printf("%d %d %d\r\n", flavor, price, Dessert.numDesserts);
    }
    
    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
