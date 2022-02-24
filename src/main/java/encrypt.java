

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
    String encryptedText = "";

      for (int i = 0; i<receivedChars.length; i++) {
          if(receivedChars[i]==' '){
              encryptedText+=' ';
          }
          else{
              int charIndex = alphabetList.indexOf(receivedChars[i]);
              int encryptedIndex = (charIndex + encryptKey) % 26;
              char encryptedLetter = alphabetList.charAt(encryptedIndex);
              encryptedText=encryptedText+encryptedLetter;
          }
      }

    return encryptedText;
  }
};