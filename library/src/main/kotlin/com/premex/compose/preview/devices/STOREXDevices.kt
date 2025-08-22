package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STOREX device specifications for Android Compose previews.
 *
 * This extension provides STOREX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STOREX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STOREX: Any
  get() = object {
      /** STOREX MDDDI13310 */
      val MDDDI13310 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** STOREX MDDDI13311 */
      val MDDDI13311 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
