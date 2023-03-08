/**
 * Clase Prismatri
 */
public class Prismatri {

    /**
     * Atributos de la clase
     */
    private double ladotriangulo;
    private double altura;
    public Prismatri() {
    }

    /**
     *
     * @param ladotriangulo lado de la base
     * @param altura del primas
     */
    public Prismatri(double ladotriangulo, double altura) {
        this.ladotriangulo = ladotriangulo;
        this.altura = altura;
    }

    /**
     *
     * @return el lado de la bas
     */
    public double getLadotriangulo() {
        return ladotriangulo;
    }

    /**
     *
     * @param ladotriangulo pongo el valor de la base
     */
    public void setLadotriangulo(double ladotriangulo) {
        this.ladotriangulo = ladotriangulo;
    }

    /**
     *
     * @return la altura del prisma
     */
    public double getAltura() {
        return altura;
    }

    /**
     *
     * @param altura pone la altura del prisma
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     *
     * @return los atributos para imprimir
     */
    @Override
    public String toString() {
        return "Prismatri{" +
                "ladotriangulo=" + ladotriangulo +
                ", altura=" + altura +
                '}';
    }

    /**
     *
     * @return la altura de la base
     */
    public double alturaTriangulo() {
        return ((Math.sqrt(3))/2)*this.ladotriangulo;
    }

    /**
     *
     * @return el area de la base
     */
    public double areaBase() {
        return (this.ladotriangulo*this.alturaTriangulo())/2;
    }

    /**
     *
     * @return el perimetro
     */
    public double perimetro() {
        return 3*this.ladotriangulo;
    }

    /**
     *
     * @return el area lateral
     */
    public double areaLateral() {
        return (this.perimetro()*this.altura);
    }

    /**
     *
     * @return el area total del prisma
     */
    public double areaTotal() {
        return (2*this.areaBase()+this.areaLateral());
    }

}
