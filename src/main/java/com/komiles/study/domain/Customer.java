package com.komiles.study.domain;

import lombok.Data;

/**
 * @author komiles@163.com
 * @date 2020-09-25 19:20
 */
@Data
public class Customer {
    private String name;

    private Integer total;

    private Integer balance;

    public Customer(String name, Integer total, Integer balance) {
        this.name = name;
        this.total = total;
        this.balance = balance;
    }

    public static Customer merge(Customer first, Customer second) {
        first.setTotal(first.getTotal() + second.getTotal());
        first.setBalance(first.getBalance() + second.getBalance());
        return first;
    }
}
