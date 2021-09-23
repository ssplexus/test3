class Alphabet{

    final private int MAX = 26;
    private int letters_arr[];

    public Alphabet()
    {
        letters_arr = new int[MAX];
    }

    public void setLetter(char _letter, int _val)
    {
        switch (_letter)
        {
            case 'a':
                letters_arr[0] = _val;
                break;
            case 'b':
                letters_arr[1] = _val;
                break;
            case 'c':
                letters_arr[2] = _val;
                break;
            case 'd':
                letters_arr[3] = _val;
                break;
            case 'e':
                letters_arr[4] = _val;
                break;
            case 'f':
                letters_arr[5] = _val;
                break;
            case 'g':
                letters_arr[6] = _val;
                break;
            case 'h':
                letters_arr[7] = _val;
                break;
            case 'i':
                letters_arr[8] = _val;
                break;
            case 'j':
                letters_arr[9] = _val;
                break;
            case 'k':
                letters_arr[10] = _val;
                break;
            case 'l':
                letters_arr[11] = _val;
                break;
            case 'm':
                letters_arr[12] = _val;
                break;
            case 'n':
                letters_arr[13] = _val;
                break;
            case 'o':
                letters_arr[14] = _val;
                break;
            case 'p':
                letters_arr[15] = _val;
                break;
            case 'q':
                letters_arr[16] = _val;
                break;
            case 'r':
                letters_arr[17] = _val;
                break;
            case 's':
                letters_arr[18] = _val;
                break;
            case 't':
                letters_arr[19] = _val;
                break;
            case 'u':
                letters_arr[20] = _val;
                break;
            case 'v':
                letters_arr[21] = _val;
                break;
            case 'w':
                letters_arr[22] = _val;
                break;
            case 'x':
                letters_arr[23] = _val;
                break;
            case 'y':
                letters_arr[24] = _val;
                break;
            case 'z':
                letters_arr[25] = _val;
                break;
            default:
                System.out.println("Wrong character!");
        }
    }

    public int getLetter(char _letter)
    {
        int val = 0;
        switch (_letter)
        {
            case 'a':
                val = letters_arr[0];
                break;
            case 'b':
                val = letters_arr[1];
                break;
            case 'c':
                val = letters_arr[2];
                break;
            case 'd':
                val = letters_arr[3];
                break;
            case 'e':
                val = letters_arr[4];
                break;
            case 'f':
                val = letters_arr[5];
                break;
            case 'g':
                val = letters_arr[6];
                break;
            case 'h':
                val = letters_arr[7];
                break;
            case 'i':
                val = letters_arr[8];
                break;
            case 'j':
                val = letters_arr[9];
                break;
            case 'k':
                val = letters_arr[10];
                break;
            case 'l':
                val = letters_arr[11];
                break;
            case 'm':
                val = letters_arr[12];
                break;
            case 'n':
                val = letters_arr[13];
                break;
            case 'o':
                val = letters_arr[14];
                break;
            case 'p':
                val = letters_arr[15];
                break;
            case 'q':
                val = letters_arr[16];
                break;
            case 'r':
                val = letters_arr[17];
                break;
            case 's':
                val = letters_arr[18];
                break;
            case 't':
                val = letters_arr[19];
                break;
            case 'u':
                val = letters_arr[20];
                break;
            case 'v':
                val = letters_arr[21];
                break;
            case 'w':
                val = letters_arr[22];
                break;
            case 'x':
                val = letters_arr[23];
                break;
            case 'y':
                val = letters_arr[24];
                break;
            case 'z':
                val = letters_arr[25];
                break;
            default:
                System.out.println("Wrong character!");
        }
        return val;
    }

    public int getSum()
    {
        int sum = 0;
        for (int l: letters_arr)
        {
            sum += l;
        }
        return  sum;
    }
}