package app.kudzy;

import app.kudzy.model.Fabonacci;
import app.kudzy.model.ReverseString;
import app.kudzy.service.FabonacciServiceImpl;
import app.kudzy.service.PrintManager;
import app.kudzy.service.ReverseStringServiceImpl;

public class Main {
    static PrintManager pm =new PrintManager();
    static ReverseString rs = new ReverseString();
    static Fabonacci fb =new Fabonacci<>();
    public static void main(String[] args) {

        pm.printLine();
        pm.printMessage("Select te option as per Number . \r\n 1. Reverse String \n 2. Fabonacci sequesnce");
        chooseOption(pm.readInput());

    }
    public static void chooseOption(String strIn) {
        int inInt=Integer.parseInt(strIn);
        if(inInt>0&& inInt<3){
            switch (inInt){
                case 1:
                    pm.printMessage("Type your string / sentance to be reversed.");
                    rs.setInStr(pm.readInput());
                    ReverseStringServiceImpl rssi=new ReverseStringServiceImpl();

                    //readInput();
                    pm.printMessage(rssi.reverseString(rs.getInStr()));

                    pm.printLine();
                    pm.printMessage("Thank you very much for the oppoortunity");
                    pm.printLine();
                    break;
                case 2:
                    pm.printMessage("Enter the maximum number of number.");
                    String str=pm.readInput();
                    boolean isValidStr = str.trim().matches("[^0-9]");
                    /*System.out.println("isValidStr"+isValidStr);
                    if(isValidStr){
                        fb.setMaxNumber(Integer.parseInt(str));
                        FabonacciServiceImpl fbsi = new FabonacciServiceImpl();
                        pm.printMessage(fbsi.fabonacciSequenceCreator(fb.getMaxNumber()));
                    } else{
                      pm.printMessage("Kindly enter a number only without a comma and no string allowed " + str);
                    }*/
                    fb.setMaxNumber(Integer.parseInt(str));
                    FabonacciServiceImpl fbsi = new FabonacciServiceImpl();
                    pm.printMessage(fbsi.fabonacciSequenceCreator(fb.getMaxNumber()));
                    pm.printLine();
                    pm.printMessage("Thank you very much for the oppoortunity");
                    pm.printLine();
                    break;
            }
        }
    }
}