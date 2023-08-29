package class16;

public class Task4 {
    String SAYHELLO (String countryname){
        switch (countryname){
            case "usa":
                return "hello";
            case "kazakhstan":
                return "salam";
            case "italy":
                return "ciao";
            case "china":
                return "ni hao";
            default:
                return "country not supported";

        }
    }
    public static void main(String[] args) {
        // name= say hello, permter=> stringcountryname
        Task4 task4= new Task4();
        System.out.println(task4.SAYHELLO("algeria"));




    }}


    












