public class ServerNameGenerator {
    private static final String[] adjectives = {"red", "blue", "green", "yellow", "orange", "purple", "pink", "black", "white", "gray"};
    private static final String[] nouns = {"dog", "cat", "bird", "fish", "horse", "cow", "sheep", "goat", "pig", "chicken"};

    private static String getRandomElement(String[] array) {
        int index = (int) (Math.random() * array.length);
        return array[index];
    }

        public static void main(String[] args) {
            String adjective = getRandomElement(adjectives);
            String noun = getRandomElement(nouns);
            String serverName = adjective + "-" + noun;
            System.out.println("Your server name is: " + serverName);
        }
    }
