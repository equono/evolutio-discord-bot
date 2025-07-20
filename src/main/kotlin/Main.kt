package com.evolutio

import com.evolutio.bot.DiscordBot
import dev.kord.core.Kord
import kotlinx.coroutines.runBlocking

suspend fun main() {
    val kord = Kord(
        System.getenv("DISCORD_TOKEN")
            ?: throw IllegalStateException("DISCORD_TOKEN environment variable not set")
    )
    val bot = DiscordBot(kord)
    bot.registerSlashCommands()

    bot.login()

    Runtime.getRuntime().addShutdownHook(Thread {
        runBlocking {
            bot.logout()
        }
    })
}
