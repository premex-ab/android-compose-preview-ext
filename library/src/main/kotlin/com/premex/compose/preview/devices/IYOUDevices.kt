package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iYOU device specifications for Android Compose previews.
 *
 * This extension provides iYOU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IYOU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IYOU: Any
  get() = object {
      /** iYOU A10 */
      val A10 = "spec:width=480,height=960,unit=px,dpi=200"

      /** iYOU A30 */
      val A30 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
