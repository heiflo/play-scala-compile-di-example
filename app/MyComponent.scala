import play.api.libs.mailer._

class MyComponent(mailerClient: MailerClient) {

  def sendEmail = {
    val email = Email("Simple email", "Mister FROM <from@email.com>", Seq("Miss TO <to@email.com>"), bodyText = Some("A text message"))
    mailerClient.send(email)
  }

}