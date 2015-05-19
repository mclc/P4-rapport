public class ForIteration extends ScannerTest {
    @Test
    public void forIteration() throws ParserException, IOException, LexerException {
        checkCode("void run() { for (i = 0; i < 10; i++) { } }");
    }

    @Test // Test 1
    public void forIterationWithoutParams() throws ParserException, IOException, LexerException {
        checkCode("void run() { for (;;) { } }");
    }

    @Test(expected = ParserException.class) // Test2
    // Check that loops can't exist outside a function
    public void forIterationInRoot() throws ParserException, IOException, LexerException {
        checkCode("for (;;) { }");
    }
}