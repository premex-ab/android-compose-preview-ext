package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LYOTECH_LABS device specifications for Android Compose previews.
 *
 * This extension provides LYOTECH_LABS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LyotechLabs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LyotechLabs: Any
  get() = object {
      /** LYOTECH_LABS LFi_ONE */
      val LFI_ONE = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
