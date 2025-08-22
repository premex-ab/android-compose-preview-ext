package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Technocrat device specifications for Android Compose previews.
 *
 * This extension provides Technocrat device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Technocrat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Technocrat: Any
  get() = object {
      /** Technocrat SC777 */
      val SC777 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
