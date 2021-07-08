import java.io.*;
import java.util.*;
public class RepeatedWordsFromFile {

	private static File myFile;
	private static FileReader fr;
	private static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		openFileToRead();
		String maxRepeatedWord=findMaximumRepeatedWord();
		System.out.println("Most Repeated Word From file "+myFile.getName()+" is "+maxRepeatedWord);
	}

	private static String findMaximumRepeatedWord() throws IOException{
		String line,word="";    
        int count=0, maxCount=0;    
        ArrayList<String> words = new ArrayList<String>();     
            
        while((line = br.readLine()) != null) {    
            String string[] = line.split(",");  
            for(String s : string){    
                words.add(s);    
            }    
        }       
        for(int i = 0; i < words.size(); i++){    
            count = 1;    
            for(int j = i+1; j < words.size(); j++){    
                if(words.get(i).equals(words.get(j))){    
                    count++;    
                }     
            }    
            if(count > maxCount){    
                maxCount = count;    
                word = words.get(i);    
            }    
        }    
            
        br.close();    
        return word;
	}

	private static BufferedReader openFileToRead() throws IOException{
		myFile=new File("E:\\Coditas\\WordFile.txt");
		fr=new FileReader(myFile);
		br=new BufferedReader(fr);
		return br;
	}    

}
