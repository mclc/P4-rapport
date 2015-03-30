double foo(int count){
  double sum = 0.0;
   
  for(int i = 0; i < count; i++){
    sum += i/2.0;
  }
  return sum;
}