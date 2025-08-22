package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Quest device specifications for Android Compose previews.
 *
 * This extension provides Quest device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Quest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Quest: Any
  get() = object {
      /** Quest Amber */
      val AMBER = "spec:width=480,height=960,unit=px,dpi=213"

      /** Quest Vibe */
      val VIBE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
