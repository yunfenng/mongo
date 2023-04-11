package com.lagou.test;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @Author: Jaa
 * @Date: 2023/4/10 19:02
 * @Description:
 */
public class DocumentInsertTest {

    public static void main(String[] args) {
        // 连接MongoDB
        MongoClient mongoClient = new MongoClient("139.224.227.87", 37017);
        // 获取数据库对象
        MongoDatabase mongoDatabase = mongoClient.getDatabase("lg_resume");
        // 获取集合对象
        MongoCollection<Document> collection = mongoDatabase.getCollection("lg_resume_preview");
        // 构建Document对象
        Document document = Document.parse("{name:'Tom', city:'北京', birthday:new ISODate('1995-04-01'), expectSalary:18000}");
        collection.insertOne(document);
        mongoClient.close();
    }
}
