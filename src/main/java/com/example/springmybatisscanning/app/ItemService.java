package com.example.springmybatisscanning.app;

import com.example.springmybatisscanning.items.Item;
import com.example.springmybatisscanning.items.ItemMapper;
import org.springframework.stereotype.Service;


@Service
public class ItemService {

    final
    ItemMapper itemMapper;

    public ItemService(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

    public void displayItems(){
        System.out.println("======================= all items: ====================");
        for (Item item : itemMapper.findAll()) {
            System.out.println(item);
        }
        System.out.println("========================================================");
    }
}
