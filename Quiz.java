public static String scrambleWord(String word){
  /* To be implemented in part (a) */
  String newWord = "";
  for(int i=0; i<word.length();i++)
  {
    if(word.substring(i,i).equals("A") && !word.substring(i+1,i+1).equals("A"))
    {
      newWord.substring(i,i).equals(word.substring(i+1,i+1));
      newWord.substring(i+1,i+1).equals(word.substring(i,i));
    }
  }
  return newWord;
}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  String newWordList = new list<String>;

  for(int i=0; i<wordList.size();i++)
  {
    if(wordList[i].equals(scrambleWord(wordList[i])))
        Remove(wordList[i];
    else  
    newWordList[i] == scrambleWord(wordList[i]);
  }
  return newWordList;
}
