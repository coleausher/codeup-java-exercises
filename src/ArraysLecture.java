import java.util.Arrays;



public class ArraysLecture {
    public static void main(String[] args) {

        double[] prices;
        prices = new double[4];
        // setting the array to 4 so no more than 4 items 0,1,2,3 can be in the array otherwise will get an error

        prices[0] = 12.50;
        prices[1] = 3.14;
        prices[2] = 25.20;
        prices[3] = 1.99;
        // prices[4] = 33.33; will return an error of indexoutofbounds due to being more than the specified spots in the array declared above

        String[] names1 = {"Nikki", "Cole", "Johnny"};
        String[] names = {"Nikki", "Cole", "Johnny"};

        // will get the length of the array ie. 4
        System.out.println(prices.length);
        // printing out just te array name won't give the values
        System.out.println(prices);
        // must do a for loop in order to print out each index in the array
        for(int i = 0; i < prices.length; i ++){
            System.out.println(prices[i]);
        }

// HERE did not specify the amount of indexes in the array like before. just set the values in the variable 'names' and set length of the array with the number of values in the array.
        System.out.println(names.length);
        for(int i = 0; i < names.length; i ++){
            System.out.println(names[i]);
        }
        // for each loop for displaying the values or indexes of the array
        for (String name : names){
            System.out.println(name);
        }

        // .fill replaces or initiates the values or indexes in the array specified and then the value you want to set the values to
        Arrays.fill(prices, 0.00);
        // for loop to  iterate and print each index in the array
        for(int i = 0; i < prices.length; i ++){
            System.out.println(prices[i]);
        }

        // .equals to see if two arrays the same
        System.out.println(Arrays.equals(names1, names));

        // .copyOf
        System.out.println(Arrays.copyOf(prices, 4));

        // .toString
        System.out.println(Arrays.toString(prices));

        // .sort
       Arrays.sort(names1);

// Two Dimensional Arrays called by two square brackets =====  int[]'rows' []'columns' arrayName
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 2, 3}
        };

// access the first element in the second row
        System.out.println(matrix[1][0]); // 4
// the last element in the first row
        System.out.println(matrix[0][2]); // 3
// the first element in the last row
        System.out.println(matrix[2][0]); // 7

    // for loop through the two-dimensional array first loop is for rows and second is for columns
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix.length; column++){
                System.out.println(matrix[row][column]);
            }
        }

    }
}
