public class Calculadora{

    public String ecuacionSegundoGrado(double a, double b, double c){
        String respuesta;
        double determinante;
        double raizReal;
        String raiz1, raiz2;
        double r1, r2;
        double raizImag;

        determinante = Math.pow(b,2) -4 * a * c;

        raizReal = (-1*b)/(2*a);

        if(determinante < 0){
            raizImag = Math.sqrt(Math.abs(determinante))/(2*a);
            raiz1 = raizReal + " + " + raizImag + " i";
            raiz2 = raizReal + " - " + raizImag + " i";
            respuesta = "x1 = " + raiz1 + ", x2 = " + raiz2;
        }else{
            r1 = (raizReal) + (Math.sqrt((determinante)))/(2*a);
            r2 = (raizReal) - (Math.sqrt(Math.abs(determinante)))/(2*a);
            respuesta = "x1 = " + r1 + ", x2 = " + r2;
        }
        return respuesta;

    }

    public String encontrarRecta(Punto p1, Punto p2){
        double m;
        double b;
        String recta;
        if(p1.getX() == p2.getX() && p1.getY() == p2.getY()){
            recta = "Debe elegir 2 puntos distintos uno a otro";
        }else{
            recta = "Debe elegir 2 puntos distintos uno a otro";
            
            m = (p1.getY() - p2.getY())/(p1.getX() - p2.getX());
            b = p2.getY() - p2.getX()*m;

            recta = "y = " + m + "x " + "+" + b;
        }
        return recta;
    }

    public String encontrarCateto(double hipotenusa, double cateto1){
        String cateto2;
        double resultado;
        // un cateto no puede ser mayor a la hipotenusa

        if(hipotenusa <= cateto1){
            cateto2 = "El cateto debe ser mayor a la hipotenusa";
        }else{
            resultado = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(cateto1, 2));
            cateto2 = "El cateto faltante es: " + resultado;
        }
        return cateto2;
    }
}