package org.example.Dao;

import org.springframework.stereotype.Repository;

@Repository("mongodb")
public class DaoMongoDb implements  IDao{
    @Override
    public double getadata() {
        System.out.println("this is a MongoDb version");
        return 20;
    }
}
