package ArCitBot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArBotStorage {

    public static String getRandomWordFromFile(String filePath) {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split(", "); // Разделение строки на слова
                for (String word : lineWords) {
                    words.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    String getMsur = getRandomWordFromFile("msur.txt");
    String getMname = getRandomWordFromFile("mnam.txt");
    String getMpat = getRandomWordFromFile("mpat.txt");
    String male = getMsur + " " + getMname + " " + getMpat;
    String getFsur = getRandomWordFromFile("fsur.txt");
    String getFname = getRandomWordFromFile("fnam.txt");
    String getFpat = getRandomWordFromFile("fpat.txt");
    String female = getFsur + " " + getFname + " " + getFpat;
    String getCity = getRandomWordFromFile("cities.txt");

    public String getBirthDate() {
        long epochtime = ThreadLocalRandom.current().nextLong(1148476152000L);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        return sdf.format(epochtime);
    }

    public String maleAnswer() {
        ArBotStorage outcome = new ArBotStorage();
        return outcome.male + "\n" + outcome.getBirthDate() + "\n" + outcome.getCity;
    }

    public String femaleAnswer() {
        ArBotStorage outcome = new ArBotStorage();
        return outcome.female + "\n" + outcome.getBirthDate() + "\n" + outcome.getCity;
    }
}