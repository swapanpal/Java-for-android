
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
