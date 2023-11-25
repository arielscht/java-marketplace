package com.marketplace.models;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public abstract class Loadable {
    protected void loadData(String path) {
        try (Scanner scanner = new Scanner(Paths.get(path))) {
            if (scanner.hasNextLine())
                scanner.nextLine();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                this.handleParts(parts);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // protected void loadData(String path) {

    // }

    protected abstract void handleParts(String[] parts);
}