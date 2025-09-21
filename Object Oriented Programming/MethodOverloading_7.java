class Unix {
  String distroName;
  String architecture;

  Unix(String distroName, String architecture) {
    this.distroName = distroName;
    this.architecture = architecture;
  }

  void advertise()
  {
    String message = "Distro: %s\nArchitecture: %s";
    System.out.println(String.format(message , this.distroName, this.architecture));
  }
  void advertise(boolean minimal)
  {
    if (minimal) {
      System.out.println(String.format("%s %s", this.distroName, this.architecture));
    }
    else {
      advertise();
    }
  }
}

public class MethodOverloading_7 {
  public static void main(String[] args) {
    Unix myUnix = new Unix("Arch", "x86-64");
    myUnix.advertise(true);
  }

}
