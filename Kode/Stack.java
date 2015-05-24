public < T > void push(T value)
{
  if(stackPointer <= 510){
    stackPointerIncrement();
    if (value.getClass() == Integer.class)
      generator.Emit("MOVL(498) &" + value + " " + stackPointer(), true);
    else if (value.getClass() == Float.class)
      generator.Emit("+F(454) +0,0 +" + value.toString().replace(".", ",") + " " + stackPointer() + "", true);
    else if (value.getClass() == String.class)
      generator.Emit("MOVL(498) " + value + " " + stackPointer(), true);
    else if (value.getClass() == Boolean.class){
      if ((Boolean)value)
        generator.Emit("SET " + stackPointer() + ".00", true);
      else
        generator.Emit("RSET " + stackPointer() + ".00", true);
    }
  else
    throw new NotImplementedException();
  } 
  else
    throw new OutOfMemoryError();
}