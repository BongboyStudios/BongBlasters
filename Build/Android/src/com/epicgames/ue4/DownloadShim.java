package com.epicgames.ue4;

import BongboyStudios.Bongblasters.OBBDownloaderService;
import BongboyStudios.Bongblasters.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

