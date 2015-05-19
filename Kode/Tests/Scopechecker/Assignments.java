@Test(expected = SymbolNotFoundException.class) // Test 1
public void errorOnNonDeclaredVariable() {
    checkCode("int func() { i = 1; }");
}

@Test // Test 2
public void canAssignToDeclaredVariableInParentScope() {
    checkCode("int i; int func() { i = 3; }");
}

@Test // Test 3
public void canCallFunctionBelow() {
    checkCode("int func() { int i = func2(); }" +
              "int func2() { int i = func(); }");
}