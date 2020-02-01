package service;

import Util.SheetsServiceUtil;
import com.google.api.services.sheets.v4.Sheets;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class GoogleSheetService {
    private static Sheets sheetsService;
    public static String SPREADSHEET_ID = "1er_hWK1iarUIyc5GQ4-Qzp8B6K94AhkDrz-9QFgB0Tw";

    public static Sheets setup() throws GeneralSecurityException, IOException {
        sheetsService = SheetsServiceUtil.getSheetsService();
        return sheetsService;
    }
}
