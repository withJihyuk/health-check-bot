package org.jihyuklab.discordbot

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class CustomCommands : ListenerAdapter() {
    override fun onSlashCommandInteraction(event: SlashCommandInteractionEvent) {
        when (event.name) {
            "고양이" -> {
                event.reply("https://cataas.com/cat").queue()
            }
        }
    }
}