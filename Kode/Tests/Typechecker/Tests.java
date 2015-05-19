@Test(expected = IncompaitbleTypesException.class) // Test 1
public void checkDecimalSetToBool() {
    checkCode("float f = true;");
}

@Test // Test 2
public void checkIntDecimalComparisonGreater() {
    checkCode("bool b = 1 > 1.1;");
}

@Test(expected = ReturnExprInVoidException.class) // Test 3
public void checkReturnInVoidFunction() {
    checkCode("void func(){ return 2; }");
}

@Test(expected = MissingReturnStatementException.class) // Test 4
public void checkMissingReturnStatement() {
    checkCode("int func(){}");
}

@Test(expected = WrongParameterTypeException.class) // Test 5
public void checkWrongParameterInFunction() {
    checkCode("int func(int k, int p){ func(2.2, 2); return k + p; } ");
}

@Test(expected = RedefinitionOfConstException.class) // Test 6
public void checkAssignmentOfConstInFunction() {
    checkCode("const int i = 7; i = 2");
}