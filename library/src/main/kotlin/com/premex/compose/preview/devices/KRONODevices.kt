package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KRONO device specifications for Android Compose previews.
 *
 * This extension provides KRONO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KRONO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KRONO: Any
  get() = object {
      /** KRONO COLORS */
      val COLORS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KRONO KIDS_COLORS_PLUS */
      val KIDS_COLORS_PLUS = "spec:width=600,height=1024,unit=px,dpi=130"

      /** KRONO KIDS_FIVE */
      val KIDS_FIVE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KRONO MATRIX_PRO */
      val MATRIX_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** KRONO NETWORK */
      val NETWORK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KRONO NET_ADVANCE */
      val NET_ADVANCE = "spec:width=480,height=1014,unit=px,dpi=213"

      /** KRONO NET_ALPHA */
      val NET_ALPHA = "spec:width=720,height=1640,unit=px,dpi=320"

      /** KRONO NET_HIT */
      val NET_HIT = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KRONO NET_K7 */
      val NET_K7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** KRONO NET_K7_PLUS */
      val NET_K7_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KRONO NET_LITE */
      val NET_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** KRONO NET_MAX */
      val NET_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KRONO Net_Max_Go */
      val NET_MAX_GO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KRONO NET_ONE */
      val NET_ONE = "spec:width=480,height=800,unit=px,dpi=240"

      /** KRONO NET_R7 */
      val NET_R7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** KRONO NET_TITAN */
      val NET_TITAN = "spec:width=480,height=960,unit=px,dpi=240"

      /** KRONO NET_VOLT */
      val NET_VOLT = "spec:width=480,height=996,unit=px,dpi=240"

      /** KRONO NET_X2 */
      val NET_X2 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** KRONO NET_Y */
      val NET_Y = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KRONO ULTRA */
      val ULTRA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
