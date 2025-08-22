package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tagtech device specifications for Android Compose previews.
 *
 * This extension provides Tagtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tagtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tagtech: Any
  get() = object {
      /** Tagtech Tagphone_plus */
      val TAGPHONE_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

  }
