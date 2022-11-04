public class Main {
    public static void main(String[] args) {
       Boy boy = new Boy();
       boy.setFullName("Kanat");
       boy.setAge(18);
       boy.setCondition(1);

        Boy boy1 = new Boy();
        boy1.setFullName("Asan");
        boy1.setAge(16);
        boy1.setCondition(2);

        Boy boy2 = new Boy();
        boy2.setFullName("Baitik");
        boy2.setAge(19);
        boy2.setCondition(3);
        Boy [] boys = {boy,boy1,boy2};
        for (Boy massive:boys) {
            System.out.println(getInfo(massive.getAge(),massive.getCondition())+" "+massive.getFullName());
        }



    }public static String getInfo(int boyAge, int boyCondition){
      if (boyAge>=18 && boyCondition==1){
          System.out.print("Univerde okup jatat");
      } else if (boyAge>=18 && boyCondition==3) {
          System.out.print("Armiiaga baryshyn kerek");
      }else {
          System.out.print("Jashy jete elek");

      }
        return "<== Boy condition";
    }

}