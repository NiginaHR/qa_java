package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;


 class TestAlexFriends {

    @Test

     void showGetFriends() throws Exception {

        Alex alex = new Alex(new Feline());
        List<String> friends = alex.getFriends();
        assertEquals(List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман"),friends);
    }

}





