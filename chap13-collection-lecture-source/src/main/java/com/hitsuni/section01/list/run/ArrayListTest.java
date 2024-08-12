package com.hitsuni.section01.list.run;

import com.hitsuni.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<BookDTO> bookList = new ArrayList<>();

        /* 1. add() : ArrayList에 추가할 수 있다. */
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 60000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 70000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 32000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 14000));

        for(BookDTO dto : bookList)
            System.out.println(dto);

        System.out.println();

        /* 2. add(index num, Element e) : ArrayList에 원하는 인덱스에 추가할 수 있다.*/
        bookList.add(3, new BookDTO(10, "조선왕조실록", "왕가", 192000));

        for(BookDTO dto : bookList)
            System.out.println(dto);

        System.out.println();

        /* 3. remove() : ArrayList에 원하는 인덱스의 객체를 삭제한다. */
        bookList.remove(3);

        for(BookDTO dto : bookList)
            System.out.println(dto);

        System.out.println();

        /* 4. set() : ArrayList에 원하는 인덱스의 객체를 수정할 수 있음 */
        bookList.set(1, new BookDTO(1, "너에게 닿기를", "만화가", 8000));
        for(BookDTO dto : bookList)
            System.out.println(dto);

        System.out.println();

        /* 5. get() : ArrayList에 원하는 인덱스의 객체를 가져올 수 있다. */
        System.out.println(bookList.get(0));
    }
}
