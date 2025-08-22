package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iQandT device specifications for Android Compose previews.
 *
 * This extension provides iQandT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iqandt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iqandt: Any
  get() = object {
      /** iQandT G3 */
      val G3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
