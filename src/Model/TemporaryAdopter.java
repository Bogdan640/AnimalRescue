package Model;
import java.time.LocalDate;


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
    public String toString() {
        return "TemporaryAdopter:  " + "\n\n" +
                super.toString() +
                "AdoptionStartDate  =  " + AdoptionStartDate + '\n' +
                "AdoptionEndDate  =  " + AdoptionEndDate + '\n' +
                "reasonForTemporaryAdoption  =  " + reasonForTemporaryAdoption + "\n\n";
    }



}
