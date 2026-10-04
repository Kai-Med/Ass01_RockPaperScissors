void main() {
    System.out.println("Player A, please enter your choice (R for Rock, P for Paper, S for Scissors):");
    Scanner input = new Scanner(System.in);
    String R = "R";
    String P = "P";
    String S = "S";
    String choice = input.nextLine();
    if (choice.equals(R)) {
        System.out.println("Player A chose Rock.");
    } else if (choice.equals(P)) {
        System.out.println("Player A chose Paper.");
    } else if (choice.equals(S)) {
        System.out.println("Player A chose Scissors.");
    } else {
        System.out.println("Invalid input. Please enter R, P, or S.");
        main();
    }
    System.out.println("Player B, please enter your choice (R for Rock, P for Paper, S for Scissors):");
    Scanner input2 = new Scanner(System.in);
    String choice2 = input2.nextLine();

    if (choice2.equals(R)) {
        System.out.println("Player B chose Rock.");
    } else if (choice2.equals(P)) {
        System.out.println("Player B chose Paper.");
    } else if (choice2.equals(S)) {
        System.out.println("Player B chose Scissors.");
    } else {
        while (!choice2.equals(R) && !choice2.equals(S) && !choice2.equals(P)) {
            System.out.println("Invalid input. Please enter R, P, or S.");
            System.out.println("Player B, please enter your choice (R for Rock, P for Paper, S for Scissors):");
            choice2 = input2.nextLine();
        }
    }
        if (choice.equals(R) && choice2.equals(S)) {
            System.out.println("Player A wins!");
        } else if (choice.equals(P) && choice2.equals(R)) {
            System.out.println("Player A wins!");
        } else if (choice2.equals(R) && choice.equals(S)) {
            System.out.println("Player B wins!");
        } else if (choice2.equals(P) && choice.equals(R)) {
            System.out.println("Player B wins!");
        } else if (choice.equals(S) && choice2.equals(P)) {
            System.out.println("Player A wins!");
        } else if (choice2.equals(S) && choice.equals(P)) {
            System.out.println("Player B wins!");
        } else {
            System.out.println("It's a tie!");
        }
        System.out.println("Would you like to play again? (Y/N)");
        String playAgain = input.nextLine();
        if (playAgain.equals("Y")) {
            main();
        } else {
            System.out.println("Thanks for playing!");
        }
    }

