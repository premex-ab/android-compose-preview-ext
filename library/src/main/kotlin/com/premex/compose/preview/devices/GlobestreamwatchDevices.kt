package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GlobeStreamwatch device specifications for Android Compose previews.
 *
 * This extension provides GlobeStreamwatch device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Globestreamwatch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Globestreamwatch: Any
  get() = object {
      /** GlobeStreamwatch SEI530G */
      val SEI530G = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
