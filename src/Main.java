public class Main {
    public static void main(String[] args) {

        String str = "Hippopotam is hungury";
        char[] arr = new char[30];

        str.getChars(0, 10, arr, 0);
        /*
        *
srcBegin – индекс первого символа в строке для копирования;от какого символа вырезаешь из строки str
srcEnd – индекс последнего символа в строке для копирования;до какого символа вырезаешь из строки str
dst – массива назначения; в какой массив символов складываешь, в данном случае arr
dstBegin – начальное смещение в массиве назначения. с какой позиции в массиве arr складываешь символы из str*/
        for (char ch :
                arr) {
            if (ch != '\u0000') System.out.print(ch);

        }

    }
}