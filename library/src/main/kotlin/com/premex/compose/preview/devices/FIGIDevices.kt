package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FIGI device specifications for Android Compose previews.
 *
 * This extension provides FIGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FIGI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FIGI: Any
  get() = object {
      /** FIGI Mtwo */
      val MTWO = "spec:width=480,height=960,unit=px,dpi=240"

      /** FIGI Note_11_Pro */
      val NOTE_11_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** FIGI Note_1C */
      val NOTE_1C = "spec:width=720,height=1560,unit=px,dpi=320"

      /** FIGI Note_1_Lite */
      val NOTE_1_LITE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** FIGI Note_3_Pro */
      val NOTE_3_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** FIGI Note_5 */
      val NOTE_5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** FIGI Note_7_Pro */
      val NOTE_7_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
