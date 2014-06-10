package init;

import org.mongodb.Document;
import org.mongodb.MongoClient;
import org.mongodb.MongoClients;
import org.mongodb.MongoCollection;
import org.mongodb.connection.ServerAddress;

import static java.util.Arrays.asList;

public class Cocktails {
    public static void populate(final String databaseName, final String collectionName) {

        try (MongoClient client = MongoClients.create(new ServerAddress())) {
            MongoCollection<Document> collection = client.getDatabase(databaseName).getCollection(databaseName);
            collection.tools().drop();

            collection.insert(new Document("_id", 1)
                              .append("name", "Watermelon Mojito")
                              .append("ingredients", asList("Rum", "Watermelon", "Mint")));

            collection.insert(new Document("_id", 2)
                              .append("name", "Margarita")
                              .append("ingredients", asList("Tequila", "Cointreau", "Lime")));

            collection.insert(new Document("_id", 3)
                              .append("name", "Gin and Tonic")
                              .append("ingredients", asList("Gin", "Tonic", "Lime")));

            collection.insert(new Document("_id", 4)
                              .append("name", "Mint Julep")
                              .append("ingredients", asList("Simple syrup", "Bourbon", "Mint")));

            collection.insert(new Document("_id", 5)
                              .append("name", "Daiquiri")
                              .append("ingredients", asList("Lime", "Sugar", "Rum")));

            collection.insert(new Document("_id", 6)
                              .append("name", "Sangria")
                              .append("ingredients", asList("Brandy", "Triple Sec", "Orange Juice", "Red wine", "Club soda")));

            collection.insert(new Document("_id", 7)
                              .append("name", "Michelada")
                              .append("ingredients", asList("Lemon", "Soy Sauce", "Clamato", "Beer")));

            collection.insert(new Document("_id", 8)
                              .append("name", "Martini")
                              .append("ingredients", asList("Vodka", "Olives")));

            collection.insert(new Document("_id", 9)
                              .append("name", "Manhattan")
                              .append("ingredients", asList("Rye Whisky", "Sweet Vermouth", "Angostura bitters")));

            collection.insert(new Document("_id", 10)
                              .append("name", "Pimm's Cup")
                              .append("ingredients", asList("English cucumber wheel", "Lemon wheel", "Pimm's No. 1", "Ginger ale")));
        }
    }
}