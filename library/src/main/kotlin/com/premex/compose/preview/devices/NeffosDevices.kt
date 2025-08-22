package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Neffos device specifications for Android Compose previews.
 *
 * This extension provides Neffos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Neffos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Neffos: Any
  get() = object {
      /** Neffos A5 */
      val A5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Neffos C5 */
      val C5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Neffos C5a */
      val C5A = "spec:width=480,height=854,unit=px,dpi=240"

      /** Neffos C5s */
      val C5S = "spec:width=480,height=854,unit=px,dpi=240"

      /** Neffos C5_Max */
      val C5_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Neffos C5_Plus */
      val C5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** Neffos C7 */
      val C7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Neffos C7A */
      val C7A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Neffos C7s */
      val C7S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Neffos C7_Lite */
      val C7_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Neffos C9 */
      val C9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Neffos C9A */
      val C9A = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Neffos C9s */
      val C9S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Neffos C9_Max */
      val C9_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Neffos N1 */
      val N1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Neffos X1 */
      val X1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Neffos X1_Lite */
      val X1_LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Neffos X1_Max */
      val X1_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Neffos X20 */
      val X20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Neffos X20_Pro */
      val X20_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Neffos X9 */
      val X9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Neffos Y5 */
      val Y5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Neffos Y50 */
      val Y50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Neffos Y5i */
      val Y5I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Neffos Y5L */
      val Y5L = "spec:width=480,height=854,unit=px,dpi=240"

      /** Neffos Y5s */
      val Y5S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Neffos Y5_Lite */
      val Y5_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** Neffos Y6 */
      val Y6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Neffos Y7 */
      val Y7 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
