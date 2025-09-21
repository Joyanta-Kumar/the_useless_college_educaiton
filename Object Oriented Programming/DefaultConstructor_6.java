class Unix {
  String distroName;
  String architecture;

  void advertise()
  {
    String message = "Distro: %s\nArchitecture: %s";
    System.out.println(String.format(message , distroName, architecture));
  }
}

public class DefaultConstructor_6 {
  public static void main(String[] args) {
    Unix myUnix = new Unix();
    myUnix.distroName = "Arch";
    myUnix.architecture = "x86-64";
    myUnix.advertise();
  }

}
