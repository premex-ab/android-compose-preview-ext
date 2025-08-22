package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TONE device specifications for Android Compose previews.
 *
 * This extension provides TONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tone: Any
  get() = object {
      /** TONE TONE_e19 */
      val TONE_E19 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** TONE TONE_e20 */
      val TONE_E20 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** TONE TONE_e21 */
      val TONE_E21 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TONE TONE_e22 */
      val TONE_E22 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TONE TONE_m15 */
      val TONE_M15 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
