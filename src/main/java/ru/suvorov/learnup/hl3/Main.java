package ru.suvorov.learnup.hl3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        Player gordon = new Player("Gordon");
        players.add(gordon);

        try {
            Main.save(gordon);
        } catch (IOException e) {
            System.out.println("Проблема с сохранением файла!");
        }

    }

    private static void save(Player player) throws IOException {
        File file = new File(player.getName() + ".txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

    }

    private static void load(Player player) {

    }
}
