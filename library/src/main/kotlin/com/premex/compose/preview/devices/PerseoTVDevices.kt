package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PerseoTV device specifications for Android Compose previews.
 *
 * This extension provides PerseoTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PerseoTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PerseoTV: Any
  get() = object {
      /** PerseoTV DV8219 */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
