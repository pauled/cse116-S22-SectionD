package LO2_OOP

object RunPlayer {
  def main(args: Array[String]): Unit = {
    val player1:Player=new Player(0.0,0.0,
      10)
    val player2:Player=new Player(7.0,-4.0,
      10)
    player1.attack(player2)
    player1.attack(player2)
    val player3:Player=player2
    player3.move(3.0,3.0)
    println(player3)
    var hp1:HealthPotion=
        new HealthPotion(0,0,10)
    hp1.move(2,3)
    var t1:Transporter=new
        Transporter(0,0,3.0,4.0)
    t1.move(5,6)
    println(t1)
  }

}
