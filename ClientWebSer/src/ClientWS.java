import ws.*;

import ws.BanqueService;
import ws.Compte;
import ws.BanqueWS;

import java.util.List;

public class ClientWS {
    public static void main(String [] args){

        BanqueService webS=new BanqueWS().getBanqueServicePort();
        System.out.println(webS.conversionEuroToDH(800));
        Compte cp=webS.getCompte(2L);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        List<Compte> cptes=webS.listCompte();
        cptes.forEach(c->{
            System.out.println("---------------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
        });



    }
}
