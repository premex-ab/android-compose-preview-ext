package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cherrymobile device specifications for Android Compose previews.
 *
 * This extension provides Cherrymobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cherrymobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cherrymobile: Any
  get() = object {
      /** Cherrymobile Aqua_S9_Max */
      val AQUA_S9_MAX = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Cherrymobile Flare_S8_Prime */
      val FLARE_S8_PRIME = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Cherrymobile Flare_S8_Pro */
      val FLARE_S8_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Cherrymobile Flare_Y6_Pro */
      val FLARE_Y6_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Cherrymobile Flare_Y7_Pro */
      val FLARE_Y7_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Cherrymobile Pulse */
      val PULSE = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Cherrymobile Superion_Tab_Pro */
      val SUPERION_TAB_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
