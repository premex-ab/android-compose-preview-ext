package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIGMA device specifications for Android Compose previews.
 *
 * This extension provides DIGMA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIGMA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIGMA: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIGMA, code=CS1114ML, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1114ML, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val CS1114ML = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=CS1194MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1194MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CS1194MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS1195MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1195MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CS1195MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS1196ML, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1196ML, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CS1196ML = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS1207MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1207MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CS1207MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS1210MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1210MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CS1210MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS1219PL, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1219PL, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val CS1219PL = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DIGMA, code=CS1232MG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1232MG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CS1232MG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=CS1235PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1235PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CS1235PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=CS1272PL, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS1272PL, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val CS1272PL = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DIGMA, code=CS3001ML, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS3001ML, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val CS3001ML = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=CS3242ML, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS3242ML, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val CS3242ML = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=CS6063ML, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS6063ML, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val CS6063ML = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=CS7113PL, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS7113PL, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val CS7113PL = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=CS7193MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS7193MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CS7193MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS7204MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS7204MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CS7204MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS7208MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS7208MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CS7208MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS7216MG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS7216MG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CS7216MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS7217PL, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS7217PL, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val CS7217PL = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DIGMA, code=CS7234PL, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS7234PL, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val CS7234PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=CS8152ML, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS8152ML, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val CS8152ML = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=CS8205PG, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS8205PG, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val CS8205PG = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=CS8206MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS8206MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CS8206MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=CS8218PL, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS8218PL, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val CS8218PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=CS8231PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS8231PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CS8231PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=CS8233MG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS8233MG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CS8233MG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=CS8268PL, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS8268PL, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val CS8268PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=CS8271PL, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=CS8271PL, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val CS8271PL = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DIGMA, code=HT4039PG, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=HT4039PG, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val HT4039PG = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=HT5035PG, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=HT5035PG, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HT5035PG = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=LS4051MG, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=LS4051MG, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LS4051MG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=LS5040PL, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=LS5040PL, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LS5040PL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=LS5041PL, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=LS5041PL, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LS5041PL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=LS5053ML, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=LS5053ML, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LS5053ML = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=LT4038PG, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=LT4038PG, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LT4038PG = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=LT4049PG, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=LT4049PG, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LT4049PG = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=LT4054MG, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=LT4054MG, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LT4054MG = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=LT5052ML, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=LT5052ML, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LT5052ML = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=NS1800ML, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=NS1800ML, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val NS1800ML = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1135MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1135MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PS1135MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1137MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1137MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PS1137MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1150ML, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1150ML, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PS1150ML = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1163MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1163MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PS1163MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1164ML, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1164ML, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS1164ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1166ML, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1166ML, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PS1166ML = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1173PL, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1173PL, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PS1173PL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1185MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1185MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PS1185MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1187MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1187MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PS1187MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1201PG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1201PG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PS1201PG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1202PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1202PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS1202PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS1213PG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS1213PG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS1213PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS7159PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS7159PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PS7159PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS7165MG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS7165MG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PS7165MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS7180PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS7180PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PS7180PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS7191PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS7191PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS7191PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS7192PL, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS7192PL, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val PS7192PL = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS7210PG, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS7210PG, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val PS7210PG = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS8156ML, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS8156ML, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS8156ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS8161PG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS8161PG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS8161PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS8162PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS8162PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS8162PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS8163PL, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS8163PL, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val PS8163PL = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=PS8181MG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS8181MG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS8181MG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS8199ML, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS8199ML, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PS8199ML = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS8212PG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS8212PG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS8212PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PS9146MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS9146MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PS9146MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PS9167PG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PS9167PG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PS9167PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=PT1138MG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PT1138MG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PT1138MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=PT1139PL, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=PT1139PL, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PT1139PL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=RS1248PL, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=RS1248PL, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val RS1248PL = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DIGMA, code=RS1249PL, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=RS1249PL, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val RS1249PL = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DIGMA, code=RS1253PL, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=RS1253PL, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val RS1253PL = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DIGMA, code=RS1267PL, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=RS1267PL, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val RS1267PL = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1184MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1184MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TS1184MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1186MG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1186MG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TS1186MG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1190ML, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1190ML, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1190ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1215PG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1215PG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1215PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1220PG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1220PG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1220PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1221PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1221PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1221PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1228PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1228PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1228PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1229PL, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1229PL, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TS1229PL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1245PG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1245PG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1245PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1246PG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1246PG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1246PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1266RW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1266RW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1266RW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1269PL, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1269PL, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TS1269PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1273PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1273PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1273PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS1277ML, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS1277ML, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS1277ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7175MG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7175MG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7175MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7177MG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7177MG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7177MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7179ML, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7179ML, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7179ML = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7198PG, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7198PG, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TS7198PG = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7203MG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7203MG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7203MG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7203RW, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7203RW, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7203RW = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7222PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7222PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7222PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7224PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7224PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS7224PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7225PL, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7225PL, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TS7225PL = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7243PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7243PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7243PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS7244PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS7244PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TS7244PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TS8211PG, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS8211PG, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val TS8211PG = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=TS8226PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS8226PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS8226PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS8227PL, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS8227PL, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TS8227PL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIGMA, code=TS8274AW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS8274AW, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS8274AW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TS8275ML, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TS8275ML, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TS8275ML = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIGMA, code=TT1188PL, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TT1188PL, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TT1188PL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TT1192PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TT1192PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TT1192PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TT1236PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TT1236PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TT1236PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TT7174PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TT7174PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TT7174PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=TT7223PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=TT7223PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TT7223PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIGMA, code=VS5035ML, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=VS5035ML, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VS5035ML = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=VS5036PL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=VS5036PL, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VS5036PL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIGMA, code=WS1250PL, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGMA, code=WS1250PL, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val WS1250PL = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
