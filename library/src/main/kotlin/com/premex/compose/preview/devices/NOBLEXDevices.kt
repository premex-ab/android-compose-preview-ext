package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOBLEX device specifications for Android Compose previews.
 *
 * This extension provides NOBLEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOBLEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOBLEX: Any
  get() = object {
      /** NOBLEX A50UNS */
      val A50UNS = "spec:width=480,height=854,unit=px,dpi=240"

      /** NOBLEX A60UNS */
      val A60UNS = "spec:width=480,height=960,unit=px,dpi=240"

      /** NOBLEX N405 */
      val N405 = "spec:width=480,height=800,unit=px,dpi=240"

      /** NOBLEX N503 */
      val N503 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NOBLEX N504 */
      val N504 = "spec:width=480,height=854,unit=px,dpi=240"

      /** NOBLEX N551 */
      val N551 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NOBLEX N552 */
      val N552 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** NOBLEX N601 */
      val N601 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** NOBLEX NOBLEX_B30 */
      val NOBLEX_B30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** NOBLEX NOBLEX_N52 */
      val NOBLEX_N52 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** NOBLEX NOBLEX_N62 */
      val NOBLEX_N62 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** NOBLEX R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** NOBLEX sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** NOBLEX Tablet */
      val TABLET = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NOBLEX TN11A6128 */
      val TN11A6128 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
