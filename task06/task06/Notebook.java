package task06;

import java.util.*;

public class Notebook {
    String processor;
    String ram;
    String hdd;
    String videoCard;
    String motherboard;

    public Notebook(String processor,
            String ram,
            String hdd,
            String videoCard,
            String motherboard) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.videoCard = videoCard;
        this.motherboard = motherboard;
    }

    public static void Processor(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.processor.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void Ram(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.ram.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void Hdd(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.hdd.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void VideoCard(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.videoCard.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void Motherboard(Set<Notebook> notebooks, String input, Map<String, Notebook> result) {
        Integer count = 1;
        for (Notebook notebook : notebooks) {
            if (notebook.motherboard.contains(input)) {
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Processor: %s\nRAM: %s\nHDD: %s\nVideoCard: %s\nMorherboard: %s", processor, ram, hdd,
                videoCard, motherboard);
    }

}