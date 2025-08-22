package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XMOBILE device specifications for Android Compose previews.
 *
 * This extension provides XMOBILE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XMOBILE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XMOBILE: Any
  get() = object {
      /** XMOBILE X10Max */
      val X10MAX = "spec:width=800,height=1280,unit=px,dpi=200"

      /** XMOBILE X55NALU */
      val X55NALU = "spec:width=480,height=960,unit=px,dpi=213"

      /** XMOBILE X55USA */
      val X55USA = "spec:width=480,height=960,unit=px,dpi=213"

      /** XMOBILE X63 */
      val X63 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** XMOBILE X63Pro */
      val X63PRO = "spec:width=720,height=1520,unit=px,dpi=280"

      /** XMOBILE X8Max */
      val X8MAX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** XMOBILE X8Pro */
      val X8PRO = "spec:width=800,height=1280,unit=px,dpi=220"

      /** XMOBILE X8Pronus */
      val X8PRONUS = "spec:width=800,height=1280,unit=px,dpi=210"

      /** XMOBILE XMOBILE */
      val XMOBILE = "spec:width=800,height=1280,unit=px,dpi=200"

      /** XMOBILE Xmobile_X2 */
      val XMOBILE_X2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** XMOBILE Xmobile_X2_US */
      val XMOBILE_X2_US = "spec:width=480,height=960,unit=px,dpi=240"

      /** XMOBILE Xmovi_X8 */
      val XMOVI_X8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** XMOBILE X_55B */
      val X_55B = "spec:width=480,height=960,unit=px,dpi=213"

      /** XMOBILE X_55_A */
      val X_55_A = "spec:width=480,height=960,unit=px,dpi=213"

      /** XMOBILE X_63_B_ProB */
      val X_63_B_PROB = "spec:width=720,height=1520,unit=px,dpi=280"

      /** XMOBILE X_63_ProA */
      val X_63_PROA = "spec:width=720,height=1520,unit=px,dpi=280"

  }
