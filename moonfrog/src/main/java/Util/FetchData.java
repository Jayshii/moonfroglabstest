package Util;

import com.google.api.services.sheets.v4.model.BatchGetValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;
import service.GoogleSheetService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FetchData {
    public List<ValueRange> getData() throws Exception{
        List<String> ranges = Arrays.asList("A1","Z50");
        BatchGetValuesResponse readResult = GoogleSheetService.setup().spreadsheets().values()
                .batchGet(GoogleSheetService.SPREADSHEET_ID)
                .setRanges(ranges)
                .execute();

        return readResult.getValueRanges();
    }

}
