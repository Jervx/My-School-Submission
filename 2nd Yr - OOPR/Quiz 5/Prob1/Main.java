import java.util.*;

class Main{

    public static void main(String [] jervx){
        Scanner in = new Scanner(System.in);

        List <Integer> numbirsXD = new LinkedList<Integer>();   

        int n = in.nextInt();
        for(int x = 0; x < n; x++) numbirsXD.add(in.nextInt());

        Collections.sort(numbirsXD);

        int hanapinXD = in.nextInt();
        int ilanBesesBaKitaHinanap = 0, kaliwaXD = 0, kananXD = n - 1, nahanapKitaDito = -1;

        while(kaliwaXD <= kananXD){
            ilanBesesBaKitaHinanap++;
            int gitnaXD = kaliwaXD + (kananXD - kaliwaXD) / 2;
            if(hanapinXD == numbirsXD.get(gitnaXD)){
                nahanapKitaDito = gitnaXD;
                break;
            }
            if (hanapinXD < numbirsXD.get(gitnaXD)) kananXD = gitnaXD - 1;
            else kaliwaXD = gitnaXD + 1; 
        }

        Iterator it = numbirsXD.iterator();
        while(it.hasNext()) System.out.print(it.next()+" ");

        System.out.printf("\n%d%s",ilanBesesBaKitaHinanap,nahanapKitaDito==-1?" NOT FOUND":" FOUND");
    }
}