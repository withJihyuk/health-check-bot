package org.jihyuklab.discordbot

import oshi.SystemInfo
import oshi.hardware.GlobalMemory

class SystemInfo (
    private val systemInfo: SystemInfo = SystemInfo()
) {
    fun getAvailableMemoryGigabyte(): Double = byteToGigabyte(getMemory().available)

    fun getCpuUsage() = systemInfo.hardware.processor.getSystemCpuLoad(10)

    fun getIpAddress() = systemInfo.hardware.networkIFs

    private fun getMemory(): GlobalMemory = systemInfo.hardware.memory

    private fun byteToGigabyte(byteNumber: Long): Double =
        byteNumber.toDouble() / 1024 / 1024 / 1024
}