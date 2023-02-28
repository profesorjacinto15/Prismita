public class Prismatri {
    private double ladotriangulo;
    private double altura;
    public Prismatri() {
    }

    public Prismatri(double ladotriangulo, double altura) {
        this.ladotriangulo = ladotriangulo;
        this.altura = altura;
    }

    public double getLadotriangulo() {
        return ladotriangulo;
    }

    public void setLadotriangulo(double ladotriangulo) {
        this.ladotriangulo = ladotriangulo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Prismatri{" +
                "ladotriangulo=" + ladotriangulo +
                ", altura=" + altura +
                '}';
    }

    public double alturaTriangulo() {
        return ((Math.sqrt(3))/2)*this.ladotriangulo;
    }

    public double areaBase() {
        return (this.ladotriangulo*this.alturaTriangulo())/2;
    }

    public double perimetro() {
        return 3*this.ladotriangulo;
    }

    public double areaLateral() {
        return (this.perimetro()*this.altura);
    }

    public double areaTotal() {
        return (2*this.areaBase()+this.areaLateral());
    }

}
