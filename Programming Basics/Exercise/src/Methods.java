public class Methods {
    public static void printNameAndAge(String title, int age) {

        System.out.println("Hello" + " " + title + " " + age);
    }

    public static void main(String[] args) {
        String name = "Kami";
        int age = 21;
        printNameAndAge(name, age);

    }
    /*public static void printLogo(String logo){
        System.out.println("Sun Microsystems");
        System.out.println("SUN");
        System.out.println(logo);
    }

    public static void main(String[] args) {
        String company = "Oracle";
        printLogo(company);
    }*/
    /*static void printSign(String name,int age){
        if (name.equals("Boyko")){
            System.out.println("This is me.I am" + " " + age + " years old");
        }else if (name.equals("Simeon")){
            System.out.println("That is my brother.");
        }else {
            System.out.println("I don't know you !");
        }
    }

    public static void main(String[] args) {
        String name = "Boyko";
        int age = 27;
        printSign(name,age);
    }
   /* public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(result(a,b));
    }

    static int result(int a, int b) {
        return a + b;
    }*/

}

