package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLACK_SHARK device specifications for Android Compose previews.
 *
 * This extension provides BLACK_SHARK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BlackShark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BlackShark: Any
  get() = object {
      /** BLACK_SHARK Pad6 */
      val PAD6 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
