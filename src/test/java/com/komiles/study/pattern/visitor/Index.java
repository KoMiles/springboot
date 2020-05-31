package com.komiles.study.pattern.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 意图：主要将数据结构与数据操作分离。
 *
 * 主要解决：稳定的数据结构和易变的操作耦合问题。
 * 关键代码：在数据基础类里面有一个方法接受访问者，将自身引用传入访问者。
 *
 * 应用实例：您在朋友家做客，您是访问者，朋友接受您的访问，您通过朋友的描述，然后对朋友的描述做出一个判断，这就是访问者模式。
 *
 * 优点：
 * 1、符合单一职责原则。
 * 2、优秀的扩展性。
 * 3、灵活性。
 *
 * 缺点：
 * 1、具体元素对访问者公布细节，违反了迪米特原则。
 * 2、具体元素变更比较困难。
 * 3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
 * @author komiles@163.com
 * @date 2020-05-31 23:34
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Index {

    @Test
    public void test(){
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
