package c2stage_20220503.ccc188xml_search;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc188xml_search
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-14-37  星期二
 */
public class ccc001 {

    @Test
    public void show() throws Exception {
        SAXReader x = new SAXReader();
        // Document doc = x.read(new File("src/c2stage_20220503/ccc188xml_search/ccc004Contacts2.xml"));
        Document doc = x.read(ccc001.class.getResourceAsStream("ccc004Contacts2.xml"));
        System.out.println(doc);
        List<Node> nodes = doc.selectNodes("./contactList/contact/name");
        // for (Node node : nodes) {
        //     // 本质上，这里的node都是节点的意思
        //     // 因此可以进行强转操作
        //     Element node1 = (Element) node;
        //     System.out.println(node1.getTextTrim());// 获取内部的变量名
        // }
    }

    @Test
    public void show2() throws DocumentException {
        SAXReader x = new SAXReader();
        Document doc = x.read(new File("src/c2stage_20220503/ccc188xml_search/ccc004Contacts2.xml"));
        Element rootElement = doc.getRootElement();
        List<Node> nodes = rootElement.selectNodes("./contact/name");// 使用相对路径定位元素
        for (Node node : nodes) {
            // 本质上，这里的node都是节点的意思
            // 因此可以进行强转操作
            Element node1 = (Element) node;
            System.out.println(node1.getTextTrim());// 获取内部的变量名
        }
    }

    @Test
    public void show3() throws DocumentException {
        SAXReader x = new SAXReader();
        Document doc = x.read(new File("src/c2stage_20220503/ccc188xml_search/ccc004Contacts2.xml"));
        List<Node> nodes = doc.selectNodes("//name");// 只要包含name，就可以直接获取元素
        for (Node node : nodes) {
            // 本质上，这里的node都是节点的意思
            // 因此可以进行强转操作
            Element node1 = (Element) node;
            System.out.println(node1.getTextTrim());// 获取内部的变量名
        }
    }

    @Test
    public void show4() throws DocumentException {
        SAXReader x = new SAXReader();
        Document doc = x.read(new File("src/c2stage_20220503/ccc188xml_search/ccc004Contacts2.xml"));
        List<Node> nodes = doc.selectNodes("//@id");// 获取所有包含id的元素
        for (Node node : nodes) {
            // 这里获取的是id，是元素中的属性，所以也可以直接获取
            Attribute attr = (Attribute) node;
            System.out.println(attr.getName() + "--" + attr.getValue());
        }
        Node res = doc.selectSingleNode("//name[@id]");// 查询，这个是查询单个元素，有多个返回第一条
        // List<Node> res = doc.selectNodes("//name[@id]");// 查询，name中包含id的元素
        // List<Node> res = doc.selectNodes("//name[@id=888]");// 定位id为888的元素


    }
}
