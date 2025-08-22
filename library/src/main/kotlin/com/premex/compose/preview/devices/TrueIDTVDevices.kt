package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TrueIDTV device specifications for Android Compose previews.
 *
 * This extension provides TrueIDTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TrueIDTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TrueIDTV: Any
  get() = object {
      /** TrueIDTV HP4CE-Truevisions */
      val HP4CE_TRUEVISIONS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TrueIDTV SEI600TID */
      val SEI600TID = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
