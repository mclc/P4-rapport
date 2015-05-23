public class Stack{

  // 

  public void push(int value){
    stackPointerIncrement();
    generator.Emit("MOVL &" + value + " " + stackPointer(), true);
  }
  
  public void push(float value){
    stackPointerIncrement();
    generator.Emit("+F +0,0 +" + value.toString().replace(".", ",") + " " + stackPointer() + "", true);
  }
  
  public void push(String value){
    stackPointerIncrement();
    generator.Emit("MOVL " + value + " " + stackPointer(), true);
  }
  
  public void push(Boolean value){
    stackPointerIncrement();
    if ((Boolean)value)
      generator.Emit("SET " + stackPointer() + ".00", true);
    else
      generator.Emit("RSET " + stackPointer() + ".00", true);
  }
  
  //
  
}