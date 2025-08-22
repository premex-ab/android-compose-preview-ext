package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TAG-DC device specifications for Android Compose previews.
 *
 * This extension provides TAG-DC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TAGDC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TAGDC: Any
  get() = object {
      /** TAG-DC TAG-DC */
      val TAG_DC = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
