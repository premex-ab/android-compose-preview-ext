package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Antel device specifications for Android Compose previews.
 *
 * This extension provides Antel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Antel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Antel: Any
  get() = object {
      /** Antel Antel_B866V2FAS */
      val ANTEL_B866V2FAS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Antel DV8547 */
      val DV8547 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
