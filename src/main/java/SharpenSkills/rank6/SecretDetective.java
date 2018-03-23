package SharpenSkills.rank6;

/**
 * Created by a.shipulin on 23.03.18.
 */
public class SecretDetective {

    public String recoverSecret(char[][] triplets) {
        StringBuffer res = new StringBuffer("");
        boolean isExist = false;
        int ii, jj;
        for (int i = 0; i < triplets.length; i++) {
            for (int j = 0; j < triplets[i].length; j++) {
                System.out.println("вставляем " + triplets[i][j]);
                //расставляем буквы
                if (res.length() == 0) {
                    isExist = false;
                }
                for (int k = 0; k < res.length(); k++) {
                    // смотрим, есть ли в списке уже такая буква
                    if (res.charAt(k) == triplets[i][j]) {
                        isExist = true;
                    } else {
                        isExist = false;
                        ii = i;
                        jj = j;
                    }
                }

                System.out.println("==> " + triplets[i][j] + " isExist=" + isExist);
                if (isExist == false) {
                    int positionLetterBefore = 0;
                    int positionLetterAfter = 0;
                    char LetterAfter;
                    char LetterBefore;
                    StringBuffer newRes = new StringBuffer("");
                    if(i==0) {
                        res.append(triplets[i][j]);
                        continue;
                    }
                    // вставляем в res в соответствии с заданным правилом
                    if(j==0 || j == 1) {
                        LetterBefore = triplets[i][j+1];
                        positionLetterBefore = 0;
                        System.out.println("LetterBefore=" + LetterBefore);
                        while(positionLetterBefore < res.length()) {
                            System.out.println("while1");
                            if(res.charAt(positionLetterBefore) != LetterBefore) {
                                positionLetterBefore++;
                            }
                        }
                        System.out.println("PositionLetterBefore=" + positionLetterBefore);
                        newRes.append(res.substring(0, positionLetterBefore));
                        newRes.append(triplets[i][j]);
                        newRes.append(res.substring(positionLetterBefore, res.length()));
                        res = newRes;
                    }

                    else {
                        LetterAfter = triplets[i][j];
                        System.out.println("LetterAfter=" + LetterAfter);

                        while(positionLetterAfter < res.length()) {
                            System.out.println("while2");
                            if(res.charAt(positionLetterBefore) != LetterAfter) {
                                positionLetterAfter++;
                            }
                        }
                        newRes.append(res.substring(0, positionLetterBefore));
                        newRes.append(triplets[i][j]);
                        newRes.append(res.substring(positionLetterBefore, res.length()));
                        res = newRes;
                    }
                }

                System.out.println(" ==> res = " + res);
            }
        }


        return new String("YES");

    }


    public static void main(String[] args) {
        SecretDetective detective = new SecretDetective();
        char[][] triplets = {
                {'t', 'u', 'p'},
                {'w', 'h', 'i'},
                {'t', 's', 'u'},
                {'a', 't', 's'},
                {'h', 'a', 'p'},
                {'t', 'i', 's'},
                {'w', 'h', 's'}
        };

        detective.recoverSecret(triplets);
    }


}

class LinkList {
    private List first;

    public void insert(char c) {
        List newList = new List(c);
        List current = first;
        List next;
        while (current.next != null) {
            next = current.next;
            /*if (current.Letter < newList.Letter && newList) {

            }*/
        }

    }
}

class List {
    char Letter;
    List next;

    public List(char letter) {
        Letter = letter;
        next = null;
    }

}