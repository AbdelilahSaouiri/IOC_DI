package org.example.Metier;

import org.example.Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MetierImpl implements IMetier{


    private IDao dao;


    public MetierImpl(@Qualifier("mongodb") IDao dao)
    {
        this.dao=dao;
    }

//    public void setDao(IDao dao){
//        this.dao=dao;
//    }

    @Override
    public double calculer() {

        return dao.getadata()*2;
    }

}
