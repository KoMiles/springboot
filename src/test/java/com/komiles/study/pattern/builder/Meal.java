package com.komiles.study.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author komiles@163.com
 * @date 2020-05-25 15:34
 */
public class Meal {
    private List<Item> itemList = new ArrayList<Item>();

    public void showItems(){
        for (Item item:itemList){
            System.out.println("商品名称:"+item.name());
            System.out.println("包装:"+item.packing().pack());
            System.out.println("价格:"+item.price());
            System.out.println("\n");
        }

    }

    /**
     * 添加数据
     * @param item
     */
    public void addItem(Item item){
        itemList.add(item);
    }

    /**
     * 获取价格
     * @return
     */
    public Float getCost(){
        Float cost = 0.0F;
        for(Item item:itemList) {
            cost += item.price();
        }
        return cost;
    }
}
