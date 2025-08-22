package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Onkyo device specifications for Android Compose previews.
 *
 * This extension provides Onkyo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Onkyo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Onkyo: Any
  get() = object {
      /** Onkyo Gravity_128 */
      val GRAVITY_128 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Onkyo Rai_Zin2R_64 */
      val RAI_ZIN2R_64 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Onkyo Rai_Zin_32 */
      val RAI_ZIN_32 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
