package Model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class TemporaryAdopter extends Adopter{
    private LocalDate AdoptionStartDate;
    private LocalDate AdoptionEndDate;
    private String reasonForTemporaryAdoption;


    public TemporaryAdopter() {
    }
    public TemporaryAdopter(String name, double availableMoney, LocalDate adoptionStartDate, LocalDate adoptionEndDate, String reasonForTemporaryAdoption) {
        super(name, availableMoney);
        this.AdoptionStartDate = adoptionStartDate;
        this.AdoptionEndDate = adoptionEndDate;
        this.reasonForTemporaryAdoption = reasonForTemporaryAdoption;
    }

    public LocalDate getAdoptionStartDate() {
        return AdoptionStartDate;
    }
    public void setAdoptionStartDate(LocalDate adoptionStartDate) {
        this.AdoptionStartDate = adoptionStartDate;
    }
    public LocalDate getAdoptionEndDate() {
        return AdoptionEndDate;
    }
    public void setAdoptionEndDate(LocalDate adoptionEndDate) {
        this.AdoptionEndDate = adoptionEndDate;
    }

    public String getReasonForTemporaryAdoption() {
        return reasonForTemporaryAdoption;
    }
    public void setReasonForTemporaryAdoption(String reasonForTemporaryAdoption) {
        this.reasonForTemporaryAdoption = reasonForTemporaryAdoption;
    }

    @Override
    public void isSureAboutAdoption() {
        // Calculate the difference in days between the two dates
        long daysDifference = ChronoUnit.DAYS.between(AdoptionStartDate, AdoptionEndDate);

        if (daysDifference < 30) {
            System.out.println("No");
        } else if (daysDifference > 30 && daysDifference < 365) {
            System.out.println("Maybe");
        } else if(daysDifference >= 365){
            System.out.println("Yes");
        }
    }



    @Override
    public String toString() {
        return "TemporaryAdopter:  " + "\n\n" +
                super.toString() +
                "AdoptionStartDate  =  " + AdoptionStartDate + '\n' +
                "AdoptionEndDate  =  " + AdoptionEndDate + '\n' +
                "reasonForTemporaryAdoption  =  " + reasonForTemporaryAdoption + "\n\n";
    }



}
