public class Scanner {
    // Helper classes uncommented

    public Token read() {
        // Check if we reached the end
        if (m_next == m_end)
            return null;

        // Skip whiltespaces
        skipWhitespace();

        // Scan token
        Token token = null;
        if (m_input.startsWith(";", m_next)) {
            token = new Token(TokenType.semi, m_input.substring(m_next, ++m_next));
        } else if (m_input.startsWith("==", m_next)) {
            token = new Token(TokenType.equals_operator, m_input.substring(m_next, m_next += 2));
        } else if (m_input.startsWith("!=", m_next)) {
            token = new Token(TokenType.not_equals_operator, m_input.substring(m_next, m_next += 2));
        } else if (m_input.startsWith("&&", m_next)) {
            token = new Token(TokenType.and_operator, m_input.substring(m_next, m_next += 2));
        } else if (Character.isDigit(m_input.charAt(m_next))) {
            // Etc...
        }
        // Etc... (repeated code)

        return token;
    }
    
    // Helper function uncommented

}