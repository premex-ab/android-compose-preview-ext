package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RAKUTEN device specifications for Android Compose previews.
 *
 * This extension provides RAKUTEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RAKUTEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RAKUTEN: Any
  get() = object {
      /** RAKUTEN Banagher */
      val BANAGHER = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** RAKUTEN Chara */
      val CHARA = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** RAKUTEN JeridL */
      val JERIDL = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** RAKUTEN Nee */
      val NEE = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** RAKUTEN Recoa */
      val RECOA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** RAKUTEN SH-RM11 */
      val SH_RM11 = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** RAKUTEN SH-RM12 */
      val SH_RM12 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** RAKUTEN SX1 */
      val SX1 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** RAKUTEN SX3 */
      val SX3 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** RAKUTEN VG2 */
      val VG2 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
