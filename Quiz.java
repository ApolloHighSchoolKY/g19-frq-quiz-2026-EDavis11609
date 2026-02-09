public static String scrambleWord(String word){
  /* To be implemented in part (a) */
  //Variable to contain the scrambled word
  String newWord = "";
  //Traditional for-loop so we can loop through the entire word
  for(int i=0; i<word.length();i++)
  {
    //If the letter is  not A at 2 consecutive conditions then don't swap them
    if(word.substring(i,i).equals("A") && !word.substring(i+1,i+1).equals("A"))
    {
      newWord.substring(i,i).equals(word.substring(i+1,i+1));
      newWord.substring(i+1,i+1).equals(word.substring(i,i));
    }
  }
  //return the scrambled word
  return newWord;
}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  //Create a list to track the scrambled and removed words
  String newWordList = new list<String>;
  //Traditional for-loop to traverse the enitre array list
  for(int i=0; i<wordList.size();i++)
  {
    //If the unscrmabled word is the same as the scrambled word, then remove it
    if(wordList[i].equals(scrambleWord(wordList[i])))
        Remove(wordList[i];
    else
    //Else scramble the word  
    newWordList[i] == scrambleWord(wordList[i]);
  }
  //Return the new word list
  return newWordList;
}
