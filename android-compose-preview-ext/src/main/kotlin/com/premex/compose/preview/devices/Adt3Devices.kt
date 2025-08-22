package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADT-3 device specifications for Android Compose previews.
 *
 * This extension provides ADT-3 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Adt3.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Adt3: Any
  get() = object {
      /** ADT-3 adt3 */
      val ADT3 = "spec:width=720,height=1280,unit=px,dpi=240"

  }
