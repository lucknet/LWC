/**
 * This file is part of LWC (https://github.com/Hidendra/LWC)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.griefcraft.spout;

import com.griefcraft.bukkit.LWCSpoutPlugin;
import com.griefcraft.lwc.LWCPopupScreen;
import org.getspout.spoutapi.event.screen.ButtonClickEvent;
import org.getspout.spoutapi.event.screen.ScreenListener;

public class SpoutScreenListener extends ScreenListener {

    /**
     * The plugin object
     */
    private LWCSpoutPlugin plugin;

    public SpoutScreenListener(LWCSpoutPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onButtonClick(ButtonClickEvent event) {
        if (event.getScreen() instanceof LWCPopupScreen) {
            ((LWCPopupScreen) event.getScreen()).onButtonClicked(event);
        }
    }

}
