public class Student {
    public String Name;
    public double n1;
    public double n2;
    public double n3;

    public double media() {
        return (n1 + n2 + n3);
    }

    public void VerificarMedia() {
        double resultadomedia = media();
        double faltando= media() - 60;

        if (resultadomedia >= 60){
            System.out.println("Pass");

        }
        else {

                System.out.println(" Failed");
                System.out.println("Missing "  + faltando + " points "
                );
                  
        }

    }

}
