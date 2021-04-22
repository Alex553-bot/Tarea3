public class Matematico{

    private Calculadora calculadora;
    
    public Matematico(){
        this.calculadora = new Calculadora();
    }
    
    public String resolverEcuacion(double a, double b, double c){
        String respuesta;
        
        respuesta = "Las raices de la ecuación de segundo grado son: " + calculadora.ecuacionSegundoGrado(a,b,c);
        
        return respuesta;
    }
    
    public String hallarRecta(Punto p1, Punto p2){
        return calculadora.encontrarRecta(p1, p2);
    }
    
    public String hallarCateto(double hipotenusa, double cateto){
        String respuesta;
        
        respuesta = calculadora.encontrarCateto(hipotenusa, cateto);
        
        return respuesta;
    }
    
    public String ordenarNumeros(double num1, double num2, double num3){
        // debemos tener en cuenta si los numeros son iguales en algun punto
        double mayor;
        double medio;
        double menor;
        String orden;

        if(num1 > num2){
            if(num1 > num3){
                mayor = num1;
                if (num3 > num2) {
                    medio = num3;
                    menor = num2;
                }else{
                    medio = num2;
                    menor = num3;
                }
            }else{
                mayor = num3;
                medio = num1;
                menor = num2;
            }
        }else{
            if(num2 > num3){
                mayor = num2;
                if(num1 > num3){
                    medio = num1;
                    menor = num3;
                }else{
                    medio = num3;
                    menor = num1;
                }
            }else{
                mayor = num3;
                medio = num2;
                menor = num1;
            }
        }
        orden = "El numero mayor es: " + mayor + ", el numero al medio es: " + medio + " y el numero pequeño es: " + menor;
        return orden; 
    }

    public double calcularArea(double base, double altura){
        // el problema no contempla numeros negativos
        double area;

        area = base * altura;

        return area;
    }

    public double calcularDistancia(Punto punto1, Punto punto2) {
        double distX;
        double distY;
        double distancia;

        distX = punto1.getX() - punto2.getX();
        distY = punto1.getY() - punto2.getY();
        distancia = Math.sqrt(Math.pow(distX,2) + Math.pow(distY,2));

        return distancia;
    }

    public String determinarCuadrante(Punto punto){
        String cuadrante;

        if(punto.getY() > 0){
            if (punto.getX() > 0 ){
                cuadrante = "Primer cuadrante";
            }else if(punto.getX() < 0){
                cuadrante = "Segundo cuadrante";
            }else{
                cuadrante = "Se encuentra entre el primer y segundo cuadrante, sobre el eje y";
            }
        }else if (punto.getY() < 0){
            if (punto.getX() > 0 ){
                cuadrante = "Cuarto cuadrante";
            }else if(punto.getX() < 0){
                cuadrante = "Tercer cuadrante";
            }else{
                cuadrante = "Se encuentra entre el tercer y cuarto cuadrante, sobre el eje y";
            }			
        }else{
            if(punto.getX() == 0){
                cuadrante = "Se encuentra sobre el origen, por lo que no se puede determinar el cuadrante exacto en el que se encuentra";
            }else{
                if (punto.getX() > 0 ){
                    cuadrante = "Sse encuentra entre el primer y cuarto cuadrante, sobre el eje x";
                }else{
                    cuadrante = "Se encuentra entre el segundo y tercer cuadrante, sobre el eje x";
                }

            }
        }
        return cuadrante;
    }
}