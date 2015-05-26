public final class Start extends Node
{
  @Override
  public void apply(Switch sw)
  {
    ((Analysis) sw).caseStart(this);
  }
}

public final class AProgram extends PProgram
{
  @Override
  public void apply(Switch sw)
  {
    ((Analysis) sw).caseAProgram(this);
  }
}