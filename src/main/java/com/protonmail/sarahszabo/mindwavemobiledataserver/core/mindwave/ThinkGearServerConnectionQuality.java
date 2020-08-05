/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protonmail.sarahszabo.mindwavemobiledataserver.core.mindwave;

/**
 * An enum representing the connection quality of the ThinkGear Connector to the
 * MindWave Mobile
 *
 * @author Sarah Szabo <SarahSzabo@Protonmail.com>
 */
public enum ThinkGearServerConnectionQuality {
    /**
     * Optimal probe position; clear data.
     */
    OPTIMAL,
    /**
     * Sub-Optimal; alter probe position.
     */
    SUB_OPTIMAL,
    /**
     * Poor Connection; alter probe position.
     */
    POOR,
    /**
     * Disconnected; No EEG Data; alter probe position.
     */
    DISCONNECTED;
}
