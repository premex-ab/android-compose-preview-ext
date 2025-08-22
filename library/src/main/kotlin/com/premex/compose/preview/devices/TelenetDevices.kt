package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * telenet device specifications for Android Compose previews.
 *
 * This extension provides telenet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telenet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telenet: Any
  get() = object {
      /** telenet sti6160d332 */
      val STI6160D332 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
