package ru.suvorov.learnup.hl3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        Player gordon = new Player("Gordon");
        players.add(gordon);

        Main.load("Gordon");

        System.out.println(gordon);

        gordon.setArmor(100);
        Main.save(gordon);
        Main.load("Gordon");

        System.out.println(gordon);

    }

    private static void save(Player player) {
        File file = new File(player.getName() + ".save");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            if (!file.exists()) file.createNewFile();
            oos.writeObject(player);
        } catch (IOException e) {
            System.out.println("Не удается сохраненить игру!");
        }
    }

    private static Player load(String playerName) {
        File file = new File(playerName + ".save");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Player player = (Player) ois.readObject();
            return player;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Не удалось загрузить игру!");
            return null;
        }
    }
}
