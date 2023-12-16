import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
class SerializationUtils {
    private static final Logger LOGGER = Logger.getLogger(SerializationUtils.class.getName());
    public static <T extends Serializable> void serializeObject(List<Person> object, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(object);
            LOGGER.info("Serialization completed successfully.");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error during serialization", e);
        }
    }
    public static <T extends Serializable> T deserializeObject(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            @SuppressWarnings("unchecked")
            T object = (T) ois.readObject();
            LOGGER.info("Deserialization completed successfully.");
            return object;
        } catch (IOException | ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Error during deserialization", e);
            return null;
        }
    }
}
