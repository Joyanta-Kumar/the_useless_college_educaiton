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
    System.out.println(String.format(message , distroName, architecture));
  }
}

public class BasicJava_1 {
  public static void main(String[] args) {
    Unix myUnix = new Unix("Arch", "x86-64");
    myUnix.advertise();
  }

}
