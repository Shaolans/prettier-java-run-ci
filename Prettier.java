public class Prettier {

  public boolean prettierIsAwesome(
    int myFirstArgument,
    int mySecondArgument,
    int myThirdArgument,
    int myFourthArgument,
    int myFifthArgument
  ) {
    if (
      myFirstArgument == 1 &&
      mySecondArgument == 2 &&
      myThirdArgument == 3 &&
      myFourthArgument == 4 &&
      myFifthArgument == 5
    ) {
      return true;
    }

    // if do not want to format the next expression
    // prettier-ignore
    if(myFirstArgument == 1 && mySecondArgument == 1 && myThirdArgument == 1 && myFourthArgument == 1 && myFifthArgument == 1) {
      return true;
    }

    MyObject mo = new MyObject();
    return mo
      .very()
      .very()
      .very()
      .very()
      .very()
      .very()
      .very()
      .very()
      .very()
      .very()
      .very()
      .very()
      .very()
      .longMethod();
  }
}
