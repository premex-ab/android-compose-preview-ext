package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smart device specifications for Android Compose previews.
 *
 * This extension provides Smart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smart: Any
  get() = object {
      /** Smart hero_A1 */
      val HERO_A1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Smart Smart_Hero_II */
      val SMART_HERO_II = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Smart Smart_PRIME_II */
      val SMART_PRIME_II = "spec:width=480,height=960,unit=px,dpi=240"

  }
