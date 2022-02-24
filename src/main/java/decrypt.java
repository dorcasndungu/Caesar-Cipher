public class decrypt {
    public decrypt(String receivedString, Integer decryptKey) {
        this.receivedString = receivedString;
        this.decryptKey = decryptKey;
    }

    private String receivedString;

    public String getReceivedString() {
        return receivedString;
    }

    public void setReceivedString(String receivedString) {
        this.receivedString = receivedString;
    }

    private Integer decryptKey;

    public Integer getDecryptKey() {
        return decryptKey;
    }

    public void setDecryptKey(Integer decryptKey) {
        this.decryptKey = decryptKey;
    }
    public boolean validReceivedString(){
        char[] validateReceivedChars = receivedString.toCharArray();
        boolean numberFlag = true;
        for(char c:validateReceivedChars){
            if( Character.isDigit(c)){
                numberFlag=false;
            }
        }
        return  numberFlag;
    };

    public boolean validKey(){
        boolean validKey = false;
        if(decryptKey>0 && decryptKey<=25){
            validKey= true;
        }
        return validKey;
    }

    public String decryption() {

        char[] receivedChars = receivedString.toUpperCase().toCharArray();
        String alphabetList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String decryptedText = "";
        int negativeDecryptedIndex=26;
        for (Integer i=0;i<receivedChars.length;i++) {
            int cIndex = alphabetList.indexOf(receivedChars[i]);
            int differenceIndex=(cIndex - decryptKey);
            int decryptedIndex = (differenceIndex % 26);
            //when decryptedIndex is a negative number
            if(decryptedIndex<0){
                negativeDecryptedIndex += decryptedIndex;
                decryptedIndex=negativeDecryptedIndex;
            }
            char decryptedLetter = alphabetList.charAt(decryptedIndex);
            decryptedText=decryptedText+decryptedLetter;
        }

        return decryptedText;
    }

}
