/** Task: Hill Climbing String Guessing (arrays) */
//Word[] word = new Word[25];


import java.util.Scanner;


public class WordGuesser
{
 private String word;
 private Array matchesArray;
 //private int guesses;
 //private const int GUESS_GROUP = 1000;

 public WordGuesser()
 {
  word = "";
  matchesArray = new Array();
 }

 public WordGuesser(String aWord)
 {
  word = aWord;
  matchesArray = new Array();
 }

 public void setWord(String aWord)
 {
  word = aWord;
 }

 public String getWord()
 {
  return word;
 }

 public int getLength()
 {
  return word.length();
 }

 /** Task: Use original word as reference. */
 public void guessRandom()
 {
  Array guessingArray = new Array();

  //randomly generate an array of characters, 
  rng = (int)Math.random();

  //check against original, 
  for (int i = 0; i < wordlength, i++)
   if (guessingArray[i] == word[i])
    matchesArray[i] = true;

  //ignore previous matches when iterating over next generation
 }


 public void showProgress()
 {
  System.out.println("Word completion: ");
  char[] wordArray = (char[])guessWord;
  for (char letter : wordArray)
   System.out.println(letter); 

  System.out.println("Percent complete: " + percent);
 }


 public static void main(String[] args)
 {
  Scanner keyboard = new Scanner(System.in);
  char[] myArray = new char[wordLength];  

  guessRandom(); //1000 guesses
  showProgress();//check progress for viewing completion

  
 }

