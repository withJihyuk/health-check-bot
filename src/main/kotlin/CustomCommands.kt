package org.jihyuklab.discordbot

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import java.net.InetAddress

class CustomCommands : ListenerAdapter() {
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        when (event.name) {
            "고양이" -> {
                event.reply("https://cataas.com/cat").queue()
            }
            "아이피" -> {
                val address = InetAddress.getLocalHost().toString()
                event.reply(address).queue()
            }
            "점유율" -> {
                val systemInfo = SystemInfo()
                event.reply("사용 가능 메모리: ${systemInfo.getAvailableMemoryGigabyte()}GB, CPU 사용량: ${systemInfo.getCpuUsage()}").queue()
            }
        }
    }
}