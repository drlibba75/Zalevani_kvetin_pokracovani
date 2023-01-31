import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.io.*;


    public class ListOfPlants {

        public List<Plant> plants = new ArrayList<>();





        //konstruktor
        public ListOfPlants(List<Plant> plants)  {
            this.plants = plants;

        }

        // přístupové metody


        public List<Plant> getPlants() {
            return plants;
        }

        public void setPlants(List<Plant> plants) {
            this.plants = plants;
        }



        // metody pro zisk a výmaz květiny ze seznamu

        public void getPlant(int index1){
          System.out.println("získání květiny na indexu"+" "+index1);
            System.out.println(plants.get(index1));

             }
        public void removePlant(int index2) {
            System.out.println("odebrání květiny na indexu"+" "+index2);
            plants.remove(index2);

        }

    }



















