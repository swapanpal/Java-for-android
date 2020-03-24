
/**
Creates a custom greeting message based on the name.
@return text greeting
*/
private String createCustomGreeting(String firstName, String lastName){
  return "Welcome, " + firstName + " " + lastName + "!";
}

/**
Creates a custom calendar event reminder message based on event name location and minutes away.
@return reminder message
*/
private String createCalendarEventReminder(String eventName, String location, int minutesAway){
  String reminder = "you have an upcoming event in " + minutesAway + " minutes.";
  reminder = reminder + " It is " + event + " held at " + location + ".";
  return reminder
}

/**
point deduction method thats return point(number)
*/
private int deductPoints(int pointsUsed){
  //Everyone starts with 100 points
  int numberOfPoints = 100 - pointsused;
  return numberOfPoints;
}

/**
 * Calculates the price of the order.
 * 
 * @param quantity is the number of cups of coffee ordered
 */
private void calculatePrice(int quantity) {
    int price = quantity * 5;
}


private String findTotalTripLength(int distanceOfFirstTrip, int distanceOfSecondTrip, int distanceOfThirdTrip) {
     // Assume we need 2 miles to go to our friend's home (where the trip will start).
     int totalLength = 2;
     
     // Then start adding in the trip length.
     totalLength = totalLength + distanceOfFirstTrip + distanceOfSecondTrip + distanceOfThirdTrip;
     
     // Form a string to display the total trip length.
     String message = "The total trip will be: " + totalLength + " miles.";
     return message;
}

/**
Create a method that specifies the city name and temperature. where we returned a String but pass a int variable.
*
* @param temperature of the city.
*/
private String createWeatherMessage(int temperature, String cityName){
  return "Welcome to " + cityName + " where the temperature is " + temperature + "F";
}
or try below
/**
     * Calculates the price of the order.
     *
     * @param quantity is the number of cups of coffee ordered
     * @param pricePerCup is the price of one cup of coffee.
     */
    private void calculatePrice(int quantity, int pricePerCup) {
        int price = quantity * pricePerCup;
    }
    
/**
if/else statement example
*/
// Android for Beginners : If/Else Weather Sample Quiz
boolean isRaining = true;
if (isRaining) {
     Log.v("WeatherActivity", "It's raining, better bring an umbrella.");
} else {
     Log.v("WeatherActivity", "It's unlikely to rain.");
}
Log.v("WeatherActivity", "Thank you for using the WhetherWeather App.");
/** output will be 
It's raining, better bring an umbrella.
Thank you for using the WhetherWeather App.

*/
// if statement is false than----
boolean isRaining = false;
Log.v("WeatherActivity", "Thank you for using the WhetherWeather App.");
if (isRaining) {
    Log.v("WeatherActivity", "It's raining, better bring an umbrella.");
} else {
    Log.v("WeatherActivity", "It's unlikely to rain.");
}
/**
output will be
Thank you for using the WhetherWeather App.
It's unlikely to rain.
*/

// If/Else Email Quiz
int numberOfEmailsInInbox = 0;
int numberOfDraftEmails = 2;
String emailMessage = "You have " + numberOfEmailsInInbox + " emails. ";
String draftMessage = "You have " + numberOfDraftEmails + " email drafts.";
if (numberOfEmailsInInbox == 0) {
    emailMessage = "You have no new messages. ";
}

if (numberOfDraftEmails == 0) {
    draftMessage = "You have no new drafts.";
}

Log.v("InboxActivity", emailMessage);
Log.v("InboxActivity", draftMessage);
/**
Output:
You have no new messages.
You have 2 email drafts.
*/

// Android for Beginners : If/Else Smoothie Quiz
int numberOfSmoothiesTillPrize = 10;
if (numberOfSmoothiesTillPrize > 9) {
    Log.v("SmoothieActivity", "Congratulations, you get a free smoothie!");
    numberOfSmoothiesTillPrize = numberOfSmoothiesTillPrize - 10;
} else {
    Log.v("SmoothieActivity", "No free smoothie this time.");
}
Log.v("SmoothieActivity", "You currently have " + numberOfSmoothiesTillPrize + " out of 10 smoothies needed for your next free smoothie.");


// another example for a game 
int points = 0;
if (points == 0){
textView.setText("losser");
imageView.setImageResource(R.id.sad);
}else{
  textView.setText("Winner");
imageView.setImageResource(R.id.happy);
}

// increment and decrement method in Java 'quantity' is global variable

/*
    This method is called when plus button is clicked
     */
    public void increment(View view){
        // To prevent too many cup of coffee order(more than 100)
        if (quantity == 100){
            // Show an error message as a toast
            Toast.makeText(this, "You cannot have more than 100 coffees", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    /*
    This method is called when minus button is clicked
     */
    public void decrement(View view){
        // To prevent negative number of coffee order
        if(quantity == 1){
            // Show an error message as a toast
            Toast.makeText(this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
/**
 * Displays text to the user.
 */
public class TextView extends View {
 
    // String value
    private String mText;
 
    // Text color of the text
    private int mTextColor;
    
    // Context of the app
    private Context mContext;
 
    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public TextView(Context context) {
      mText = "";
      mTextColor = 0;
      mContext = context;
    }
 
    /**
     * Sets the string value in the TextView.
     *
     * @param text is the updated string to be displayed.
     */
    public void setText(String text) {
        mText = text;
    }
 
    /**
     * Sets the text color of the TextView.
     *
     * @param color of text to be displayed.
     */
    public void setTextColor(int color) {
        mTextColor = color;
    }
 
    /**
     * Gets the string value in the TextView.
     *
     * @return current text in the TextView.
     */
    public String getText() {
        return mText;
    }
 
    /**
     * Gets the text color of the TextView.
     *
     * @return current text color.
     */
    public int getTextColor() {
        return mTextColor;
    }
}
// To clean up device memory

/**
 * Clean up the media player by releasing its resources.
 */
private void releaseMediaPlayer() {
    // If the media player is not null, then it may be currently playing a sound.
    if (mMediaPlayer != null) {
        // Regardless of the current state of the media player, release its resources
        // because we no longer need it.
        mMediaPlayer.release();

        // Set the media player back to null. For our code, we've decided that
        // setting the media player to null is an easy way to tell that the media player
        // is not configured to play an audio file at the moment.
        mMediaPlayer = null;
    }
}
// Clean up MediaPlayer resources according to activity lifecycle
 @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }






