public class DollHouseSingleton {

  private String navn;
  private static DollHouseSingleton instance;

  private DollHouseSingleton() {
    this.navn = "Dukkehuset i Århus";
  }

  public static DollHouseSingleton getInstance() {
    if (DollHouseSingleton.instance == null) {
      DollHouseSingleton instance = new DollHouseSingleton();
    }
    return DollHouseSingleton.instance;
  }
}