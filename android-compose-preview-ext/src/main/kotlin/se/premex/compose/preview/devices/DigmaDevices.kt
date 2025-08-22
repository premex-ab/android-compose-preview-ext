package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DIGMA device specifications for Android Compose previews.
 *
 * This extension provides DIGMA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digma.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digma: Any
  get() = object {
      /** DIGMA CS1114ML */
      val CS1114ML = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DIGMA CS1194MG */
      val CS1194MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA CS1195MG */
      val CS1195MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA CS1196ML */
      val CS1196ML = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA CS1207MG */
      val CS1207MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA CS1210MG */
      val CS1210MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA CS1219PL */
      val CS1219PL = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DIGMA CS1232MG */
      val CS1232MG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA CS1235PL */
      val CS1235PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA CS1272PL */
      val CS1272PL = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DIGMA CS3001ML */
      val CS3001ML = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DIGMA CS3242ML */
      val CS3242ML = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DIGMA CS6063ML */
      val CS6063ML = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DIGMA CS7113PL */
      val CS7113PL = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DIGMA CS7193MG */
      val CS7193MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA CS7204MG */
      val CS7204MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA CS7208MG */
      val CS7208MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA CS7216MG */
      val CS7216MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA CS7217PL */
      val CS7217PL = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DIGMA CS7234PL */
      val CS7234PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DIGMA CS8152ML */
      val CS8152ML = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DIGMA CS8205PG */
      val CS8205PG = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DIGMA CS8206MG */
      val CS8206MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA CS8218PL */
      val CS8218PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DIGMA CS8231PL */
      val CS8231PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA CS8233MG */
      val CS8233MG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA CS8268PL */
      val CS8268PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DIGMA CS8271PL */
      val CS8271PL = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DIGMA HT4039PG */
      val HT4039PG = "spec:width=480,height=800,unit=px,dpi=240"

      /** DIGMA HT5035PG */
      val HT5035PG = "spec:width=480,height=854,unit=px,dpi=240"

      /** DIGMA LS4051MG */
      val LS4051MG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DIGMA LS5040PL */
      val LS5040PL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DIGMA LS5041PL */
      val LS5041PL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DIGMA LS5053ML */
      val LS5053ML = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DIGMA LT4038PG */
      val LT4038PG = "spec:width=480,height=854,unit=px,dpi=240"

      /** DIGMA LT4049PG */
      val LT4049PG = "spec:width=480,height=800,unit=px,dpi=240"

      /** DIGMA LT4054MG */
      val LT4054MG = "spec:width=480,height=854,unit=px,dpi=240"

      /** DIGMA LT5052ML */
      val LT5052ML = "spec:width=480,height=960,unit=px,dpi=240"

      /** DIGMA NS1800ML */
      val NS1800ML = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DIGMA PS1135MG */
      val PS1135MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA PS1137MG */
      val PS1137MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA PS1150ML */
      val PS1150ML = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DIGMA PS1163MG */
      val PS1163MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA PS1164ML */
      val PS1164ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PS1166ML */
      val PS1166ML = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DIGMA PS1173PL */
      val PS1173PL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA PS1185MG */
      val PS1185MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA PS1187MG */
      val PS1187MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA PS1201PG */
      val PS1201PG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA PS1202PL */
      val PS1202PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PS1213PG */
      val PS1213PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PS7159PG */
      val PS7159PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA PS7165MG */
      val PS7165MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA PS7180PG */
      val PS7180PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA PS7191PL */
      val PS7191PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PS7192PL */
      val PS7192PL = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DIGMA PS7210PG */
      val PS7210PG = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DIGMA PS8156ML */
      val PS8156ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PS8161PG */
      val PS8161PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PS8162PL */
      val PS8162PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PS8163PL */
      val PS8163PL = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DIGMA PS8181MG */
      val PS8181MG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PS8199ML */
      val PS8199ML = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA PS8212PG */
      val PS8212PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PS9146MG */
      val PS9146MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA PS9167PG */
      val PS9167PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA PT1138MG */
      val PT1138MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA PT1139PL */
      val PT1139PL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA RS1248PL */
      val RS1248PL = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DIGMA RS1249PL */
      val RS1249PL = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DIGMA RS1253PL */
      val RS1253PL = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DIGMA RS1267PL */
      val RS1267PL = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DIGMA TS1184MG */
      val TS1184MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA TS1186MG */
      val TS1186MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DIGMA TS1190ML */
      val TS1190ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS1215PG */
      val TS1215PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS1220PG */
      val TS1220PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS1221PL */
      val TS1221PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS1228PL */
      val TS1228PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS1229PL */
      val TS1229PL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DIGMA TS1245PG */
      val TS1245PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS1246PG */
      val TS1246PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS1266RW */
      val TS1266RW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS1269PL */
      val TS1269PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DIGMA TS1273PL */
      val TS1273PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS1277ML */
      val TS1277ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS7175MG */
      val TS7175MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TS7177MG */
      val TS7177MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TS7179ML */
      val TS7179ML = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TS7198PG */
      val TS7198PG = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DIGMA TS7203MG */
      val TS7203MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TS7203RW */
      val TS7203RW = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TS7222PG */
      val TS7222PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TS7224PL */
      val TS7224PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS7225PL */
      val TS7225PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DIGMA TS7243PG */
      val TS7243PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TS7244PG */
      val TS7244PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TS8211PG */
      val TS8211PG = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DIGMA TS8226PL */
      val TS8226PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS8227PL */
      val TS8227PL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DIGMA TS8274AW */
      val TS8274AW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TS8275ML */
      val TS8275ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIGMA TT1188PL */
      val TT1188PL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TT1192PG */
      val TT1192PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TT1236PG */
      val TT1236PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TT7174PG */
      val TT7174PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA TT7223PG */
      val TT7223PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DIGMA VS5035ML */
      val VS5035ML = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DIGMA VS5036PL */
      val VS5036PL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DIGMA WS1250PL */
      val WS1250PL = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
