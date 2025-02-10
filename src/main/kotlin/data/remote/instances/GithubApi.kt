package data.remote.instances

import data.models.Repository
import data.remote.generic.ApiRequestInterface
import kotlin.js.json

class GithubApi : ApiRequestInterface()
{
    override val domain: String = "https://api.github.com"

    suspend fun getRepositories(): Array<Repository> =
        toModel<Array<Repository>>(
            response = get(
                url = "$domain/users/cromega08/repos?apiVersion=2022-11-28&sort=created&direction=desc&per_page=100",
                headers = json(
                    "Content-Type" to "application/json",
                    "Accept" to "application/json"
                ),
                errorText = "Unable to get projects information"
            )
        )
}