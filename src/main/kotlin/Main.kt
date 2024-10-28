package org.jihyuklab.discordbot

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.interactions.commands.build.Commands
import net.dv8tion.jda.api.requests.GatewayIntent

fun main() {
    val builder = JDABuilder.createDefault(
        System.getenv("DISCORD_BOT_TOKEN"),
        GatewayIntent.GUILD_MESSAGES,
    )
        .build()
    builder.addEventListener(CustomCommands())
    builder.updateCommands().addCommands(
        Commands.slash("고양이", "고양이를 보여줍니다."),
        Commands.slash("점유율", "ㅇㅅㅇ")
    ).queue()
}