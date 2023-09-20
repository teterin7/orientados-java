public class Users {
    String name;
    int age;

    int docId;

    String adress;

    Users(String name,int age,int docId,String adress){
        this.name = name;
        this.age= age;
        this.docId=docId;
        this.adress=adress;
    }

    public void saludo() {


        System.out.println("Hola mi nombre es" + name);
            }
            public void datos () {
                System.out.println("mi id es" + docId + "mi edad es" + age + "mi direccion es" + adress);
            }

 }

