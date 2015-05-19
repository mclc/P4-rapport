@Test(expected = SymbolNotFoundException.class)
public void errorOnNonDeclaredVariable() {
    checkCode("int func() { i = 1; }");
}

@Test
public void canAssignToDeclaredVariableInParentScope() {
    checkCode("int i; int func() { i = 3; }");
}