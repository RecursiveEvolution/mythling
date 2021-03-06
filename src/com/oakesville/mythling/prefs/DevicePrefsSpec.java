/**
 * Copyright 2014 Donald Oakes
 *
 * This file is part of Mythling.
 *
 * Mythling is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Mythling is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Mythling.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.oakesville.mythling.prefs;

import java.util.Map;

public interface DevicePrefsSpec {
    
    /**
     * android.os.Build.MANUFACTURER, android.os.Build.MODEL
     */
    public boolean appliesToDevice(String manufacturer, String model);
    
    /**
     * resource id of preference headers
     */
    public int getPrefsHeadersResource();
    
    /**
     * map of specialized default prefs values
     */
    public Map<String,Object> getDefaultValues();
    
    /**
     * whether web links can be opened in an external browser
     */
    public boolean supportsWebLinks();
    
}
