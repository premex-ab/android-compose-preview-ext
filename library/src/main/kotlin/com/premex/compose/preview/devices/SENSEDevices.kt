package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SENSE device specifications for Android Compose previews.
 *
 * This extension provides SENSE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SENSE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SENSE: Any
  get() = object {
      /** SENSE TW102 */
      val TW102 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
