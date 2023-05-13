package j11_arrays.recordCounter;

public class Main {
    public static void main(String[] args) {
        String[] records = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};

        int win = 0;
        int loss = 0;

        for (int i = 0; i < records.length; i++) {
            if (records[i].equals("WIN")) {
                win++;
            } else {
                loss++;
            }
        }

        System.out.println("\nwith a professional record of " + win + " wins and " + loss + " losses");
    }
}
