@Test
void isValidUsername_returnsFalse_whenShortUsername() {
    
    // Enter a username that is too short
    String username = "ab";
    boolean actual = UsernameValidator.isValidUsername(username);
    assertFalse(actual);
}

@Test

   
    void isValidUsername_returnsFalse_whenNull() {
    String username = null;
    // Pass the username to isValidUsername 
    
    boolean actual = UsernameValidator.isValidUsername(username);
    // Verify the username is invalid
    assertFalse(actual);
}
