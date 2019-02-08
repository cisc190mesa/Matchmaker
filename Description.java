import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
/**
 * Description 
 *
 */
public class Description
{
    // height in meters.
    private float height; //Primative
    
    private float weight; // weight in kilograms
    
    private EyeColor eyeColor; //Class EyeColor
    
    private Gender gender;
    
    private Person person;
    
    private Date birthDate;

    /**
     * Constructor for objects of class Description, Constructor has same name as class and no return type.
     */
    public Description(float height, float weight, EyeColor eyeColor, Gender gender, int year, int month, int day)
    {
       this.height = height;
       this.weight = weight;
       this.eyeColor = eyeColor;
       this.gender = gender;
       Calendar bday = new Calendar.Builder() // Builder is a public static Class nested inside the Calendar Class
            .setCalendarType("iso8601")
            .setDate(year, month, day)
            .build();
            // convert the calendar to a date
       this.birthDate = Date.from(bday.toInstant());
    }
    
    public float getHeightMetric()
    {
        return height;
    }
    
    public float getHeightImperial()
    {
        //TODO: convert to feet/inches
        return 0.0F;
    }
    
    public float getWeightImperial()
    {
        //TODO: Convert to pounds/oz
        return 0.0F;
    }
    
    public EyeColor getEyeColor()
    {
        return eyeColor;
    }
    
    public Gender getGender()
    {
        return gender;
    }
    
    public Date getBirthDate()
    {
        return birthDate;
    }
}