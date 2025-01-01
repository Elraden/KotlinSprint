package org.example.lesson_11.lesson11_task5

class MemberBuilder(
    private val forum: Forum) {
    private var userName: String = ""

    fun setUserName(name: String): MemberBuilder {
        userName = name
        return this
    }

    fun create(): ForumMember {
        val user = ForumMember(forum.userIdCounter++, userName)
        forum.members.add(user)
        return user
    }
}