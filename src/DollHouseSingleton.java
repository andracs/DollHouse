public class DollHouseSingleton {

  private String navn;
  private static DollHouseSingleton instance;

  private DollHouseSingleton() {
    this.navn = "Dukkehuset i Århus";
  }

  public  DollHouseSingleton getInstance() {
    if (this.instance==null) {
      DollHouseSingleton instance = new DollHouseSingleton();
    }
  return this.instance;
  }
}