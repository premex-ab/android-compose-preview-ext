package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TrueVision device specifications for Android Compose previews.
 *
 * This extension provides TrueVision device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TrueVision.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TrueVision: Any
  get() = object {
      /** TrueVision TV_A01 */
      val TV_A01 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
