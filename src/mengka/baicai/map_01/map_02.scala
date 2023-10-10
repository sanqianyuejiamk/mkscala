package mengka.baicai.map_01

/**
 *  map�Ļ���ʹ��
 *
 */
object map_02 {

  def main(args: Array[String]): Unit = {

    val footballTeamsAFCEast =
      Map("New England" -> "Patriots",
        "New York" -> "Jets",
        "Buffalo" -> "Bills",
        "Miami" -> "Dolphins�ײ�",
        "Los Angeles" -> null)

        
    /**
     *   Some(Dolphins�ײ�)
     *   Dolphins�ײ�
     *
     */
    println(footballTeamsAFCEast.get("Miami"))
    println(footballTeamsAFCEast.get("Miami").get)

    /**
     *  map�У�value == nullʱ��
     *
     *            ���ص��ǣ� Some(null)
     *
     */
    println(footballTeamsAFCEast.get("Los Angeles"))

    
    /**
     *   map�У������ڸ�keyʱ��
     *
     *           ���ص��ǣ�  None
     */
    println(footballTeamsAFCEast.get("mengka"))
    
  }
}