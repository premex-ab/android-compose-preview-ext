package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ROKiT device specifications for Android Compose previews.
 *
 * This extension provides ROKiT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rokit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rokit: Any
  get() = object {
      /** ROKiT Chinchilla */
      val CHINCHILLA = "spec:width=480,height=854,unit=px,dpi=240"

      /** ROKiT Dingo */
      val DINGO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ROKiT Emu */
      val EMU = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** ROKiT Gecko */
      val GECKO = "spec:width=480,height=960,unit=px,dpi=240"

  }
