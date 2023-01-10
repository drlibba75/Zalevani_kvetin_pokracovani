import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {





        // blok try - catch na odchycení chyby

        try {


            Plant kvetina1 = new Plant("narcis", "zluty", LocalDate.of(2022, 9, 23), LocalDate.of(2022, 11, 20), 12);

            System.out.println(kvetina1.getWateringInfo());


            Plant kvetina2 = new Plant("tulipan", "cerveny", LocalDate.of(2022, 7, 20), LocalDate.of(2022, 9, 16), 1);

            System.out.println(kvetina2.getWateringInfo());


            Plant kvetina3 = new Plant("snezenka", "bily", LocalDate.of(2022, 12, 24), LocalDate.of(2022, 12, 28), 5);

            System.out.println(kvetina3.getWateringInfo());

// seznam květin
            System.out.println(" ");
            System.out.println("seznam rostlin");
            System.out.println("[název, barva, zasazení, zálivka, frekvence zálivky]");
            System.out.println(kvetina1.getPlantInfo());
            System.out.println(kvetina2.getPlantInfo());
            System.out.println(kvetina3.getPlantInfo());


// jiný (lepší :-) způsob vytvoření seznamu květin
            System.out.println(" ");
            System.out.println("seznam rostlin");
            System.out.println("[název, barva, zasazení, zálivka, frekvence zálivky]");
            List<String> plantList = new ArrayList<>();
            plantList.add(kvetina1.getPlantInfo());
            plantList.add(kvetina2.getPlantInfo());
            plantList.add(kvetina3.getPlantInfo());
            plantList.forEach(System.out::println);

// získání květiny na zadaném indexu


            int index1;
            System.out.println(" ");
            System.out.println("získání květiny na zadaném indexu");
            System.out.println("zadej celé číslo - index rostliny od 0 do (počet rostlin - 1):");
            index1 = Support.safeReadInt();
            System.out.println("[název, barva, zasazení, zálivka, frekvence zálivky]");
            System.out.println(plantList.get(index1));

// odebrání květiny ze seznamu

            int index2;
            System.out.println(" ");
            System.out.println("odebrání květiny na zadaném indexu");
            System.out.println("zadej celé číslo - index rostliny od 0 do (počet rostlin - 1):");
            index2 = Support.safeReadInt();
            System.out.println("odebráno:");
            System.out.println("[název, barva, zasazení, zálivka, frekvence zálivky]");
            System.out.println(plantList.remove(index2));
            System.out.println(" ");
            System.out.println("nový seznam rostlin:");
            plantList.forEach(System.out::println);



        } catch (PlantException e) {
            System.err.println(e.getLocalizedMessage());

        }









    }

}