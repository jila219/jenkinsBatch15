public class returnValues {
    public static void main(String[] args) {
        double area1 =calculatorArea(2.3,2.6);
        double area2= calculatorArea(1.6,2.4);
        double area3= calculatorArea(2.6,4.2);
        String englishexplantion= explainArea("english");
        String frenshexplanation= explainArea("frensh");
        String spanishexplanation= explainArea("spanish");
        String italianexplanation= explainArea("italian");
        

    }
    public static double calculatorArea(double length, double width){
        double area= length*width;
        return area;



    }
    public static String explainArea(String language) {

        switch (language) {
            case "english":
                return "Area equals length * width";
            case "french":
                return "La surface est egale a la longueur * la largeur";
            case "spanish":
                return "area es igual a largo * ancho";
            default: return "language its not avilible";


        }

    }
}
//English "Area equals length * width"

     //   French "La surface est egale a la longueur * la largeur"

        //Spanish "area es igual a largo * ancho"
