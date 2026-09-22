public class Main {

    public static void main(String[] args) {
        // Single-dimensional array for month labels
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};

        // Two-dimensional array to store makeover data:
        // Rows: Months (JAN to JUN), Columns: [Bathrooms, Kitchens, Garden]
        int[][] makeoverData = {
                {8, 2, 5}, // JAN
                {7, 4, 5}, // FEB
                {5, 5, 2}, // MAR
                {2, 2, 3}, // APR
                {7, 7, 9}, // MAY
                {7, 8, 5}  // JUN
        };

        // Header printout
        System.out.println("--------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-12s%-12s%-12s%-12s%n", "", "Bathrooms", "Kitchens", "Garden");

        // Display individual job counts per month
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-12s%-12d%-12d%-12d%n",
                    months[i],
                    makeoverData[i][0],
                    makeoverData[i][1],
                    makeoverData[i][2]);
        }

        // Section separator
        System.out.println("--------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("--------------------------------------------------");

        // Calculate and display monthly totals with star condition
        for (int i = 0; i < months.length; i++) {
            int total = 0;
            for (int j = 0; j < makeoverData[i].length; j++) {
                total += makeoverData[i][j];
            }

            // Append "***" if total is 15 or greater
            String starRating = (total >= 15) ? "***" : "";

            System.out.printf("%-12s%-12d%s%n", months[i], total, starRating);
        }

        System.out.println("--------------------------------------------------");
    }
}