package ma.enset;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Conversion")
    public double conversion(@WebParam(name = "montant")double mt){
        return mt*11.3;
    }
    @WebMethod 
    public Compte getCompte(int code){
        return  new Compte(code, Math.random()*6500, new Date());
    }
    public List<Compte> compteList(){
        List<Compte> comptes=new ArrayList<>();
                Compte c1=new Compte(1,Math.random()*6500, new Date());
                Compte c2=new Compte(2,Math.random()*6500, new Date());
                Compte c3=new Compte(3,Math.random()*6500, new Date());
                comptes.add(c1);
                comptes.add(c2);
                comptes.add(c3);
                return comptes;
    }
}
