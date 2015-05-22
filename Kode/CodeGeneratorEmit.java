public class CodeGenerator extends ScopeDepthFirstAdapter{
    
  // Udeladt: overskrivelser af superklassens metoder
    
  public void Emit(String s, boolean instruction){
    if (instruction == true) { // Write to InstructionList, if instruction
      instructionWriter.println(s);
    } 
    else { // Otherwise it's a symbol, then write to SymbolList
      symbolWriter.println(s);
    }
  }
}