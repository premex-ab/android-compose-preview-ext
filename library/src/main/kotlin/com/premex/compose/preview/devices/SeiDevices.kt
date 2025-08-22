package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEI device specifications for Android Compose previews.
 *
 * This extension provides SEI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sei: Any
  get() = object {
      /** SEI ST4500 */
      val ST4500 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SEI TT02 */
      val TT02 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
