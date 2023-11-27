public class esercizio3 {
    public static void main(String[] args) {
    double a = 5;
    double b = 2;
    double perimetro = perimetrorettangolo(a,b);
        System.out.println(perimetro);
        int pippo = pariDispari(5);
        System.out.println(pippo);
        double a1 = 1.1;
        double a2 = 2.1;
        double a3 = 3.1;
        double paperino = areaTriangolo(a1,a2,a3);
        System.out.println(paperino);
    }
    public static double perimetrorettangolo(double num1, double num2) {
        double perimetro = (num1 + num2) * 2;
        return perimetro;
    }
    public static int pariDispari(int num1){
        if(num1 % 2 == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static double areaTriangolo(double a1, double a2, double a3){
        double s = (a1 + a2 + a3)/2;
        double area = Math.sqrt(s*(s-a1)*(s-a2)*(s-a3));
        return area;
    }
}
