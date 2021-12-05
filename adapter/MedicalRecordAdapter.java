import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MedicalRecordAdapter implements MedicalRecord{

    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * get the first name by saving the whole name to a array then spliting and returning the
     * value at index 0
     */
    @Override
    public String getFirstName() {
        String name = record.getName();
        String[] parts = name.split(" ");
        return parts[0];
    }

    /**
     * get the first name by saving the whole name to a array then spliting and returning the
     * value at index 1
     */
    @Override
    public String getLastName() {
        String name = record.getName();
        String[] parts = name.split(" ");
        return parts[1];
    }

    /**
     * call the get birthdate method and gets the date for the record instance
     */
    @Override
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * Coverts the String to enum 
     * https://www.baeldung.com/java-string-to-enum
     */
    @Override
    public Gender getGender() {
        return Gender.valueOf(record.getGender().toUpperCase());
    }

    /**
     * uses the addhistory mothd to add the values stroed in visit as history 
     */
    @Override
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
        
    }

    /**
     * Helper class that generates the date 
     * @param year 
     * @param month
     * @param day
     * @return month day and year 
     */
    private Date dateGen(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.getTime();

    }

    /**
     * gets both the date and the descriptiion on visits saved to array list and parses them 
     * then saves them to another array list returnng the second array list 
     */
    @Override
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<Visit> visits = new ArrayList<Visit>();
        ArrayList<String> history = record.getHistory();
        Boolean well = false;
        String description = " ";
        int month, day, year;

        for(String vis : history) {
            String[] line = vis.split("\n");
            String visLine = line[0];
            String wellLine = line[1];
            String descLine = line[2];

            String[] visCol = visLine.split(": ");
            String[] visSpace = visCol[1].split(" ");

            year = Integer.parseInt(visSpace[3]);
            month = Integer.parseInt(visSpace[2].substring(0,1));
            day = Integer.parseInt(visSpace[1].substring(0,1));

            String[] wellCol = wellLine.split(": ");
            if(wellCol[1].equalsIgnoreCase("true")) {
                well = true;
            }

            String[] descCol = descLine.split(" ");
            description = descCol[1];
            visits.add(new Visit(dateGen(year, month, day),well, description));
        }
        return visits;
    }


    /**
     * formats the date and the birthday then returns the information in the medical record format
     */
    public String toString() {
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        String bday = date.format(getBirthday());
        String gender = (getGender().toString().substring(0, 1).toUpperCase() + getGender().toString().substring(1).toLowerCase());

        String result = "******* " + getFirstName() + " " + getLastName() + " *******\n";
        result += "Birthday: " + bday + "\n";
        result += "Gender: " + gender + "\n";
        result += "Visit History: \n";
        
        if(getVisitHistory().size() == 0) {
            result += "New Patient";
        } else {
            for(Visit visit : getVisitHistory()) {
                result += visit.toString() + "\n";
            }
        }
        return result;
    }
    

    
    
}
