import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StoryReader {
    public static void main(String[] args) throws IOException {
//        a primitive type is the most basic unit of information
//        ints, chars, doubles, booleans
        int numberOfCharacters = 0;
//        you can think of an object as a custom type in the same way that ints, chars are types
        CharacterCounter counter1 = new CharacterCounter();
        CharacterCounter counter2 = new CharacterCounter();
//        objects are instances of classes
//        imagine you're at a factory that produces x thing - the class is the blueprint for x,
//        and the object is an individual x
        counter1.setCount(5);
        counter2.setCount(3);

        File tedsFile = new File("story.txt");
        FileReader tedsReader = new FileReader(tedsFile);

        int[] charArray = new int[64];
        boolean reading = true;
        int currentIndex = 0;
        while(reading) {
//            we need a way to keep track of what index any given letter should go in...

            int c = tedsReader.read();
//            boolean logic: ==, !=, <=, >=, <, >
            if(c != -1) {
//                System.out.println((char) c);
//            lets store our letters in a particular index and then increment the index to prepare for the next letter
                charArray[currentIndex] = c;
                currentIndex++;
            }else{
                reading = false;
            }
        }

//        the for loop..
//        effectively, this is the same as a while loop
//        except, it does 3 things for us:
//        a) it creates some variable that we may use within the loop or as a conditional statement
//        b) it contains a conditional statement that determines if the loop will continue running
//        c) it contains an additional line of code typically used for iterating the variable in part a

//        in the vast majority of cases, all we are using a for loop for is
//        saying 'given an index we call i, increment index and run this code until i is less than length of some
//        collection of data
//        iterate through a collection of data
        for(int i = 0; i < charArray.length; i++){
            System.out.println((char)charArray[i]);
        }

    }
}
