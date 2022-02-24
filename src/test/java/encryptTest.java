import org.junit.Test;

import static org.junit.Assert.*;
public class encryptTest{

    @Test
    public void instanceofEncrypt() {
        encrypt test=new encrypt("dorcas",2);
        assertEquals(true,test instanceof encrypt);
    }

    @Test
    public void getString_string() {
        encrypt test=new encrypt("dorcas",2);
        assertEquals("dorcas",test.getReceivedString());
    }

    @Test
    public void validateString_true() {
        encrypt encrypt=new encrypt("dorcas",2);
        assertEquals(true,encrypt.validReceivedString());
    }

    @Test
    public void validateKey_true() {
        encrypt encrypt=new encrypt("dorcas",6);
        assertEquals(true,encrypt.validKey());
    }

    @Test
    public void encryptionWorks() {
            encrypt encrypt=new encrypt("ANIMAL",2);
            assertEquals("CPKOCN",encrypt.encryption());
            }



};
