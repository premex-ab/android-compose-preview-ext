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
 * @Preview(device = Devices.Jvc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jvc: Any
  get() = object {
      /** JVC anaheim */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC AV-08NT310 */
      val AV_08NT310 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** JVC AV-10NT310 */
      val AV_10NT310 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JVC AV-11NT510 */
      val AV_11NT510 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** JVC bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC Cunda */
      val CUNDA = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** JVC elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** JVC expo */
      val EXPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC mstarnapoli_atsc */
      val MSTARNAPOLI_ATSC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC osaki */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC sadang */
      val SADANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC seocho */
      val SEOCHO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC sugamo */
      val SUGAMO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC tabata */
      val TABATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC tennoji */
      val TENNOJI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** JVC yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JVC zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
