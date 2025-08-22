package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JP-IK device specifications for Android Compose previews.
 *
 * This extension provides JP-IK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JpIk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JpIk: Any
  get() = object {
      /** JP-IK JP_MOVE_S101 */
      val JP_MOVE_S101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
