public class Cell {
  private long value;

  public Cell(long value) {
    this.value = value;
  }

  public synchronized long getValue() {
    return value;
  }

  public synchronized void setValue(long value) {
    this.value = value;
  }

  public synchronized void swapValue(Cell other) {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    long temp = getValue();
    long newValue = other.getValue();
    setValue(newValue);
    other.setValue(temp);
  }

  @Override
  public String toString() {
    return String.valueOf(getValue());
  }
}
