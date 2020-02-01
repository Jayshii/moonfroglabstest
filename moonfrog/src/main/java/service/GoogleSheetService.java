package service;

import Util.SheetsServiceUtil;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class GoogleSheetService {
    private static Sheets sheetsService;
    public static String SPREADSHEET_ID = "1er_hWK1iarUIyc5GQ4-Qzp8B6K94AhkDrz-9QFgB0Tw";

    @BeforeClass
    public static void setup() throws GeneralSecurityException, IOException {
        sheetsService = SheetsServiceUtil.getSheetsService();
    }
}
