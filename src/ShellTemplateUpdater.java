

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class ShellTemplateUpdater {

    private Map<String, String> replacementDictionary;
//    private String templateRelativePath;
//    private String outputRelativePath;

    public ShellTemplateUpdater(Map<String, String> replacementDictionary) {
        this.replacementDictionary = replacementDictionary;
//        this.templateRelativePath = templateRelativePath;
//        this.outputRelativePath = outputRelativePath;
    }

    public void update(String templateRelativePath, String outputRelativePath) {
//         || templateRelativePath == null || outputRelativePath == null) {
        if (replacementDictionary == null) {
            throw new IllegalStateException();
        }        
        InputStream in;
        PrintStream out;
        try {
            in = new FileInputStream(templateRelativePath);
            out = new PrintStream(outputRelativePath);
            Scanner sc = new Scanner(in).useDelimiter("\\r?\\n");
            while (sc.hasNext()) {
                String row = sc.next();
                for (Map.Entry<String, String> entry : replacementDictionary.entrySet()) {
                    //row=row.replaceAll(entry.getKey(), "qqqq");
                    row = row.replaceAll(entry.getKey(), entry.getValue());  
                            //row.replaceAll(entry.getKey(), entry.getValue());                    
                }
                System.out.println(row);
                out.println(row);                
            }
            in.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
