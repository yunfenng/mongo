package com.lagou.test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @Author: Jaa
 * @Date: 2023/4/10 19:02
 * @Description:
 */
public class DocumentFindTest {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("139.224.227.87", 37017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("lg_resume");
        MongoCollection<Document> collection = mongoDatabase.getCollection("lg_resume_preview");
        // 根据 expectSalary 降序排列
        Document sortDocument = new Document();
        sortDocument.append("expectSalary", -1);
        FindIterable<Document> findIterable = collection.find().sort(sortDocument);
        for (Document document : findIterable) {
            System.out.println(document);
        }
        mongoClient.close();
    }
}
