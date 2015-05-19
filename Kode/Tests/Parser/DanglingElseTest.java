@Test
public void danglingIfElseCheck() {
    Node node = getNode(/* Kode fra eksempel */);

    // Find first function
    AFunctionRootDeclaration function = getFunction(node);

    // Find if statement
    ABranchStatement ifStatement = (ABranchStatement) function.getStatements().getFirst();

    // Get if-else statement
    ABranchStatement ifElseStatement = (ABranchStatement) ifStatement.getLeft();

    Assert.assertEquals(true, ifStatement.getRight() == null);
    Assert.assertEquals(false, ifElseStatement.getRight() == null);
}