package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KTV device specifications for Android Compose previews.
 *
 * This extension provides KTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KTV: Any
  get() = object {
      /** KTV DV8219 */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
