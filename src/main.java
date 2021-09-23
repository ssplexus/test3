public class main
{
    public static void main(String[] args)
    {
        Alphabet alphabet = new Alphabet();
        alphabet.setLetter('a',10);
        alphabet.setLetter('c',15);
        alphabet.setLetter('d',7);
        System.out.println(alphabet.getLetter('c'));
        System.out.println(alphabet.getSum());
    }
}
