package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZIOVO device specifications for Android Compose previews.
 *
 * This extension provides ZIOVO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ziovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ziovo: Any
  get() = object {
      /** ZIOVO Z118-EEA */
      val Z118_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZIOVO Z118-US */
      val Z118_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZIOVO Z118-U-EEA */
      val Z118_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZIOVO Z118-U-US */
      val Z118_U_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZIOVO Z128_EEA */
      val Z128_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** ZIOVO Z128_T_EEA */
      val Z128_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZIOVO Z128_T_US */
      val Z128_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZIOVO Z128_US */
      val Z128_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** ZIOVO Z138_EEA */
      val Z138_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZIOVO Z138_US */
      val Z138_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZIOVO Z168_EEA */
      val Z168_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZIOVO Z168_US */
      val Z168_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZIOVO Z168_U_EEA */
      val Z168_U_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZIOVO Z168_U_US */
      val Z168_U_US = "spec:width=800,height=1280,unit=px,dpi=160"

  }
