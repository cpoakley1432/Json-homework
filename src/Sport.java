import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by cameronoakley on 10/14/15.
 */
public class Sport {

    static Reply reply;

    public static void main(String[] args) {

        reply = loadReply();

        if(reply ==null){
            reply = new Reply();
            reply.questionReply();
        }
        else if (reply != null){
            System.out.println(String.format("Sport = %s , Player = %s , Position = %s , Age = %d , Retire = %d ",
                    reply.sport, reply.player, reply.position, reply.age, reply.yearOfRetire));
            System.out.println("Please update sport information if not correct");
            reply.questionReply();
        }
        saveReply();

    }
    static Reply loadReply(){
        try {
            File f = new File ("save.json");
            FileReader fr = new FileReader(f);
            int fileSize = (int) f.length();
            char[] contents = new char[fileSize];
            fr.read(contents);
            String fileContents = new String(contents);
            JsonParser parser = new JsonParser();
            return parser.parse(fileContents, Reply.class);
        } catch (Exception e){
            System.out.println("Loading error!");
            return null;


        }
    }
    static void saveReply(){
        File f = new File ("save.json");
        JsonSerializer serializer = new JsonSerializer();
        String contentToSave = serializer.serialize(reply);

        try {
            FileWriter fw = new FileWriter(f);
            fw.write(contentToSave);
            fw.close();
        } catch (Exception e){
            System.out.println("Saving error!");

        }
    }
}
