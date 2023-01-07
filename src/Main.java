import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        try {


        Plant kvetina1 = new Plant("narcis", "zluty", LocalDate.of(2022, 9, 23), LocalDate.of(2022, 11, 20), 12 );

        System.out.println(kvetina1.getWateringInfo());


       Plant kvetina2 = new Plant ("tulipan", "cerveny", LocalDate.of(2022, 7, 20), LocalDate.of(2022, 9, 16), -1 );

       System.out.println(kvetina2.getWateringInfo());

       }

      catch (PlantException e)   {
      System.err.println(e.getLocalizedMessage());

        }


    }

}