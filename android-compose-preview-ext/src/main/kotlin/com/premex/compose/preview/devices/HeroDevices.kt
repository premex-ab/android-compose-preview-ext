package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HERO device specifications for Android Compose previews.
 *
 * This extension provides HERO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hero.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hero: Any
  get() = object {
      /** HERO HERO_4ALL */
      val HERO_4ALL = "spec:width=480,height=960,unit=px,dpi=240"

  }
