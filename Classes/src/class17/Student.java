package class17;

public class Student {
    String name;
    String Id;
    int age;
    int Ssn;

    Student(String stName, String stId, int stAge,int stSsn) {
        name=stName;
        Id=stId;
        age=stAge;
        Ssn=stSsn;




    }
    void PrintInfo(){
        System.out.println("name is "+ name+ " the id is "+ Id+ ",age "+ age+ " ,Ssn "+Ssn);
    }


}

