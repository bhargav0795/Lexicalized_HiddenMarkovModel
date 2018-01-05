import java.util.*;
import java.io.*;

public class USERTEST 
{
   public static void main(String[] args) throws IOException
   {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter a file name: ");
   String filename = keyboard.nextLine();

   File file1 = new File(filename);
   Scanner inputFile = new Scanner(file1);
   int i=0,n,k,j,l=0,m=1;
   String[] arr = new String[10000];
   String[] arr1 = new String[10000];
   String[] Stop = {"a", "about", "above", "above", "across", "after", "afterwards", "again", "against", "all", "almost", "alone", "along", "already", 	"also", "although", "always", "am", "among", "amongst", "amoungst", "amount", "an", "and", "another", "any", "anyhow", "anyone", "anything", "anyway", "anywhere", "are", "around", "as", "at", "back", "be", "became", "because", "become", "becomes", "becoming", "been", "before", 	"beforehand", "behind", "being", "below", "beside", "besides", "between", "beyond", "bill", "both", "bottom", "but", "by", "call", "can", "cannot", "cant", "co", "con", "could", "couldnt", "cry", "de", "describe", "detail", "do", "done", "down", "due", "during", "each", "eg", "eight", "either", 	"eleven", "else", "elsewhere", "empty", "enough", "etc", "even", "ever", "every", "everyone", "everything", "everywhere", "except", "few", "fifteen", "fify", "fill", "find", "fire", "first", "five", "for", "former", "formerly", "forty", "found", "four", "from", "front", "full", "further", "get", "give", "go", "had", "has", "hasnt", "have", "he", "hence", "her", "here", "hereafter", "hereby", "herein", "hereupon", "hers", "herself", "him", "himself", "his", "how", "however", "hundred", "ie", "if", "in", "inc", "indeed", "interest", "into", "is", "it", "its", 	"itself", "keep", "last", "latter", "latterly", "least", "less", "ltd", "made", "many", "may", "me", "meanwhile", "might", "mill", "mine", "more", 	"moreover", "most", "mostly", "move", "much", "must", "my", "myself", "name", "namely", "neither", "never", "nevertheless", "next", "nine", "no", "nobody", "none", "noone", "nor", "not", "nothing", "now", "nowhere", "of", "off", "often", "on", "once", "one", "only", "onto", "or", "other", 	"others", "otherwise", "our", "ours", "ourselves", "out", "over", "own", "part", "per", "perhaps", "please", "put", "rather", "re", "same", "see", "seem", "seemed", "seeming", "seems", "serious", "several", "she", "should", "show", "side", "since", "sincere", "six", "sixty", "so", "some", "somehow", "someone", "something", "sometime", "sometimes", "somewhere", "still", "such", "system", "take", "ten", "than", "that", "the", 	"their", "them", "themselves", "then", "thence", "there", "thereafter", "thereby", "therefore", "therein", "thereupon", "these", "they", "thickv", "thin", "third", "this", "those", "though", "three", "through", "throughout", "thru", "thus", "to", "together", "too", "top", "toward", "towards", 	"twelve", "twenty", "two", "un", "under", "until", "up", "upon", "us", "very", "via", "was", "we", "well", "were", "what", "whatever", "when", "whence", "whenever", "where", "whereafter", "whereas", "whereby", "wherein", "whereupon", "wherever", "whether", "which", "while", "whither", 	"who", "whoever", "whole", "whom", "whose", "why", "will", "with", "within", "without", "would", "yet", "you", "your", "yours", "yourself", "yourselves", "z", "zero"};

while (inputFile.hasNext())
   {
   String line = inputFile.nextLine(); 
   line = line.trim();  
   for (String retval: line.split(" "))
   {

   arr[i]=retval;
   arr[i]=arr[i].toLowerCase();
   System.out.println(arr[i]);
   i++;
   }
   }
   System.out.println("Array Size:"+i);
   System.out.println(Stop.length);
   k=Stop.length;
   n=i;


for(i=0;i<n;i++)
{
for(j=0;j<k;j++)
{
if(arr[i].equals(Stop[j]))
{
arr[i]="";
l++;
}
}
}   



try {
	String content = "This is the content to write into file";
	File file = new File("output.txt");

	// if file doesnt exists, then create it
	if (!file.exists()) 
{
	file.createNewFile();
}

	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
	
for(i=0;i<n;i++)
{
if(!(arr[i].equals("")))
{
bw.write(arr[i]);
bw.write(" ");
if(arr[i].equals("."))
{
String newLine = System.getProperty("line.separator");
bw.write(newLine);
m++;
}


}
}
	bw.close();
	System.out.println("\nStop words removed and Output file created");
} 
catch (IOException e) 
{
	e.printStackTrace();
}


inputFile.close();

}

}