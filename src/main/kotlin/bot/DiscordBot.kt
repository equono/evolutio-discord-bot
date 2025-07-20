package com.evolutio.bot

import dev.kord.core.Kord
import dev.kord.core.event.gateway.ReadyEvent
import dev.kord.core.on

class DiscordBot {
    val kord: Kord

    constructor(kord: Kord) {
        this.kord = kord
    }

    suspend fun login() {
        kord.on<ReadyEvent> {
            println("Logged in as ${kord.getSelf().tag}")
        }

        kord.login()
    }

    suspend fun registerSlashCommands() {
        println("Registering slash commands...")

        kord.createGlobalChatInputCommand(
            name = "example",
            description = "whatever",
        ) {
            println("** Function called **")
        }
    }

    suspend fun logout() {
        println("Logging out...")
        kord.logout()
    }
}
