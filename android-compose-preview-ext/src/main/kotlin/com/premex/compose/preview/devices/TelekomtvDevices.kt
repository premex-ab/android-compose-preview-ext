package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TelekomTV device specifications for Android Compose previews.
 *
 * This extension provides TelekomTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telekomtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telekomtv: Any
  get() = object {
      /** TelekomTV DV8519B-Telekom */
      val DV8519B_TELEKOM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TelekomTV SEI800DT-Telekom */
      val SEI800DT_TELEKOM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
