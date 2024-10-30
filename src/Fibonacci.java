public class Fibonacci {
    public static void main(String[] args) throws Exception {
        int firstArg = 0;
        int i;
        int temp1;
        int temp2;
        int locatedNumber = 0;
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        if (firstArg == 0){
            locatedNumber = 0;
        }else if (firstArg == 1) {
            locatedNumber = 1;
        } else if (firstArg > 1) {
            temp1 = 0;
            temp2 = 1;
            for (i = 1; i < firstArg; i++){
                locatedNumber = temp1 + temp2;
                temp1 = temp2;
                temp2 = locatedNumber;
            }  
        } else {
            System.out.println("error");
        }

        System.out.println(locatedNumber);

    }
}
