package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CLOVERTEK device specifications for Android Compose previews.
 *
 * This extension provides CLOVERTEK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CLOVERTEK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CLOVERTEK: Any
  get() = object {
      /** CLOVERTEK G65 */
      val G65 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
