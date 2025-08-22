package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NewBridge device specifications for Android Compose previews.
 *
 * This extension provides NewBridge device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newbridge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newbridge: Any
  get() = object {
      /** NewBridge NBTB101 */
      val NBTB101 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** NewBridge NBTB102 */
      val NBTB102 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
