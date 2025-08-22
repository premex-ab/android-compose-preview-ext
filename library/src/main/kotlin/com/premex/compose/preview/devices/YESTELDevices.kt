package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YESTEL device specifications for Android Compose previews.
 *
 * This extension provides YESTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YESTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YESTEL: Any
  get() = object {
      /** YESTEL T13_EEA */
      val T13_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** YESTEL T13_US */
      val T13_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** YESTEL T15_EEA */
      val T15_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** YESTEL T15_US */
      val T15_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** YESTEL T5 */
      val T5 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** YESTEL T5_EEA */
      val T5_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** YESTEL T5-plus */
      val T5_PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** YESTEL T5-plus-EEA */
      val T5_PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** YESTEL X2_EEA */
      val X2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** YESTEL X2_US */
      val X2_US = "spec:width=800,height=1280,unit=px,dpi=200"

      /** YESTEL X3_EEA */
      val X3_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** YESTEL X9_EEA */
      val X9_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** YESTEL X9_US */
      val X9_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
