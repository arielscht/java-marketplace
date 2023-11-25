package com.marketplace.models;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public abstract class Loadable {
    // protected void loadData(String path) {
    // try (Scanner scanner = new Scanner(Paths.get(path))) {
    // if (scanner.hasNextLine())
    // scanner.nextLine();

    // while (scanner.hasNextLine()) {
    // String line = scanner.nextLine();
    // String[] parts = line.split(";");
    // this.handleParts(parts);
    // }
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }

    protected void loadData(String path) {
        try (JsonReader reader = Json.createReader(new FileReader(path))) {
            JsonArray jsonArray = reader.readArray();

            for (JsonObject jsonCategory : jsonArray.getValuesAs(JsonObject.class))
                this.handleJson(jsonCategory);

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception according to your application's requirements
        }
    }

    protected abstract void handleJson(JsonObject jsonCategory);
}