package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LiteTEL device specifications for Android Compose previews.
 *
 * This extension provides LiteTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Litetel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Litetel: Any
  get() = object {
      /** LiteTEL X20 */
      val X20 = "spec:width=480,height=960,unit=px,dpi=240"

  }
