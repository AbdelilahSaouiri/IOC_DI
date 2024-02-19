package org.example.Dao;

import org.springframework.stereotype.Repository;


@Repository("xml")
public class DaoImplXML implements IDao{


    @Override
    public double getadata() {
        System.out.println("this is a XML Version");
        return 10;
    }
}
