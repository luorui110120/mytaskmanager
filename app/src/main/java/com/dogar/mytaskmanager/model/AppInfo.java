package com.dogar.mytaskmanager.model;

import android.graphics.drawable.Drawable;
import android.net.Uri;


import lombok.Data;

@Data
public class AppInfo {
	private Uri    icon;
	private String taskName;
	private int    pid;
	private int    memoryInMb;
}