package view;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class TextFieldResponseStorage {
public static void storeTextFieldResponse(String question, String response, String filename) {
try {
BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true)); // 'true' for

writer.write("Question: " + question);
writer.newLine();
writer.write("Response: " + response);
writer.newLine();
writer.close();
} catch (IOException e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
String question1 = "What is your name?";
String response1 = "John Doe";
String question2 = "Where do you live?";
String response2 = "New York";
String filename = "text_field_responses.txt";
storeTextFieldResponse(question1, response1, filename);
storeTextFieldResponse(question2, response2, filename);
System.out.println("Text field responses have been stored in " + filename);
}
}