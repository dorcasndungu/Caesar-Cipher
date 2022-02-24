import org.junit.Test;

import static org.junit.Assert.*;

public class decryptTest {
    @Test
    public void instanceofDecrypt() {
        decrypt test=new decrypt("dorcas",2);
        assertEquals(true,test instanceof decrypt);
    }

    @Test
    public void getString_string() {
        decrypt test=new decrypt("dorcas",2);
        assertEquals("dorcas",test.getReceivedString());
    }

    @Test
    public void validateString_true() {
        decrypt decrypt=new decrypt("dorcas",2);
        assertEquals(true,decrypt.validReceivedString());
    }

    @Test
    public void validateKey_true() {
        decrypt decrypt=new decrypt("dorcas",2);
        assertEquals(true,decrypt.validKey());
    }

    @Test
    public void decryptionWorks() {
        decrypt decrypt=new decrypt("CPKOCN rs",2);
        assertEquals("ANIMAL PQ",decrypt.decryption());
    }

}