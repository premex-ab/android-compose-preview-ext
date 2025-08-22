package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JVC device specifications for Android Compose previews.
 *
 * This extension provides JVC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JVC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JVC: Any
  get() = object {
      /** DeviceSpec(manufacturer=JVC, code=anaheim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=anaheim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=AV-08NT310, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=AV-08NT310, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val AV_08NT310 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=JVC, code=AV-10NT310, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=AV-10NT310, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AV_10NT310 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JVC, code=AV-11NT510, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=AV-11NT510, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val AV_11NT510 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=JVC, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=bruno, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=bruno, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=Cunda, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=Cunda, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CUNDA = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=JVC, code=elliniko, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=elliniko, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=expo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=expo, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val EXPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=gangbyeon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=gangbyeon, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=guandu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=guandu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=komagome, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=komagome, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=mateo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=mateo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=mountbaker, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=mstarnapoli_atsc, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=mstarnapoli_atsc,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val MSTARNAPOLI_ATSC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=osaki, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=osaki, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=pioneer, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=pioneer, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=sadang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=sadang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SADANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=seocho, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=seocho, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=shilin, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=shilin, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=sindorim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=sindorim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=sugamo, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=sugamo, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SUGAMO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=SW6H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=SW6H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=tabata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=tabata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TABATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=tennoji, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=tennoji, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TENNOJI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=JVC, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=yeongdeungpo, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=JVC, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JVC, code=zhongshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
