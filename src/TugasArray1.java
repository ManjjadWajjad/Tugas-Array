public class TugasArray1 {
    public static void main(String[] args) {

        Object dataArray [] = {1, 2, 4, 10, 20, "Rizwan", "Iko", "Ikok"};

        StringBuilder arrayNumber = new StringBuilder();
        StringBuilder arrayText = new StringBuilder();

        for (Object item : dataArray) {

            if (item instanceof Integer) {
                arrayNumber.append(item).append(",");
            }

            else if (item instanceof String) {
                arrayText.append(item).append(",");
            }
        }

        String arrayTextResult = arrayText.toString().trim();
        if (arrayTextResult.endsWith(",")) {
            arrayTextResult = arrayTextResult.substring(0, arrayTextResult.length() - 1);
        }

        String arrayNumberResult = arrayNumber.toString().trim();
        if (arrayNumberResult.endsWith(",")) {
            arrayNumberResult = arrayNumberResult.substring(0, arrayNumberResult.length() - 1);
        }

        System.out.println("Array Text adalah : " + arrayTextResult);
        System.out.println("Array Number adalah : " + arrayNumberResult);
    }
}