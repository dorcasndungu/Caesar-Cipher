

 class encrypt {

  public encrypt(String receivedString, Integer encryptKey) {
    this.receivedString = receivedString;
    this.encryptKey = encryptKey;
  }

  private String receivedString;
  public String getReceivedString() {
    return receivedString;
  }
  public void setReceivedString(String receivedString) {
    this.receivedString = receivedString;
  }

  private Integer encryptKey;
  public Integer getEncryptKey() {
    return encryptKey;
  }
  public void setEncryptKey(Integer encryptKey) {
    this.encryptKey = encryptKey;
  }

  public boolean validReceivedString(){
      char[] validateReceivedChars = receivedString.toCharArray();
      boolean numberFlag = false;
      for(char ch:validateReceivedChars){
         if( Character.isLetter(ch) && ch!=' '){
             numberFlag=true;
         }
      }
      return  numberFlag;
  };

     public boolean validKey(){
         boolean validKey = false;
         if(encryptKey>0 && encryptKey<=25){
              validKey= true;
         }
         return validKey;
     }

  public String encryption() {

    char[] receivedChars = receivedString.toUpperCase().toCharArray();
    String alphabetList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char space=' ';
    StringBuilder encryptedText = new StringBuilder();
      for (char receivedChar : receivedChars) {
          if (receivedChar == space) {
              encryptedText.append(space);
          } else {
              int cIndex = alphabetList.indexOf(receivedChar);
              int encryptedIndex = (cIndex + encryptKey) % 26;
              char encryptedLetter = alphabetList.charAt(encryptedIndex);
              encryptedText.append(encryptedLetter);

          }
      }
    return encryptedText.toString();
  }
};