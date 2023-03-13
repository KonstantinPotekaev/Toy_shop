import java.io.*;

public class IdGenerator {
    public static int IdGenerator()
    {
        try(FileReader reader = new FileReader("id.txt"))
        {
            int id = reader.read();
            try(FileWriter writer = new FileWriter("id.txt", false))
            {
                writer.write(id+1);
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
            return id;
        }
        catch(IOException ex){
            try(FileWriter writer = new FileWriter("id.txt", false))
            {
                writer.write(1);
                writer.flush();
            }
            catch(IOException ex2){
                System.out.println(ex2.getMessage());
            }
            return 0;
        }

    }
}
