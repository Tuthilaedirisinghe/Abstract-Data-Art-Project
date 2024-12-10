import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Winners trophy in the Theater from a chosen dataset
 */
public class DataScene extends Scene {
  private int[] year; // 1d array of years
  private String[] winner; // 1d array of winner

  public DataScene() {
   year = FileReader.toIntArray("year.txt");
   winner = FileReader.toStringArray("wInner.txt");
  }

  // Top level method to draw the animation
  public void drawScene() {
    clear("black");
  setTextHeight(15);
    drawImage("trophy.jpg", 100, 200, 190);
    setTextColor("white");
    drawText("Copa America Trophy",200,115);
    drawImage("Argentina.png", 50, 75, 150);
    drawText("Argentina",200,85);
    setTextColor("white");
  }

    public void drawCountryFlag(String country) {
    if (country.equals("Uruguay")) {
      drawImage("Uruguay.jpg", 100, 200, 190);
    } else if (country.equals("Brazil")) {
      drawImage("Brazil.jpg", 100, 200, 190);
    } else if (country.equals("Argentina")) {
      drawImage("Argentina.jpg", 100, 200, 190);
    } else if (country.equals("Bolivia")) {
      drawImage("Bolivia.jpg", 100, 200, 190);
    } else if (country.equals("Colombia")) {
      drawImage("Colombia.jpg", 100, 200, 190);
    } else if (country.equals("Paraguay")) {
      drawImage("Paraguay.jpg", 100, 200, 190);
    } else if (country.equals("Peru")) {
      drawImage("Peru.jpg", 100, 200, 190);
    } else if (country.equals("Chile")) {
      drawImage("Chile.jpg", 100, 200, 190);
}
    }
}
