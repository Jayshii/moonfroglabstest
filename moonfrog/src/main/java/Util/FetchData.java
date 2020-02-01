package Util;

import service.GoogleSheetService;

import java.time.temporal.ValueRange;
import java.util.ArrayList;

public class FetchData {
    public ArrayList<ValueRange> getData() {
        String range = "Class Data";
        BatchGetValuesResponse readResult = sheetsService.spreadsheets().values()
                .batchGet(GoogleSheetService.SPREADSHEET_ID)
                .setRanges(range)
                .execute();

        return readResult.getValueRanges();
    }

}
