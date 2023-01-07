import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class Plant {

   String flowername;
   String notes;
   LocalDate planted;
   LocalDate watering;
   int frekvency;





    // první konstruktor pro nastavení všech atributů (throws upozorňuje, že zde může být výjimka)
    public Plant(String flowername, String notes, LocalDate planted, LocalDate watering, int frekvency) throws PlantException{
        this.flowername = flowername;
        this.notes = notes;
        this.planted = planted;
        this.watering = watering;
        this.frekvency = frekvency;
    }


   // druhý konstruktor nastaví jako poznámku prázdný řetězec a datum poslední zálivky nastaví na dnešní datum.

    public Plant(String flowername, LocalDate planted, int frekvency) throws PlantException{
        this(flowername, "null", planted, LocalDate.now(), frekvency);
    }


    // třetí konstruktor nastaví totéž co druhý a navíc výchozí frekvenci zálivky na 7 dnů a datum zasazení na dnešní datum. (Uživatel tedy bude zadávat pouze název rostliny.)

    public Plant(String flowername)throws PlantException {
        this(flowername, "null", LocalDate.now(), LocalDate.now(), 7);
    }


    // přístupové metody

    public String getFlowername() {
        return flowername;
    }

    public void setFlowername(String flowewname) {
        this.flowername = flowewname;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate watering) throws PlantException
    {

        //ošetření chyby v datu zalévání (nesmí být před datem zasazení)
        if (watering.isBefore(planted))
         {
            throw new PlantException("frekvence nesmí být nulová či záporná. Zadáno:"+frekvency);
        }

        this.watering = watering;
    }




    public int getFrekvency() {
        return frekvency;
    }

    public void setFrekvency(int frekvency) throws PlantException
    // ošetření chyby ve frekvenci zalévání
    {
        if (frekvency<=0 ) {
        throw new PlantException("frekvence nesmí být nulová či záporná. Zadáno:"+frekvency);
    }
        this.frekvency = frekvency;
    }



   // Připravte metodu getWateringInfo(), která vrátí název květiny, datum poslední zálivky a
    // datum doporučené další zálivky. (Metoda vrátí textový řetězec, obsahující požadované informace.)


   public String getWateringInfo(){

        LocalDate recommended = watering.plusDays(7);

// převod LocalDate na String
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
      String wateringAsString = watering.format(formatter);



// převod LocalDate na String

       String recommendedAsString = recommended.format(formatter);

// vytvoření a naplnění listu

       List<String> wateringInfo = new ArrayList<>();

       wateringInfo.add(flowername);
       wateringInfo.add(wateringAsString);
       wateringInfo.add(recommendedAsString);

       return wateringInfo.toString();

   }

}
